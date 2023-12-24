package com.harc.mytalkapp.presentation.screens.game.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.harc.mytalkapp.presentation.resource.GameResources
import com.harc.mytalkapp.presentation.screens.game.GameViewModel


@Composable
fun GameContent(paddingValues: PaddingValues, vm: GameViewModel = hiltViewModel()) {
    val rows = GameResources.resources.chunked(3)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
            .verticalScroll(rememberScrollState()), // Agrega desplazamiento vertical si es necesario
        verticalArrangement = Arrangement.Center
    ) {
        // Agrega el texto "Mis palabras" en la parte superior con estilo de título
        Text(
            text = "Mis palabras",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp, bottom = 2.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            color = Color.Black // Puedes personalizar el color aquí
        )

        for (rowResources in rows) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp), // Ajusta la separación vertical según sea necesario
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                for (resource in rowResources) {
                    val imageBitmap = ImageBitmap.imageResource(resource.image)
                    val aspectRatio = imageBitmap.width.toFloat() / imageBitmap.height.toFloat()

                    Image(
                        bitmap = imageBitmap,
                        contentDescription = null,
                        modifier = Modifier
                            .width(80.dp)
                            .aspectRatio(aspectRatio)
                            .clip(MaterialTheme.shapes.medium) // Aplica recorte
                            .clickable { vm.playSound(resource.sound) }
                    )
                }
            }
        }
    }
}
