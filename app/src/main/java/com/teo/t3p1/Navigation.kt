package com.teo.t3p1

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.teo.t3p1.Screens.Screen1
import com.teo.t3p1.Screens.Screen2
import com.teo.t3p1.Screens.Screen3

@Composable
fun Navigation(navigationController: NavHostController) {
    NavHost(
        navController = navigationController,
        startDestination = Routes.Screen1.route
    ) {
        composable(route = Routes.Screen1.route) {
            Screen1(navigationController)
        }
        composable(route = Routes.Screen2.route) {
            Screen2(navigationController)
        }
        composable(route = Routes.Screen3.route) {
            Screen3(navigationController)
        }
    }
}
