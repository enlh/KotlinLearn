package com.kotlin.leran.set

/**
 * map 集合的使用
 */
fun main() {

    // 创建方式 to是一个函数，可以得到一个Pair类型
    val map = mapOf("Jack" to 20, "Jason" to 30, "Tony" to 50)

    mapOf(Pair("Jami", 20), Pair("Jason", 30))


    // 取值方式
    println(map["Jack"])
    println(map.getValue("Jason"))
    println(map.getOrElse("Jimmy") { "Unknown" })
    println(map.getOrDefault("Jimmy", 0))

    // 遍历
    map.forEach {
        println("${it.key}, ${it.value}")
    }

    map.forEach { (key: String, value: Int) ->
        println("${key}, ${value}")
    }

    println()

    // 可变map
    val mutableMap = mutableMapOf("Jack" to 20, "Jason" to 30, "Tony" to 50)
    mutableMap += "Jimmy" to 50
    mutableMap.put("Jimmy", 31)
    mutableMap.forEach { (key: String, value: Int) ->
        println("${key}, ${value}")
    }

    // 获取其中的元素，没有就添加
    mutableMap.getOrPut("Rose") { 18 }
    println(mutableMap)
}