package me.dusty.common.stopWatch

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun StopWatchDisplay(
    formattedTime : String,
    onStartClick: () -> Unit,
    onPauseClick: () -> Unit,
    onResetClick: () -> Unit,
    modifier : Modifier = Modifier

) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){

        Text(
            text = "Stop Watch",
            fontSize = 40.sp,
            color = Color.Black,
            fontStyle = FontStyle.Italic
        )
        Spacer(Modifier.height(160.dp))
        Text(
            text = formattedTime,
            fontSize = 60.sp,
            color = Color.Black

        )
        Spacer(Modifier.height(16.dp))
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier.fillMaxWidth()
        ){
            Button(onStartClick){
                Text("Start")
            }
            Spacer(Modifier.width(16.dp))
            Button(onPauseClick){
                Text("Pause")
            }
            Spacer(Modifier.width(16.dp))
            Button(onResetClick){
                Text("Reset")

            }
        }
    }
}