package com.kotlin.leran.function

/**
 * 匿名函数
 */
fun main() {
    val Anonymous : () -> String = {
        val holiday = "new year"
        "Happy $holiday"
    }
    println(Anonymous())


    val total: Int = "Mississippi".count()
    println("total = $total")

    val sTotal: Int = "mississippi".count({ a ->
        a == 's'
    })
    println("sTotal = $sTotal")

    // 变量的类型是一个匿名函数
    // 与具名函数不一样，除了极少数情况，匿名函数不需要return关键字来返回数据
    // 匿名函数会隐式或自动返回函数体最后一行语句的结果
    val blessingFun: () -> String = {
        val holiday = "new Year"
        "Happy $holiday"
    }
    println(blessingFun())

    // 和具名函数一样，匿名函数可以不带参数，也可以带一个或多个任意类型的参数
    // 需要带参数时，参数类型放在匿名函数类型定义中，参数名则放在函数定义中
    val blessingFun2: (String) -> String = { name ->
        val holiday = "new Year"
        "Hey, $name, Happy $holiday"
    }
    println(blessingFun2("haha"))


    // 定义匿名函数如果只有一个参数，可以使用it关键字来代替参数名，当需要传入两个参数时，it就不能使用了
    val blessingFun3: (String) -> String = {
        val holiday = "你个cdx"
        "Hey, $it, Happy $holiday"
    }
    println(blessingFun3("haha"))


    /*---------------返回值类型推断-----------------*/
    // 定义一个变量时，如果已经把匿名函数作为变量赋值给他，就不需要显示的指明变量类型
    val blessingFun4 = {
        val holiday = "new Year"
        "Happy $holiday"
    }
    println(blessingFun4())

    /*---------------传入参数类型推断-----------------*/
    // 类型推断也支持带参数的匿名函数，但为了帮助编译器推断类型，匿名函数的参数名和参数类型必须要有
    // 需要将参数名和参数类型写到函数定义中，一个参数同样可以省略参数名，用it代替
    val blessingFun5 = { name: String, age: Int ->
        "I'm $name, and I'm $age years old."
    }
    println(blessingFun5("haha", 34))

    val blessingFun6 = { it: String ->
        "I'm $it, I will be ok!!"
    }
    println(blessingFun6("heiehi"))
}