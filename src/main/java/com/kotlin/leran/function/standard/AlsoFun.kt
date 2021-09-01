package com.kotlin.leran.function.standard

import java.io.File

/**
 * also函数
 * also与let功能类似，和let一样，also也是把接收者作为值参传给lambda
 * 不同的是：also返回接收者对象，而let返回lambda执行结果
 * 因此，also特别适合针对同一原始对象，利用副作用做事，既然also返回的是接收者对象，就可以基于原始接收者对象执行额外的链式调用
 */
fun main() {

    var fileContents: List<String>
    File("E:\\test\\test.txt")
        .also { println(it.name) }
        .also { fileContents = it.readLines() }
    println(fileContents)
}