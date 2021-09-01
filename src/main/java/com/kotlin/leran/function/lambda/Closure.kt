package com.kotlin.leran.function

/**
 * 闭包：kotlin中的lambda就是闭包
 * 匿名函数可以修改并且引用定义在自己作用域之外的变量，匿名函数引用着定义自己函数体的函数里的变量
 */
fun main() {
    val getDiscountWord = configDisCounterWord()
    println(getDiscountWord("沐浴露", (1..24).shuffled().last()))
}


private fun configDisCounterWord(): (String, Int) -> String {
    // 定义的变量
    val year = 2021
    // 匿名函数
    return { goodsName: String, hour: Int ->
//        val year = 2021
        "距离${year}年，${goodsName}促销还剩${hour}小时"
    }
}