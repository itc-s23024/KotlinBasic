package org.example

import kotlin.random.Random

fun main(args: Array<String>) {
//勝ちが1割,負け8.5割,あいこ0.5割となる
// CPUを実装したじゃんけんを作って下さい
    println("1:グー 2:チョキ 3:パー を選んでください: ")
    //0,1,2でグー、チョキ、パー選択する
    val player = readln().toInt() - 1

    // 乱数で勝敗を決める
    val result = when (Random.nextInt(0,100)) {
        in 0 .. 10 -> 1  //勝ち
        in 10 .. 15 -> 0 //負け
        else -> 2  //あいこ
    }

    //CPUの手を計算で求める
    val cpu = (player + result) % 3

    //表示用の勝ち負けあいこ
    val judje = when(result) {
        0 -> "あいこ"
        1 -> "勝ち"
        else -> "負け"
    }

    //結果表示
    //勝敗の結果表示（プレイヤー視点）
    println("CPU: ${cpu + 1} --- $judje")
}