package com.example.intent.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.intent.ui.theme.screens.HomeScreen
import com.example.intent.ui.theme.screens.ProfileScreen
import com.example.intent.ui.theme.screens.SettingsScreen

@Composable
fun NavGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = ScreenRoutes.Home.route
    )
    {
        composable(route = ScreenRoutes.Home.route){
            HomeScreen(navController = navController)
        }
        composable(
            route = ScreenRoutes.Profile.route,
            /*arguments = listOf(
                navArgument(PROFILE_ARGUMENT_KEY){
                    type = NavType.IntType
                }
            ) */
        ){

           ProfileScreen(navController = navController)
        }
        composable(route = ScreenRoutes.Settings.route){
            SettingsScreen(navController = navController)
        }
    }
}