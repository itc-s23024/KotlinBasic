package org.example.chap30


fun main(args: Array<String>) {
    val car1 = Feraari("赤")
    val car2 = Prius("白")
    val car3 = Xbee("黒")
    car1.drive(10.0)
    car2.drive(10.0)
    car3.drive(10.0)
}

abstract class Car (val color: String) {
    var distance = 0.0
    abstract fun drive(d: Double)
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

class Xbee(color: String) : Car(color) {
    override fun drive(d: Double) {
        distance += d
        println("${color}のクロスビーが走りました")
        println("マイレージは${distance}キロになりました。")
    }
}