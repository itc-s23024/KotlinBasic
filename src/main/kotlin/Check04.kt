package org.example

fun main(args: Array<String>) {
// 横は 9 -> 1, 縦は 1 -> 9 の掛け算表を表示してください。
    /*
             9  8  7  6  5  4  3  2  1
          1  9  8  7  6  5  4  3  2  1
          2 18 16 14 12 10  8  6  4  2
          3 27 24 21 24 15 12  9  6  3
     */
    val x = 9 downTo 1
    val y = 1 .. 9

    //最初の見出しを出す
    println(" ")
    for (xi in x) {
        println("$xi")
    }
    println()

    //掛け算を出す
    for (yi in y) {
        println("$yi")
        for (xi in x) {
            println("$xi")
        }
        println()
    }
}