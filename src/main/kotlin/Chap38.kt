package org.example.chap38

fun main(args: Array<String>) {
    println("----38.1----")
    val c1 = getTextClosure("さん")
    val c2 = getTextClosure("くん")
    val c3 = getTextClosure("ちゃん")

    val name1 = c1("タケシ")
    val name2 = c2("ツヨシ")
    val name3 = c3("ミナ")

    println(name1)
    println(name2)
    println(name3)
    println("----38.3----")
    val closure = getCountClosure()
    println("クロージャが返した値 = ${closure()}")
    println("クロージャが返した値 = ${closure()}")
    println("クロージャが返した値 = ${closure()}")
    println("----38.4----")
    val closureA = getCountClosure()
    val closureB = getCountClosure()
    println("クロージャAが返した値 = ${closureA()}")
    println("クロージャAが返した値 = ${closureA()}")
    println("クロージャAが返した値 = ${closureA()}")
    println("クロージャBが返した値 = ${closureB()}")
    println("クロージャBが返した値 = ${closureB()}")
    println("クロージャAが返した値 = ${closureA()}")
}

fun getTextClosure(x: String) : (String) -> String {
    val caller: (String) -> String = fun(name) = name + x //関数オブジェクト生成
    return caller
}

fun getCountClosure() : () -> Int {
    var num = 0
    val c: () -> Int = fun(): Int {
        num++
        return num
    }
    return c
}