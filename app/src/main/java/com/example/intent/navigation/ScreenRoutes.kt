package com.example.intent.navigation

const val ROOT_GRAPH = "root"
const val AUTHENTICATION_GRAPH = "authentication"
const val OTHER_SCREENS_GRAPH = "others"

sealed class ScreenRoutes(val route:String){
    object Home : ScreenRoutes("home_screen")
    object Profile : ScreenRoutes("profile_screen")
    object Settings : ScreenRoutes("settings_screen")
    object SignIn : ScreenRoutes("sign_in_screen")
    object Login : ScreenRoutes("log_in_screen")
}
