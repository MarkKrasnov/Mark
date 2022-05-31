package Swing

class ClassCar : Movable, Rotate {
    override fun move() {
        println("машина может ехать")
    }

    override fun rotate() {
        TODO("Not yet implemented")
    }

    val object1 = Object()
    var object2 = Object()


    fun main() {

        object2 = object1
    }

}