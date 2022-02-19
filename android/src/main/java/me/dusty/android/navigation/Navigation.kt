package me.dusty.android.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import me.dusty.android.ui.theme.HomeScreen
import me.dusty.common.DetailScreen

@Composable
fun setupNavGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.Home.route
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController = navHostController)
        }
        composable(
            route = Screen.Detail.route
        ) {
            DetailScreen(navController = navHostController)
        }

    }


}