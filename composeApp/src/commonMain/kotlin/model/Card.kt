package model

import kotlin.random.Random

open class Card(nbRounds: Int) {

    var arrayInt: Array<Int> = randomArrayInt(nbRounds)


    open fun nextRound(randomArrayInt : Array<Int>){
        this.arrayInt = randomArrayInt
    }

    private fun randomArrayInt(nbRounds : Int): Array<Int>{
        val array = Array(8) { Random.nextInt(0,nbRounds)
        }
        return array
    }

    fun printArrayInt() {
        println("ArrayInt: ${this.arrayInt.joinToString()}")
    }


}