package View

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import model.ClassicSpritePosition
import model.Game
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import kotlin.random.Random

class Card(val game: Game) {
    @OptIn(ExperimentalResourceApi::class)
    @Composable
    fun draw(cardArray: Array<Int>){
        Box(){
            Image(
                painter = painterResource("images/card_background.png"),
                contentDescription = "Empty card",
                modifier = Modifier.size(300.dp)
            )
            for (i in ClassicSpritePosition().generate_positions().indices){
                var pos = ClassicSpritePosition().generate_positions()
                Sprite(cardArray[i], game).draw(pos[i].get_x(), pos[i].get_y(), Random.nextInt(60,75))
            }

        }

    }
}