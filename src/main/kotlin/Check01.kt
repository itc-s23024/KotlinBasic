package org.example

fun main(args: Array<String>) {
    val score = readln().toInt()

    if (score < 0 || score > 100) {
        println("エラー")
    } else if (score <= 59) {
        println("成績はD")
    } else if (score <= 69) {
        println("成績はC")
    } else if (score <= 79) {
        println("成績はB")
    } else if (score <= 89) {
        println("成績はA")
    } else {
        println("成績はS")
    }

    //成績判定
    // 0 ~ 59 は D
    // 60 ~ 69 は C
    // 70 ~ 79 は B
    // 80 ~ 89 は A
    // 90 ~ 100 は S
    // それ以外は「エラー」と出力

}