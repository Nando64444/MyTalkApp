package com.harc.mytalkapp.presentation.components



import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import com.harc.mytalkapp.ui.theme.Blue500


@Composable
fun DefaultTextField(modifier: Modifier,
                     value: String,onValueChange:(value:String) -> Unit,
                     label:String,
                     icon: ImageVector,
                     keyboardType: KeyboardType = KeyboardType.Text,
                     hideText: Boolean = false,
                     textColor: Color = Blue500,
                     inputTextColor: Color = Color.Black


)
{

    OutlinedTextField(modifier = modifier,


        value = value,
        onValueChange = {
            onValueChange(it);
                        },
        label = {
            Text(text = label,
                color = textColor
            )
        },


        leadingIcon = {
            Icon(imageVector = icon, contentDescription = "",
                tint = Color.Gray
            )
        },
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
        visualTransformation = if (hideText) PasswordVisualTransformation()
        else VisualTransformation.None,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            textColor = inputTextColor
        )
    )
}