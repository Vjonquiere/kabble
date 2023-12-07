package model

class Position(var x:Int, var y:Int) {
    fun get_x(): Int {
        return x
    }

    fun set_x( x:Int) {
        this.x = x
    }
    fun get_y(): Int {
        return y
    }
    fun set_y( y:Int) {
        this.y = y
    }
}