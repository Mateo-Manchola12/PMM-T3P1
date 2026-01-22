package com.teo.t3p1

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun Navigation(navigationController: NavHostController) {
    NavHost(
        navController = navigationController,
        startDestination = "pantalla1"
    ) {

    }
}
