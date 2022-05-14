package com.example.intent.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation

@Composable
fun NavGraphBuilder.RootGraph(
    navController: NavHostController
){
    navigation(
        startDestination = ScreenRoutes.SignIn.route,
        route = SIGN_IN_SCREEN
    ){


    }
}