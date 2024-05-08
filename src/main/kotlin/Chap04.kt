package org.example

fun main(args: Array<String>) {
    val a: Byte = 100
    val b: Short = 10_000                 //0-4個
    val c: Int = 1_000_000_000              //0-9個
    val d: Long = 100_000_000_000_000_000L    //0-18個
    val e: Float = 0.123f
    val f: Double = 0.123_456_789
    val g: UByte = 150U
    val h: UShort = 33_000U
    val i: UInt = 2_200_000_000U            //0-9個
    val j: ULong = 1000_0000_0000_0000_0000UL //0-19個
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(g)
    println(h)
    println(i)
    println(j)
}