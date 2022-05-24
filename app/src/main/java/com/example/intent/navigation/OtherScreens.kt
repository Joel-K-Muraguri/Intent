package com.example.intent.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.intent.ui.theme.screens.HomeScreen
import com.example.intent.ui.theme.screens.ProfileScreen
import com.example.intent.ui.theme.screens.SettingsScreen

@Composable
fun NavGraphBuilder.OtherScreens(
    navController: NavHostController
){
    navigation(
        startDestination = ScreenRoutes.Home.route,
        route = HOME_SCREEN,

    ){
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