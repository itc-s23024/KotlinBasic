package org.example.chap43

fun main(args: Array<String>) {
    run {
        println("----43.1----")
        val car = Car("赤")
        (0 .. 50).forEach {
            car.drive()
        }
        run {
            println("----43.2----")
            val car = Prius("赤")
            car.drive()
        }
    }
}

open class Car(val color: String) {
    protected var fuel = 50.0

    public fun drive() {
        if (fuel > 0.0) {
            letEngineWork()
            println("${color}の車が走りました。")
        } else {
            println("ガス欠で走れません！")
        }
    }

    open  protected fun letEngineWork() {
        println("ブルルーン！")
        fuel = fuel - 1.0 //ガソリンを１リットル消費した。
    }
}

class Prius(color: String) : Car(color) {
    override fun letEngineWork() {
        println("スウィーン！")
        fuel = fuel - 0.5
    }
}