package com.kotlin.leran.function.standard

import java.io.File

/**
 * run函数
 * 光看作用域，run和apply差不多（有隐式调用），但与apply不同，run函数不返回函数接收者，而是返回lambda执行结果，即true / false
 * */
fun main() {
    val file = File("E:\\test\\test.txt")
    val result = file.run { readText().contains("hello") }
    println(result)

    val rerun = "The people's Republic of China".run(::isLong)
    println(rerun)

    // run函数支持链式调用 较方便
    "The people's Republic of China"
        .run(::isLong)
        .run(::showMessage)
        .run(::println)
}


fun isLong(name: String) = name?.length > 10

fun showMessage(isLong: Boolean): String {
    return if (isLong) {
        "Name is too long"
    } else {
        "Please rename."
    }
}