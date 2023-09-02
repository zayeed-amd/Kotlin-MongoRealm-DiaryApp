package com.example.diary.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.diary.presentation.screens.auth.AuthenticationScreen
import com.example.diary.util.Constants.WRITE_SCREEN_ARG_KEY

@Composable
fun SetupNavGraph(startDestination: String, navController: NavHostController){
    NavHost(startDestination = startDestination,
        navController = navController){
        // define all the screens our app will have within this composable function
        // call all the extension functions here
        authenticationRoute()
        homeRoute()
        writeRoute()
    }
}

// https://kotlinlang.org/docs/extensions.html
// extension functions

@OptIn(ExperimentalMaterial3Api::class)
fun NavGraphBuilder.authenticationRoute(){
    composable(route = Screen.Home.route){
        AuthenticationScreen(loadingState = false, onButtonClicked = {})
        println("authenticationRoute executed")
    }
}

@OptIn(ExperimentalMaterial3Api::class)
fun NavGraphBuilder.homeRoute(){
    composable(route = Screen.Home.route){
//        AuthenticationScreen(loadingState = false, onButtonClicked = {})
    }
}

fun NavGraphBuilder.writeRoute(){
    composable(
        route = Screen.Write.route,
        arguments = listOf(navArgument(name=WRITE_SCREEN_ARG_KEY){
            type = NavType.StringType
            nullable = true
            defaultValue = null
            })
        )
    {
    }
}
