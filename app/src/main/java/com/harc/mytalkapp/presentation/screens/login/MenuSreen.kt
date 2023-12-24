package com.harc.mytalkapp.presentation.screens.login

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.harc.mytalkapp.presentation.screens.login.components.LoginContent
import com.harc.mytalkapp.ui.theme.MyTalkAppTheme
import com.harc.mytalkapp.ui.theme.Yellow200

@Composable
fun LoginScreen(navController: NavHostController){
    Scaffold (
        backgroundColor = Yellow200
    ){paddingValues->
        LoginContent(navController = navController, paddingValues)


    }




}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    MyTalkAppTheme {
        LoginScreen(rememberNavController())
    }
}