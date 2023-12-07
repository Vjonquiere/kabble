package model

class Player(arrayInt: Int) : Card(arrayInt) {

    override fun nextRound(middleArrayInt: Array<Int>) {
        this.arrayInt = middleArrayInt
    }

}