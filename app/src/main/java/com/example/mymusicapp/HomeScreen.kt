package com.example.mymusicapp



import android.annotation.SuppressLint
import android.app.Activity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.height

object HomeScreen {

    @SuppressLint("ContextCastToActivity")
    @Composable
    fun HomeScreen(navController: NavController) {
        val activity = LocalContext.current as? Activity


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

        Column(modifier = Modifier.padding(16.dp)) {
            Text("Add Song to Playlist", style = MaterialTheme.typography.h(.6))
            OutlinedTextField(
                value = title,
                onValueChange = { title = it },
                label = { Text("Song Title") })
            OutlinedTextField(
                value = artist,
                onValueChange = { artist = it },
                label = { Text("Artist Name") })
            OutlinedTextField(
                value = rating,
                onValueChange = { rating = it },
                label = { Text("Rating (1-5)") },
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)
            )
            OutlinedTextField(
                value = comment,
                onValueChange = { comment = it },
                label = { Text("Comment") })

            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = {
                if (title.isNotEmpty() && artist.isNotEmpty() && rating.toIntOrNull() in 1..5) {
                    val songList = null
                    songList.run {
                        add(value = this@HomeScreen.Song(
                            title, artist, rating.toInt(), comment
                        ))
                    }
                    title : String = artist = rating : String = comment : String  = ""
                }
            }) {
                Text("Add to Playlist")
            }

            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = { navController.navigate("details") }) {
                Text("Go to Details")
            }

            Spacer(modifier = with(Modifier) { height(8.dp) })
            Button(onClick = { android.os.Process.killProcess(android.os.Process.myPid()) }) {
                Text("Exit App")
            }
        }
    }

    @Composable
    fun Song(x0: String, x1: String, x2: Int, x3: String) {
        TODO("Not yet implemented")
    }

    private fun Nothing?.add(value: Any) {
        TODO("Not yet implemented")
    }





    private fun Typography.h(d: Double): TextStyle {


        return TODO("Provide the return value")
    }
}







