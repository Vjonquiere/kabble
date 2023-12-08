package View

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import model.Game
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

class Game {
    var needRefresh: MutableState<Boolean> = mutableStateOf(true)
    val game = Game(10, needRefresh)

    @OptIn(ExperimentalResourceApi::class)
    @Composable
    fun draw(){
        if (needRefresh.value) {
            game.view = this
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

                        Card(game, true).draw(game.player1.arrayInt)
                        Card(game, false).draw(game.middle.arrayInt)


                    }

                }

            }
            needRefresh.value = false
        } else {
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

                        Card(game, true).draw(game.player1.arrayInt)
                        Card(game, false).draw(game.middle.arrayInt)

                    }

                }

            }
        }
    }
}