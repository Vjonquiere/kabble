package View

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import model.ClassicSpritePosition
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import kotlin.random.Random

class Card {
    @OptIn(ExperimentalResourceApi::class)
    @Composable
    fun draw(){
        Box(){
            Image(
                painter = painterResource("images/card_background.png"),
                contentDescription = "Empty card",
                modifier = Modifier.size(300.dp)
            )
            for (position in ClassicSpritePosition().generate_positions()){
                Sprite(Random.nextInt(1,15)).draw(position.get_x(), position.get_y(), Random.nextInt(60,75))
            }

            //Sprite(2).draw(60, 15, 75)
            //Sprite(2).draw(150, 20, 75)
            //Sprite(2).draw(10, 90, 75)
            //Sprite(2).draw(30, 170, 75)
            //Sprite(2).draw(100, 210, 75)
            //Sprite(2).draw(100, 100, 75)
            //Sprite(2).draw(210, 100, 75)
            //Sprite(2).draw(180, 180, 75)

        }

    }
}