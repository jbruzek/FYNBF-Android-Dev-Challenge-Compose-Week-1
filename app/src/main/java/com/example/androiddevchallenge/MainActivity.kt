/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.example.androiddevchallenge.ui.theme.*


class MainActivity : AppCompatActivity() {
    private val navigationViewModel by viewModels<Navigator>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = pink700.toArgb()

        val petsViewModel by viewModels<PetViewModel>()
        setContent {
            MyTheme {
                MyApp(navigationViewModel, petsViewModel)
            }
        }
    }

    override fun onBackPressed() {
        if (!navigationViewModel.onBack()) {
            super.onBackPressed()
        }
    }
}

@Composable
fun MyApp(navigator: Navigator, viewModel: PetViewModel) {
    val screen: Navigator.Screen by navigator.currentScreen.observeAsState(Navigator.Screen.LIST)
    Crossfade(screen) {
        Surface(color = MaterialTheme.colors.background) {
            when (it) {
                Navigator.Screen.LIST -> MainScreen(
                    viewModel = viewModel,
                    navigateTo = navigator::navigateTo
                )
                Navigator.Screen.DETAILS -> DetailsScreen(viewModel.getCurrentPet())
            }
        }
    }
}

@Composable
fun MainScreen(
    viewModel: PetViewModel,
    navigateTo: (Navigator.Screen) -> Unit
) {
    MainHeader(stringResource(com.example.androiddevchallenge.R.string.main_title), false)
    LazyColumn(
        contentPadding = PaddingValues(start = 16.dp, top = 64.dp, end = 16.dp, bottom = 16.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        itemsIndexed(pets) { i, pet ->
            PetListItem(pet) {
                viewModel.setCurrentPet(i)
                navigateTo(Navigator.Screen.DETAILS)
            }
        }
    }
}

@Composable
fun DetailsScreen(pet: Pet) {
    MainHeader("", true)
    BackgroundShape()
    Text(
        text = pet.name,
        style = typography.h2,
        color = Color.White,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp, 200.dp, 0.dp, 0.dp)
            .zIndex(9999f)
    )

    Column(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(pet.picture),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .clip(
                        RoundedCornerShape(
                            CornerSize(0),
                            CornerSize(0),
                            CornerSize(20),
                            CornerSize(0)
                        )
                    ).padding(0.dp, 36.dp, 0.dp, 0.dp)
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f)
                    .padding(0.dp, 36.dp, 0.dp, 0.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "${pet.age} years old",
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
                Text(
                    text = pet.sex,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
        Text(
            text = pet.bio,
            style = typography.body1,
            modifier = Modifier.padding(16.dp, 56.dp, 16.dp, 0.dp)
        )
    }
}

@Preview
@Composable
fun BackgroundShape() {
    val color = if (MaterialTheme.colors.isLight) {
            pink200
        } else {
            pink900
    }
    Image(
        painter = painterResource(com.example.androiddevchallenge.R.drawable.background_shape),
        colorFilter = ColorFilter.tint(color, BlendMode.SrcAtop),
        contentDescription = "",
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun MainHeader(text: String, reverse: Boolean) {
    Surface(color = Color.Transparent, modifier = Modifier
        .fillMaxWidth()
        .zIndex(99999f)) {
        Row(modifier = Modifier
            .background(
                shape = if (reverse) {
                    HeaderShapeReverse
                } else {
                    HeaderShape
                },
                color = MaterialTheme.colors.primary)
            .padding(16.dp)) {
            Text(
                text = text,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun PetListItem(model: Pet, onClick: () -> Unit) {
    val textColor = if (MaterialTheme.colors.isLight) {
        Color.DarkGray
    } else {
        Color.LightGray
    }
    Row(modifier = Modifier
        .fillMaxWidth()
        .clickable(onClick = onClick)) {
        Image(
            painter = painterResource(model.picture),
            contentDescription = "",
            modifier = Modifier
                .height(144.dp)
                .clip(RoundedCornerShape(16.dp))
        )
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = model.name,
                style = typography.h1
            )
            Text("${model.age} years old")
            Text(model.sex)
            Text(
                text = model.bio,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                style = typography.caption,
                color = textColor
            )
        }
    }
}

@Preview
@Composable
fun HeaderPreview() {
    MainHeader(text = "Main Header Text", false)
}

@Preview
@Composable
fun PetListItemPreview() {
    Surface(color = Color.White) {
        PetListItem(pets[0]) {}
    }
}

@Preview("DetailsScreen", widthDp = 360, heightDp = 640)
@Composable
fun DetailsScreenPreview() {
    Surface(color = MaterialTheme.colors.background) {
        DetailsScreen(pets[0])
    }
}
