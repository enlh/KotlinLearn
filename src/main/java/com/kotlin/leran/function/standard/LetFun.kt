package com.kotlin.leran.function

/**
 * let函数
 * let函数能使某个函数作用于其lambda表达式里，让it关键字能引用他，
 * 与apply比较，let会使接收者传给lambda，而apply什么都不会传；
 * 匿名函数执行完，apply会返回当前接收者，而let会返回lambda表达式最后一行
 */
fun main() {
    val result = listOf(3, 2, 1).first().let { it * it }
    println(result)

    println(formatGreet("niu"))
}


fun formatGreet(guestName: String?): String {
    return guestName?.let { "Welcome, $it" } ?: "What's your name?"
}