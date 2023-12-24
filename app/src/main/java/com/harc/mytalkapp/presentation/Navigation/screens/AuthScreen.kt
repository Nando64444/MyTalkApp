package com.harc.mytalkapp.presentation.Navigation.screens

sealed class AuthScreen(val route: String){
    object Login: AuthScreen("login")
    object Game: AuthScreen("game")

}

