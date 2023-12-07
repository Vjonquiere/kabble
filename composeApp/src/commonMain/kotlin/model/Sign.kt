package model

class Sign(var id: Int = -1) {




    fun getId(sign: Sign): Int {
        return this.id
    }

    fun setId(sign: Sign, newId : Int){
        this.id = newId
    }


}