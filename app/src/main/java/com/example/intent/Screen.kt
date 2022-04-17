package com.example.intent

sealed class Screen(var route:String){
    object Home : Screen("home_screen")
    object Profile : Screen("profile_screen")
    object Settings : Screen("settings_screen")


}
