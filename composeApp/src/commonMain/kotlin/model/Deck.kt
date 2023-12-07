package model

import kotlin.random.Random

class Deck(arrayInt: Int,player1 : Player , player2: Player): Card(arrayInt) {

    override var arrayInt: Array<Int> = randomArrayInt(nbRounds,player1,player2)

     override fun randomArrayInt(nbRounds : Int, player1: Player, player2: Player): Array<Int>{
        val array = Array(8) { Random.nextInt(0,nbRounds)
        }
        array[0]=player1.arrayInt[Random.nextInt(0,8)]
        array[1]=player2.arrayInt[Random.nextInt(0,8)]
        return array
    }

}