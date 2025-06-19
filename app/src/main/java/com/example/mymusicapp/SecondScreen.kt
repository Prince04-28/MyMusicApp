package com.example.mymusicapp


import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController

object SecondScreen {

    @Composable
    fun SecondScreen(navController: NavController) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Detailed View List")

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = {
                navController.popBackStack()
            }) {
                Text("Back to Main Screen")
            }
        }
    }

    private fun Typography.h(d: Double): TextStyle {

        return TODO("Provide the return value")
    }

    @Composable
    fun SecondScreen(navController: NavHostController) {
        var average by remember { mutableStateOf(0.0) }

        var title by remember {
            mutableStateOf("")
        }

        var artist by remember {
            mutableStateOf("")
        }

        var rating by remember {
            mutableStateOf("")
        }

        var comment by remember {
            mutableStateOf("")
        }

        val value = Text(
            "Playlist Details", style = MaterialTheme.run { typography.h(.6) }
        )}}











