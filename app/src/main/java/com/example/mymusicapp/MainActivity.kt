package com.example.mymusicapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.mymusicapp.ui.theme.MyMusicAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppNavHost()
            }
        }
    }

fun Composable(string: String, function: Any) {


}

private fun Unit.NavHost(navController: NavHostController) {


}

fun NavHost() {


}

@Composable
fun AppNavHost(){
    val navController= rememberNavController()

    val navHost = NavHost().NavHost(navController = navController)
    var StartDestination = "Home"
    val function =
        { //Syntax error: Unexpected tokens (use ';' to separate expressions on the same line).
            Composable("Home") { HomeScreen }
            Composable("Second") { SecondScreen }

        }


}







