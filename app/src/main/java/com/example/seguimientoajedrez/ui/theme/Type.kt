package com.example.seguimientoajedrez.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.seguimientoajedrez.R


// Set of Material typography styles to start with
private val lea = FontFamily(
    Font(R.font.leaguespartan_light,
        FontWeight.Light),

    Font(R.font.leaguespartan_regular,
        FontWeight.Normal),

    Font(R.font.leaguespartan_semibold,
        FontWeight.Bold)
)


val Typography = Typography(
//    bodyLarge = TextStyle(
//        fontFamily = FontFamily.Default,
//        fontWeight = FontWeight.Normal,
//        fontSize = 16.sp,
//        lineHeight = 24.sp,
//        letterSpacing = 0.5.sp
//    ),

    titleLarge = TextStyle(
        fontFamily = com.example.seguimientoajedrez.ui.theme.lea,
        fontWeight = FontWeight.Normal,
        fontSize = 30.sp,

        ),

    titleMedium = TextStyle(
        fontFamily = com.example.seguimientoajedrez.ui.theme.lea,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
    ),

    bodyLarge = TextStyle(
        fontFamily = com.example.seguimientoajedrez.ui.theme.lea,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
    )

    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)