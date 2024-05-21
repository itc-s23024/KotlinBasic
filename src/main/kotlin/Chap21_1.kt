package org.example

fun main(args: Array<String>) {
    run {
        val answer: Int = getThreeTims(5)
        println(answer)
    }
    run {
        val answer: Int = getTims(2,3)
        println(answer)
    }
    run {
        println("----21.1----")
        val answer = getTims(2,3,4)
        println("変数 answer の値: $answer")
    }
//    val  answer: Int = getThreeTims(5)  //これが関数の呼び出しです。
//    val answer2: Int = getThreeTims(5.2)
//    val answer3: Long = getThreeTims(5)
//    println(answer)
}

// 21.1 .../
//21.4
//fun getThreeTims(value: Int): Int = value * 3

//21.5
fun getThreeTims(value: Int) = value * 3

//21.8
fun getTims(x: Int, y: Int) = x * y

//21.11
fun getTims(x: Int, y: Int, z: Int): Unit {
    println("パラメータとして $x と$y と$z を受け取りました")
    println("これらの値を全部掛け算した答えは ${x + y + z}")
}
