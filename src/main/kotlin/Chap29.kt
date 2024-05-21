package org.example.chap29

//29.1はできなくても良い

fun main(args: Array<String>) {
    run {
        println("----29.5----")
        val car1 = Feraari("赤")
        val car2 = Prius("白")
        driveByCar(car1)
        driveByCar(car2)
    }
}
//29.5
fun driveByCar(car: Car) {
    car.drive(100.0)
}

open class Car (val color: String) {
    var distance = 0.0
    open fun drive(d: Double) {
        distance += d
        println("${color}んお車が${d}km 走りました")
        println("マイレージは ${distance}キロになりました。")
    }
}

class Feraari(color: String) : Car(color) {
    override fun drive(d: Double) {
        distance += d
        println("${color}のフェラーリが走っているぞ！！")
        println("フェラーリ「ブウォォォォォーン！！」")
        println("おおっ、かっこいい！")
        println("マイレージは${distance}キロになったぞ! すげえ!")
    }
}

class Prius(color: String) : Car(color) {
    override fun drive(d: Double) {
        distance +=  d
        println("${color}のプリウスが走っている！")
        println("プリウス「スウィーーーン」")
        println("すごい静かですね！")
        println("マイレージは${distance}キロだ。")
        println("トヨタ社の車は頑丈だからどんなに走っても壊れないんだ。")
        println("すごーーい！！！")
    }
}
