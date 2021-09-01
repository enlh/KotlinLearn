package com.kotlin.leran.set

import java.io.File

/**
 * array数组的使用
 */
fun main() {
    // int数组 其他基本类型也有对应的数组
    val intArray = intArrayOf(10, 20, 3, 4)

    // 支持转化
    listOf(10, 3, 5).toIntArray()

    // 对象数组
    val objectArray = arrayOf(File("1"), File("2"), File("3"))
}