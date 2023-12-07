package model

import kotlin.random.Random

abstract class Card(var nbRounds: Int) {

    abstract var arrayInt: Array<Int>

    open fun nextRound(player1 : Player, player2 : Player) {
        this.arrayInt = randomArrayInt(this.nbRounds,player1,player2)
    }


    open fun randomArrayInt(nbRounds : Int, player1: Player, player2: Player): Array<Int>{
        val array = Array(8) { Random.nextInt(0,nbRounds)
        }
        array[0]=player1.arrayInt[Random.nextInt(0,8)]
        array[1]=player2.arrayInt[Random.nextInt(0,8)]
        return array
    }

    fun printArrayInt() {
        println("ArrayInt: ${this.arrayInt.joinToString()}")
    }


}