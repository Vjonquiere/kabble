package model

open class Card {

    lateinit var arraySign : Array<Sign>
    constructor(arraySign: Array<Sign>){
        this.arraySign = arraySign
    }
}