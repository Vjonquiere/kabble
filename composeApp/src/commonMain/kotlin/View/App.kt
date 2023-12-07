package View

import Greeting
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.load

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    val launch = mutableStateOf(false)
    MaterialTheme {
        Column(Modifier.fillMaxWidth().fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally) {

            if (!launch.value){
                Text(text = "Kabble")
                Row (modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically) {
                    Column(modifier = Modifier.padding(0.dp, 100.dp).fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                        Button(onClick = { launch.value = true }) { Text(text = "Singleplayer") }
                        Button(onClick = { println("multiplayer") }) { Text(text = " Multiplayer ") }
                        Button(onClick = { println("leaderboard") }) { Text(text = "Leaderboard") }
                    }
                }
            } else {
                Game().draw_default()
            }



        }
    }
}
