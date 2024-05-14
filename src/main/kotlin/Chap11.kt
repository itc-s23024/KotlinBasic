package org.example

fun main(args: Array<String>) {
    println("----11.1----")
    val a = 5
    val b = 10
//    val b = 5

    if (a<b) {
        println("a の方が b よりも小さいです。")
    } else if (a > b){
        println("a の方が b よりも大きいです。")
    } else {
        println("aとbの値は同じです。")
    }
    println("----11.9----")
    val age = 14

    if (age in 13..15) {
        println("1番目の条件の処理が行われました。")
        println("中学生です。")
    } else {
        println("2番目の条件の処理が行われました。")
        println("中学生ではありません。")
    }
}