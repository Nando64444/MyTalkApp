package com.harc.mytalkapp.presentation.screens.game

import androidx.compose.material.Scaffold
import androidx.compose.runtime.*
import androidx.navigation.NavHostController
import com.harc.mytalkapp.presentation.components.DefaultTopBar
import com.harc.mytalkapp.presentation.screens.game.Components.GameContent
import com.harc.mytalkapp.ui.theme.Yellow200

@Composable
fun GameScreen(navController: NavHostController){
    Scaffold(

        topBar = {
            DefaultTopBar(
                title = "Menu",
                upAvailable = true,
                navController = navController
            )
        },
        backgroundColor = Yellow200


    )

    { paddingValues ->
        GameContent(paddingValues = paddingValues)
    }
}

