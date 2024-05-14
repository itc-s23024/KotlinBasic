package org.example

import kotlin.random.Random
import kotlin.random.nextUInt

fun main(args: Array<String>) {
    println("1:グー 2:チョキ 3:パー を選んでください: ")
    val player = readln().toInt() - 1

    // CPUの手をランダムで決める
    val cpu = Random.nextInt(0,3) // 0,1,2 のどれかになる

    //勝敗判定
    val judge = when {
        player == cpu -> "あいこ"
        player == 0 && cpu == 1 || player == 1 && cpu == 2 || player == 2 && cpu == 0 -> "かち"
        player == 0 && cpu == 2 || player == 1 && cpu == 0 || player == 2 && cpu == 1 -> "まけ"
        else -> "?"
    }
    //勝敗の結果表示(プレイヤー視点)
    println("CPU: $cpu --- $judge")
    //勝ち
    //負け
    //あいこ
}