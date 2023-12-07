package View

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

class Card {
    @OptIn(ExperimentalResourceApi::class)
    @Composable
    fun draw(){
        Image(
            painter = painterResource("images/carte_empty.png"),
            contentDescription = "Empty card",
            modifier = Modifier.size(250.dp)
        )
    }
}