package model

open class Card() {
    lateinit var arraySign : Array<Sign>

    constructor(arraySign: Array<Sign>) : this() {
        this.arraySign = arraySign
    }

    open fun nextRound(randomArraySign : Array<Sign>){
        this.arraySign = randomArraySign
    }
}