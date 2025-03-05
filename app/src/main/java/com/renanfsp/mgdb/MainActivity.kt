package com.renanfsp.mgdb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.renanfsp.mgdb.ui.theme.MyGamesDatabaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyGamesDatabaseTheme {
                Navigator()
            }
        }
    }
}

@Composable
fun Navigator() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "welcome") {
        composable(route = "welcome") {
            Welcome(navController = navController)
        }
        composable(route = "register") {
            Register(navController = navController)
        }
        composable(route = "home") {
            Home()
        }
    }
}