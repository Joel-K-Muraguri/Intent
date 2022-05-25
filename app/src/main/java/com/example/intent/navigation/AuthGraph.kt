package com.example.intent.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.intent.ui.theme.authentication.LogInScreen
import com.example.intent.ui.theme.authentication.SignInScreen


fun NavGraphBuilder.authGraph(
    navController: NavHostController
){
    navigation(
        startDestination = ScreenRoutes.Login.route,
        route = AUTHENTICATION_GRAPH
    ){
        composable(route = ScreenRoutes.Login.route){
            LogInScreen(navController = navController)
        }
        composable(route = ScreenRoutes.SignIn.route){
            SignInScreen(navController = navController)
        }
    }
}