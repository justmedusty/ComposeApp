package me.dusty.android.ui.theme

import androidx.camera.core.Preview
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.text.font.FontWeight

@Composable
fun HomeScreen(){

    Box(
        modifier = Modifier.fillMaxSize()

    ){
        Text(
            text = "home",
            color = MaterialTheme.colors.primary,
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold

        )
    }

}
@Composable
fun DisplayHomeScreenPreview(){
    HomeScreen()
}