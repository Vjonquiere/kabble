package model

class ClassicSpritePosition() : GenerateSpritePosition() {
    override fun generate_positions(): Array<Position> {
        val positions: Array<Position> = arrayOf(Position(60, 15), Position(150,20), Position(10, 90), Position(30,170), Position(100, 210), Position(100,100), Position(210,100), Position(180,180))
        return positions
    }
}