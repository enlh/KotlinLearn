package com.kotlin.leran.set

/**
 * set集合的使用
 */
fun main() {
    // 不允许有重复的元素
    val set = setOf("Jack", "Tom", "Jim")
    // 取元素
    println(set.elementAt(2))

    // 可变集合
    val mutableSet = mutableSetOf("Jack", "Tom", "Jim")
    mutableSet.add("Bob")
    mutableSet.remove("Tom")

    mutableSet += "Jason"
    mutableSet -= "Tom"
    println(mutableSet)

    // list与set可以相互转化
    val list = listOf("Jack", "Tom", "Jim", "Tom")
        .toSet()
        .toList()
    println(list)

    // list去重
    println(listOf("Jack", "Tom", "Jim", "Tom").distinct())
}