package org.example

fun main(args: Array<String>) {
    println("----6.1----")
    val num = 100
    val a: Boolean = (num == 100)
    val b: Boolean = (num == 125)
    println("整数 a の値は${a}です。")
    println("整数 b の値は${b}です。")

    println("----6.6----")
    val num1 = 5
    val num2 = 10
    val a6 = (num1<num2)
    val b6 = (num1>num2)
    println("num1がnum2より小さい :$a6")
    println("num1がnum2より大きい :$b6")
}