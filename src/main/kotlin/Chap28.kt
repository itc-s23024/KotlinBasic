package org.example.chap28

import org.example.chap27.Car
import org.example.chap27.Car5

fun main(args: Array<String>) {
    run {
        println("----28.4----")
        var car = Ferrari("赤")
        car.drive(100.0)
    }
    run {
        println("----28.6----")
        val car = Prius("白")
        car.drive(100.0)
    }
}

// 28.2
class Ferrari(color: String) : Car5(color) {
    //28.3
    override fun drive(d: Double) {
        distance = distance + d
        println("${color}のフェラーリが走っているぞ！！")
        println("フェラーリ「ブウォォォォォーン！！」")
        println("おおっ、かっこいい！")
        println("マイレージは${distance}キロになったぞ! すげえ!")
    }
}

//28.5
class Prius(color: String) : Car5(color) {
    override fun drive(d: Double) {
        distance = distance + d
        println("${color}のプリウスが走っている！")
        println("プリウス「スウィーーーン」")
        println("すごい静かですね！")
        println("マイレージは${distance}キロだ。")
        println("トヨタ社の車は頑丈だからどんなに走っても壊れないんだ。")
        println("すごーーい！！！")
    }
}