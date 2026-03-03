package com.example.seguimientoajedrez.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.seguimientoajedrez.screens.ListTorneos
import com.example.seguimientoajedrez.screens.PartidasScreen
import com.example.seguimientoajedrez.screens.RendimientoScreen
import com.example.seguimientoajedrez.screens.TorneosScreen

@Composable
fun SeguimientoAjedrezNavigation(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = NavScreen.ListTorneosScreen.name,

    ){
        composable(
            NavScreen.ListTorneosScreen.name) {
                ListTorneos()
            }

        composable(
            NavScreen.TorneosScreen.name) {
            TorneosScreen()
        }

        composable(
            NavScreen.PartidasScreen.name) {
            PartidasScreen()
        }

        composable(
            NavScreen.RendimientoScreen.name) {
            RendimientoScreen()
        }


    }
}