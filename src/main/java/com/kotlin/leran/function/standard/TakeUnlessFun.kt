package com.kotlin.leran.function.standard

import java.io.File

/**
 * takeUnless函数
 * 与takeIf相反，只有判断条件为false时，才会返回接收者对象
 */

fun main() {
    val file = File("E:\\test\\test.txt")
        .takeUnless { it.isHidden }
        ?.readText()

    println(file)
}