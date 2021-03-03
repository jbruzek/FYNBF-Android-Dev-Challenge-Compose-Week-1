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