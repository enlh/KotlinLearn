package com.kotlin.leran.cls.classDemo

import java.io.File

/**
 * 对象声明，即单例对象
 */

object ApplicationConfig {
    init {
        println("ApplictaionConfig loading...")
    }

    fun doSomeThing() {
        println("doSomeThing")
    }
}

/**
 * 对象表达式，只需要调用一次就不再使用
 */

open class Player {
    open fun load() = "loading nothing...."
}


/**
 * 伴生对象
 * 将某个对象的初始化和一个类实例捆绑在一起，可以考虑用伴生对象，使用companion关键字
 * 一个类只能有一个伴生对象
 */
open class ConfigMap {
    // 只有初始化configMap类或者调用load函数时，伴生对象的内容才会载入
    // 无论configMap实例化多少次，这个伴生对象始终只有一个实例存在
    companion object {
        private const val PATH = "xxx"
        fun load() = File(PATH).readBytes()
    }
}


fun main() {
    // 类名，实例名
    val p = ApplicationConfig.doSomeThing()
    println("$p")

    // 也是单例
    val player = object : Player() {
        override fun load() = "anonymous loading..."
    }

    // 伴生对象
    ConfigMap.load()

    println(player.load())
}