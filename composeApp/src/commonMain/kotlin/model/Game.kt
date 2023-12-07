package model

class Game(val nbRounds : Int) {

    val player1 : Player = Player(nbRounds)
    val player2 : Player = Player(nbRounds)
    val middle : Deck = Deck(nbRounds,player1,player2)

    fun nextRound(player : Player){
        player.nextRound(this.middle.arrayInt)
        middle.nextRound(this.player1,this.player2)
    }
}