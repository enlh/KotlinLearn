package com.kotlin.leran.function

import java.io.File

/**
 * apply函数 即一个配置函数，可以配置一个接收者，然后调用一系列函数来配置他，以便使用
 * 如果提供lambda给apply函数执行，他会返回配置好的接收者
 */
fun main() {
    val file1 = File("E:\\test\test.txt")
    file1.setReadable(true)
    file1.setWritable(true)
    file1.setExecutable(false)

    /**
     * 调用一个个函数类配置接收者时，变量名省略，这是因为在lambda表达式里，apply能让每一个配置函数都作用于接收者，
     * 这种行为有时又叫相关作用域，因为lambda表达式里的所有配置函数都是针对接收者的，或者说，是针对接收者的隐式调用
     */
    // 使用apply 针对file2的隐式调用
    val file2 = File("E:\\test\test.txt").apply {
        setReadable(true)
        setWritable(true)
        setExecutable(false)
    }
}