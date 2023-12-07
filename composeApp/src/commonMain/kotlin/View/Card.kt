package View

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
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
            for (i in 1..15){
                Sprite(i).draw(Random.nextInt(50,250), Random.nextInt(50,250), Random.nextInt(50,100))
            }

        }

    }
}