package com.example.seguimientoajedrez.components

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavController
import com.example.seguimientoajedrez.models.ItemsBottomNav
import com.example.seguimientoajedrez.navigation.CurrentRoute

@Composable
fun NavigationInferior (
    navController : NavController
    ){
        val MenuItems = listOf(
            ItemsBottomNav.ItemBottom1,
            ItemsBottomNav.ItemBottom2,
            ItemsBottomNav.ItemBottom3
        )

    BottomAppBar {
        NavigationBar() {
            MenuItems.forEach {item ->
                val selected=CurrentRoute(navController) == item.ruta
                NavigationBarItem(
                    selected = selected,
                    onClick = {navController.navigate(item.ruta)},
                    icon = {Icon(
                            imageVector = item.icon,
                            contentDescription = item.title
                        )
                    },
                    label ={Text(text = item.title)}
                )

            }
        }


    }

}