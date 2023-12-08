package View

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import model.Game
import model.Player
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

class Game {

    val game = Game(10)

    @OptIn(ExperimentalResourceApi::class)
    @Composable
    fun draw(){
        Box(modifier = Modifier.fillMaxSize()) {
            Box(modifier = Modifier.fillMaxSize()) {
                Image(
                    painterResource("images/background.png"),
                    contentDescription = "Background",
                    modifier = Modifier.fillMaxSize()
                )
            }

            Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
                Row(modifier = Modifier.fillMaxHeight(), verticalAlignment = Alignment.CenterVertically) {

                    Card(game).draw(game.player1.arrayInt)
                    Card(game).draw(game.middle.arrayInt)

                }

            }

        }
    }

}