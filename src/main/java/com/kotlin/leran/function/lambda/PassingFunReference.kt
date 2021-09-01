package com.kotlin.leran.function

/**
 * 函数引用
 * 要获得函数引用，使用::操作符，后面跟要引用的函数名
 * 函数引用可以把一个具名函数转化为一个值参，所有使用lambda表达式的地方都可以使用函数引用
 */

fun main() {
    showInfo("牙膏", (1..24).shuffled().last(), ::getDiscountWords)
}

private fun getDiscountWords(goodsName: String, hour: Int): String {
    val year = 2021
    return "距离${year}年，${goodsName}促销还剩${hour}小时"
}

private fun showInfo(goodsName: String, hour: Int, getDescription: (String, Int) -> String) {
    println(getDescription(goodsName, hour))
}