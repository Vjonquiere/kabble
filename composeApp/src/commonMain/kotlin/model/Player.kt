package model

class Player (val nom: String) : Card() {

    override fun nextRound(middleArraySign: Array<Sign>) {
        this.arraySign = middleArraySign
    }

}