package com.example.intent.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.intent.ui.theme.root.LogInScreen
import com.example.intent.ui.theme.root.SignInScreen

@Composable
fun NavGraphBuilder.RootGraph(
    navController: NavHostController
){
    navigation(
        startDestination = ScreenRoutes.Login.route,
        route = ScreenRoutes.Home.route
    ){
        composable(route = ScreenRoutes.Login.route){
            LogInScreen(navController = navController)
        }
        composable(route = ScreenRoutes.Login.route){
            SignInScreen(navController = navController)
        }


    }
}