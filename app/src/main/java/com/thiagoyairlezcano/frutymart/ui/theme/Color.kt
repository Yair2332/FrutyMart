package com.thiagoyairlezcano.frutymart.ui.theme

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val pastelGradient = Brush.linearGradient(
    colors = listOf(
        Color(0xFFFCEFF9), // rosado claro
        Color(0xFFE0F7FA)  // celeste suave
    ),
    start = Offset(0f, 0f),
    end = Offset(1000f, 1000f)
)