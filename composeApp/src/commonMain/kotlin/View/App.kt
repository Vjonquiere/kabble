package View

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.ExperimentalResourceApi

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
                Game().draw()
            }



        }
    }
}
