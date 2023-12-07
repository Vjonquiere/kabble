package model

import kotlin.random.Random

class Player(arrayInt: Int) : Card(arrayInt) {

    override var arrayInt: Array<Int> = randomArrayInt(nbRounds)

    fun nextRound(middleArrayInt: Array<Int>) {
        this.arrayInt = middleArrayInt
    }
    fun randomArrayInt(nbRounds : Int): Array<Int>{
        val array = Array(8) {
            Random.nextInt(0, nbRounds)
        }
        return array
    }

}