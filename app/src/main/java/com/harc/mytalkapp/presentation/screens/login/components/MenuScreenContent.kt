package com.harc.mytalkapp.presentation.screens.login.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.mytalkapp.R
import com.harc.mytalkapp.presentation.Navigation.screens.AuthScreen
import com.harc.mytalkapp.presentation.components.DefaultButtom

@Composable
fun LoginContent(navController: NavHostController, paddingValues: PaddingValues) {
    var textColor by remember { mutableStateOf(Color.Black) }
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(450.dp) // Ajusta la altura del Box según tus necesidades
        ) {
            Image(
                modifier = Modifier
                    .fillMaxSize()
                    .align(Alignment.TopCenter),
                painter = painterResource(id = R.drawable.imagebeginning),
                contentDescription = "Imagen de fondo",
                contentScale = ContentScale.Crop,
                colorFilter = ColorFilter.colorMatrix(ColorMatrix().apply {
                    setToScale(redScale = 0.5f, 0.5f, 0.5f, 1f)
                })
            )
        }
        Card(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
                .height(350.dp),
            shape = RoundedCornerShape(
                topEnd = 40.dp,
                topStart = 40.dp
            ),
            backgroundColor = Color.Gray.copy(alpha = 0.7f)

        ) {
            Column(

                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 30.dp)
                    .padding(horizontal = 30.dp),


                ) {
                DefaultButtom(
                    modifier = Modifier,
                    text = "Play",
                    onClick = { navController.navigate(route = AuthScreen.Game.route) },
                    icon = Icons.Default.PlayArrow
                )
                Spacer(modifier = Modifier.height(5.dp))
                DefaultButtom(
                    modifier = Modifier,
                    text = "Configuración",
                    onClick = { },
                    icon = Icons.Default.Build
                )
                Spacer(modifier = Modifier.height(5.dp))
                DefaultButtom(
                    modifier = Modifier,
                    text = "Salir",
                    onClick = { /*TODO*/ },
                    icon = Icons.Outlined.ArrowBack
                )
                Spacer(modifier = Modifier.height(50.dp))
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally),
                    color = Color.Gray,
                    style = MaterialTheme.typography.h6.copy(
                        fontSize = 18.sp, // Puedes ajustar este valor según tus necesidades
                        fontWeight = FontWeight.Light
                    ),
                    text = "Ayuda"
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally),
                    style = MaterialTheme.typography.h6.copy(
                        fontSize = 18.sp, // Puedes ajustar este valor según tus necesidades
                        fontStyle = FontStyle.Italic
                    ),
                    text = "H.A.R.C S.A"
                )
            }
        }
    }
}




