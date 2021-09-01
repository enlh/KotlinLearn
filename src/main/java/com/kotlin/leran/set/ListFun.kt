package com.kotlin.leran.set

/**
 * list 集合的使用
 */
fun main() {
    // listOf创建的list不可修改
    val list = listOf("Jason", "Jack","Tom")
//    println(list[2])

    // getOrElse是一个安全索引取值函数，参数一索引值，参数二能提供默认值的lambda表达式，如果索引值不存在，可用来代替异常
    println(list.getOrElse(3) { "Unknown" })
    // getOrNull 是另一个安全索引取值函数，返回null结果，而不是抛出异常
    println(list.getOrNull(3))
    println(list.getOrNull(1) ?: "Unknown")


    // mutableListOf创建的list可以修改
    val mutableListOf = mutableListOf("Jason", "Jack", "Tom", "Tony")
    mutableListOf.add("Rose")
    mutableListOf.remove("Tom")
    println(mutableListOf)

    // List支持只读列表和可变列表的相互转化
    listOf("Jason", "Jack").toMutableList()
    mutableListOf("Jason", "Jack", "Tom", "Tony").toList()

    // 运算符重载
    mutableListOf += "Bob"
    mutableListOf -= "Tom"
    println(mutableListOf)


    // 遍历
    for (s in list) {
        println(s)
    }

    list.forEach { println(it) }

    list.forEachIndexed { index, item ->
        println("$index, $item")
    }

    // 解构 '_'运算符 忽略当前对象，不进行赋值
    val (origin, _, proxy) = list
    println("$origin, $proxy")
}