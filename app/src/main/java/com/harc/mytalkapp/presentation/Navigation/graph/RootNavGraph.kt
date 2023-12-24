package com.harc.mytalkapp.presentation.Navigation.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.harc.mytalkapp.presentation.Navigation.Graph





@Composable
fun RootNavGraph(navController: NavHostController){
    NavHost(
        navController= navController,
        route = Graph.ROOT,
        startDestination = Graph.AUTH

    )
    {
        AuthNavGraph(navController = navController)
    }

}