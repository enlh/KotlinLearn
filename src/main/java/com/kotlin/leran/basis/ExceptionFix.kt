package com.kotlin.leran.basis

/**
 * 异常处理、先决条件函数
 */
fun main() {
    var number: Int? = null
    try {
        number!!.plus(1)
    } catch (e: KotlinNullPointerException) {
        println(e)
    }

//    checkOperate(number)
    checkOperate2(number)
}

fun checkOperate(number: Int?) {
    number ?: throw UnSkilledException()
}

/**
 * 使用先决条件函数
 */
fun checkOperate2(number: Int?) {
    // 先决条件函数；使用内置函数，抛出带有自定义信息的异常，即先决条件函数
    //  可以使用先决条件函数定义先决条件，条件必须满足，目标代码才能执行
    checkNotNull(number, { "Something is not good!" })
    // 其他常用内置函数见图片/img/ExceptionFix.png
}

class UnSkilledException() : IllegalArgumentException("操作不当")