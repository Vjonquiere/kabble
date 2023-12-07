package model

class Game(val nbRounds : Int) {

    val player1 : Card = Player(nbRounds)
    val player2 : Card = Player(nbRounds)
    val Middle : Card = Deck(nbRounds)
}