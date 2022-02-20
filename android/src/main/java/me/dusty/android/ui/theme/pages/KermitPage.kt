package me.dusty.android.ui.theme.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import me.dusty.android.R
import me.dusty.android.navigation.Screen

@Composable
fun KermitPage(
    navController: NavController
) {
    Box(
        modifier = Modifier.fillMaxSize(),

    ) {
        Image(
            painter = painterResource(R.drawable.kermit3),
            contentDescription = "big ol kermit",
            modifier = Modifier
                .fillMaxSize()
                .clickable {
                    navController.navigate(route = Screen.Home.route)
                }
        )

        Box(
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text(
                text = "Howdy Partner",
                textAlign = TextAlign.Center
            )
        }
    }
}