package me.dusty.android.navigation

sealed class Screen(val route: String){
    object Home: Screen (route = "home_screen")
    object StopwatchScreen: Screen (route = "detail_screen")
    object KermitPage: Screen (route = "kermit_screen")
}
