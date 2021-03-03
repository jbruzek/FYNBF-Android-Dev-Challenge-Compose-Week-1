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

import androidx.compose.foundation.shape.GenericShape

val HeaderShape = GenericShape { size, _ ->
    val intermediateHeight = size.height * 0.7f

    moveTo(0f, 0f)
    lineTo(0f, size.height)
    cubicTo(size.width * 0.5f, size.height, size.width * 0.5f, intermediateHeight, size.width, intermediateHeight)
    lineTo(size.width, 0f)
}

val HeaderShapeReverse = GenericShape { size, _ ->
    val intermediateHeight = size.height * 0.7f

    moveTo(0f, 0f)
    lineTo(0f, intermediateHeight)
    cubicTo(size.width * 0.5f, intermediateHeight, size.width * 0.5f, size.height, size.width, size.height)
    lineTo(size.width, 0f)
}

val BackgroundShape = GenericShape { size, _ ->
    val intermediateHeight = size.height * 0.7f
    val intermediateWidth = size.width * 0.6f

    moveTo(0f, 0f)
    lineTo(0f, intermediateHeight)
    cubicTo(intermediateWidth, intermediateHeight, 0f, size.height, intermediateWidth, size.height)
    cubicTo(size.width, size.height, size.width, size.height, size.width, size.height * 0.5f)
    lineTo(size.width, 0f)
}
