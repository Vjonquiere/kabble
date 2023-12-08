package model

import View.Game
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState

class Game(val nbRounds : Int, var needRefresh: MutableState<Boolean>) {

    val player1 : Player = Player(nbRounds)
    val player2 : Player = Player(nbRounds)
    val middle : Deck = Deck(nbRounds,player1,player2)

    var view: Game? = null

    fun nextRound(player : Player){
        player.nextRound(this.middle.arrayInt)
        middle.nextRound(this.player1,this.player2)
    }

    fun play(id:Int){
        nextRound(player1)
        needRefresh.value = true
    }

}