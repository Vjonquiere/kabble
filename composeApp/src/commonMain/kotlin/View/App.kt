package View

import Greeting
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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

    MaterialTheme {
        Column(Modifier.fillMaxWidth().fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Kabble")
            Row (modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically) {
                Column(modifier = Modifier.padding(0.dp, 100.dp).fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                    Button(onClick = { println("singleplayer") }) { Text(text = "Singleplayer") }
                    Button(onClick = { println("multiplayer") }) { Text(text = " Multiplayer ") }
                    Button(onClick = { println("leaderboard") }) { Text(text = "Leaderboard") }
                }
            }


        }
    }
}
