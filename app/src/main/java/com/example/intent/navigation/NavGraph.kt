package com.example.intent.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost


@Composable
fun NavGraph(
    navController: NavHostController)
{
    NavHost(
        navController = navController,
        startDestination = AUTHENTICATION_GRAPH,
        route = ROOT_GRAPH
    ){
        authGraph(navController = navController)
        otherScreens(navController = navController)
        
    }
}

