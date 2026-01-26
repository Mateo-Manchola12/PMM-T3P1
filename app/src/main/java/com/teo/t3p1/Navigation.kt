package com.teo.t3p1

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.teo.t3p1.screens.Screen1
import com.teo.t3p1.screens.Screen2
import com.teo.t3p1.screens.Screen3

@Composable
fun Navigation(navigationController: NavHostController) {
    NavHost(
        navController = navigationController,
        startDestination = Routes.Screen1.route
    ) {
        composable(route = Routes.Screen1.route) {
            Screen1(navigationController)
        }
        composable(
            route = Routes.Screen2.route,
            arguments = listOf(navArgument(name = "number") { type = NavType.IntType })
        ) { backStackEntry ->
            Screen2(
                navigationController,
                number = backStackEntry.arguments?.getInt("number")!!
            )
        }
        composable(
            route = Routes.Screen3.route,
            arguments = listOf(navArgument(name = "number") { defaultValue = 4 })
        ) { backStackEntry ->
            Screen3(
                navigationController,
                number = backStackEntry.arguments?.getInt("number")!!
            )
        }
    }
}
