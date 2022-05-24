package com.example.intent.navigation

const val PROFILE_ARGUMENT_KEY = "id"


const val SIGN_IN_SCREEN = "sign_in_screen"
const val LOG_IN_SCREEN = "log_in_screen"

const val HOME_SCREEN = "home_screen"


sealed class ScreenRoutes(var route:String){
    object Home : ScreenRoutes("home_screen")
    object Profile : ScreenRoutes("profile_screen")
    object Settings : ScreenRoutes("settings_screen")
    object SignIn : ScreenRoutes("sign_in_screen")
    object Login : ScreenRoutes("log_in_screen")
}
