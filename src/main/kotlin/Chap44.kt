package org.example.chap44

fun main(args: Array<String>) {
    val text = "勉強"
    val message = text.getOneTwoFiveMessage()
    println(message)
}

fun String.getOneTwoFiveMessage() = "一に${this}、二に${this}、三、四がなくて五に${this}"
