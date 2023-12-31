package View

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import model.Game
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

class Sprite(var id:Int, var game: Game, var clickable: Boolean) {

    @OptIn(ExperimentalResourceApi::class)
    @Composable
    fun draw(x:Int, y:Int, size_t:Int){
        var link = StringBuilder()
        link.append("images/")
        link.append(id)
        link.append(".png")
        if (clickable){
            Image(painter = painterResource(link.toString()), contentDescription = "sprite", modifier = Modifier.size(size_t.dp).offset(x.dp, y.dp).clickable{ game.play(id) })
        } else {
            Image(painter = painterResource(link.toString()), contentDescription = "sprite", modifier = Modifier.size(size_t.dp).offset(x.dp, y.dp))
        }

    }

}