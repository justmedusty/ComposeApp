package me.dusty.android.ui.theme

import me.dusty.common.App
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.navigation.*
import androidx.navigation.compose.rememberNavController
import me.dusty.android.navigation.setupNavGraph


class MainActivity : AppCompatActivity() {
    private lateinit var navController : NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                navController = rememberNavController()
                setupNavGraph(navController)
            }
        }
    }
}