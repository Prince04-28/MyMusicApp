package com.example.mymusicapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mymusicapp.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppNavHost()
            }
        }
    }

fun Composable(string: String, function: @Composable Any) {


}

private fun Unit.NavHost(navController: NavHostController) {


}

fun NavHost() {


}




@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "Home") {
        composable("Home") { HomeScreen(navController) }
        composable("Second") { SecondScreen(navController) }
    }
}

@Composable
fun HomeScreen(x0: NavHostController) {
    TODO("Not yet implemented")
}

@Composable
fun SecondScreen(x0: NavHostController) {
    TODO("Not yet implemented")
}






