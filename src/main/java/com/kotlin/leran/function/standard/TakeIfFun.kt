package com.kotlin.leran.function.standard

import java.io.File

/**
 * takeIf函数
 * 和其他标准函数不一样，takeIf需要判断lambda中提供的条件表达式，给出true/false结果，为true返回接收者对象，为false返回null
 * 如果需要判断某个条件是否满足，再判断是否可以赋值变量或者执行某项任务，takeIf就很实用
 * 从概念上讲，跟if条件语句类似，但其优势是可以直接在对象实例上调用，避免了临时变量赋值的麻烦
 */
fun main() {
    val file = File("E:\\test\\test.txt")
        .takeIf { it.exists() && it.canRead() }
        ?.readText()

    println(file)
}