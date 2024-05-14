package org.example

fun main(args: Array<String>) {
    println("----10.1----")
    val a: IntRange = 0..6
    val b: IntRange = 7..12
    val c: IntRange = 13..15
    println(a)
    println(b)
    println(c)

    println("----10.2----")
    val age2: Int = 10

    val range21: IntRange = 0..6
    val range22: IntRange = 7..12
    val range23: IntRange = 13..15

    val flag21 = age2 in range21
    val flag22 = age2 in range22
    val flag23 = age2 in range23

    println("${age2}歳の子供は就学前 ${flag21}")
    println("${age2}歳の子供は就学前 ${flag22}")
    println("${age2}歳の子供は就学前 ${flag23}")

    println("----10.3----")
    val age3: Int = 10

    val range31: IntRange = 0..6
    val range32: IntRange = 7..12
    val range33: IntRange = 13..15

    val flag31 = age3 !in range21
    val flag32 = age3 !in range22
    val flag33 = age3 !in range23

    println("${age3}歳の子供は就学前 ${flag31}")
    println("${age3}歳の子供は就学前 ${flag32}")
    println("${age3}歳の子供は就学前 ${flag33}")

    println("----10.4----")
    val rangeA: LongRange = 0..10000000000L
    val rangeB: CharRange = 'A'..'E'
    val rangeC: CharRange = 'あ'..'お'

    val flagA = 500 in rangeA
    val flagB = 'D' in rangeB
    val flagC = 'え' in rangeC

    println("FlagA = $flagA")
    println("FlagB = $flagB")
    println("FlagC = $flagC")

    println("----10.a----")
    val rangeD: IntRange = 0 until 6
    val rangeE: IntRange = 0..6
    println(rangeD)
    println(rangeE)
}