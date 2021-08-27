package com.kotlin.leran.function.lambda

/**
 * 匿名函数称为lambda，函数定义称为lambda表达式，函数返回值称为lambda结果
 */
fun main() {
    // 定义参数是函数的函数
    val description = { goodsName: String, hour: Int ->
        val year = 2021
        "距离${year}年，${goodsName}促销还剩${hour}小时"
    }

    showInfo("nini", (1..24).shuffled().last(), description)


    // 如果一个具名函数的lambda参数排在最后，或者是唯一的参数，那么括住lambda值参的圆括号可以省略
    "Mississippi".count({ it == 's' })
    "Mississippi".count { it == 's' }

    showInfo("lala", (1..24).shuffled().last()) { goodsName: String, hour: Int ->
        val year = 2021
        "距离${year}年，${goodsName}促销还剩${hour}小时"
    }
}

// 具名函数
inline fun showInfo(goodsName: String, hour: Int, getDescription: (String, Int) -> String) {
    println(getDescription(goodsName, hour))
}