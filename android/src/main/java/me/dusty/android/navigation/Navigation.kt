package me.dusty.android.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import me.dusty.android.ui.theme.HomeScreen
import me.dusty.android.ui.theme.pages.KermitPage
import me.dusty.common.StopWatchScreen

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
            route = Screen.StopwatchScreen.route
        ) {
            StopWatchScreen(navController = navHostController)
        }
        composable(
            route = Screen.KermitPage.route
        ){
            KermitPage(navController = navHostController)
        }

    }


}