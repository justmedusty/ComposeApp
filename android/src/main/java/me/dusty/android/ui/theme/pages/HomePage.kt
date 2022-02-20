package me.dusty.android.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import me.dusty.android.imageCardBuilder.ImageCard
import me.dusty.android.navigation.Screen

@Composable
fun HomeScreen(
    navController: NavController
) {
    Box(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxSize(),
        contentAlignment = Alignment.TopCenter

    ) {
        Text(
            text = "Home",
            color = MaterialTheme.colors.primary,
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold,

            )
        Spacer(Modifier.height(150.dp))
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Spacer(Modifier.height(75.dp))
            Row(
                modifier = Modifier
                    .fillMaxSize(1f),
                horizontalArrangement = Arrangement.Center

            ) {
                ImageCard(
                    painter = painterResource(id = me.dusty.android.R.drawable.kermit),
                    contentDescription = "Kermit being kermit",
                    title = "Kermit",
                    modifier = Modifier
                        .size(
                            width = 150.dp,
                            height = 150.dp
                        )
                        .clickable {
                            navController.navigate(route = Screen.KermitPage.route)
                        }

                )
                ImageCard(
                    painter = painterResource(id = me.dusty.android.R.drawable.watch),
                    contentDescription = "Kermit",
                    title = "Stopwatch",
                    modifier = Modifier
                        .size(
                            width = 150.dp,
                            height = 150.dp
                        )

                        .clickable {
                            navController.navigate(route = Screen.StopwatchScreen.route)

                        }
                )


            }


        }
    }
}
