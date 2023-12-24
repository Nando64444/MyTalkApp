package com.harc.mytalkapp.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.harc.mytalkapp.ui.theme.Blue50

@Composable
fun DefaultButtom(
    modifier: Modifier,
    text: String,
    onClick: () -> Unit,
    color: Color = Blue50,
    icon: ImageVector?
) {
    Button(
        modifier = modifier.fillMaxWidth(),
        onClick = { onClick() },
        colors = ButtonDefaults.buttonColors(backgroundColor = color)
    ) {
        // Verifica si se proporciona un icono personalizado, de lo contrario, usa el predeterminado
        icon?.let {
            Icon(imageVector = it, contentDescription = "")
        }
        Text(text = text)
    }
}