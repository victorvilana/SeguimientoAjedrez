package com.example.seguimientoajedrez.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Accessibility
import androidx.compose.material.icons.outlined.AddChart
import androidx.compose.material.icons.outlined.AddCircleOutline
import androidx.compose.material.icons.outlined.CalendarMonth
import androidx.compose.material.icons.outlined.SystemSecurityUpdate
import androidx.compose.material3.Icon
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import com.example.seguimientoajedrez.navigation.NavScreen

sealed class ItemsBottomNav(
    val icon: ImageVector,
    val title: String,
    val ruta: String
){
    object ItemBottom1: ItemsBottomNav(
        Icons.Outlined.CalendarMonth,
        "Torneos",
        NavScreen.TorneosScreen.name

    )

    object ItemBottom2: ItemsBottomNav(
        Icons.Outlined.AddCircleOutline,
        "Partidas",
        NavScreen.PartidasScreen.name

    )

    object ItemBottom3: ItemsBottomNav(
        Icons.Outlined.AddChart,
        "Rendimiento",
        NavScreen.RendimientoScreen.name
    )

}