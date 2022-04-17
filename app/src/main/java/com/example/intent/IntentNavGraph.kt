package com.example.intent

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun IntentNavGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    )
    {
        composable(route = Screen.Home.route){
            HomeScreen(navController = navController)
        }
        composable(route = Screen.Profile.route){
           ProfileScreen(navController = navController)
        }
        composable(route = Screen.Settings.route){
            SettingsScreen(navController = navController)
        }
    }

}