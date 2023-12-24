package com.harc.mytalkapp.presentation.Navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.harc.mytalkapp.presentation.Navigation.Graph
import com.harc.mytalkapp.presentation.Navigation.screens.AuthScreen
import com.harc.mytalkapp.presentation.screens.game.GameScreen
import com.harc.mytalkapp.presentation.screens.login.LoginScreen

fun NavGraphBuilder.AuthNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.AUTH,
        startDestination = AuthScreen.Login.route
    ){
        composable(route = AuthScreen.Login.route){
            LoginScreen(navController)
        }
        composable(route = AuthScreen.Game.route){
            GameScreen(navController)
        }
    }
}
