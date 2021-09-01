package com.kotlin.leran.function.standard

/**
 * with函数
 * 是run函数的变体，他们的功能和行为是一样的，但是with的调用方式不同，
 * 调用with时，需要值参作为其第一个参数传入
 */
fun main() {
    val result = "The people's Republic of China".run { length >= 10 }
    println(result)

    val isTooLong = with("The people's Republic of China") {
        length >= 10
    }
    println(isTooLong)
}