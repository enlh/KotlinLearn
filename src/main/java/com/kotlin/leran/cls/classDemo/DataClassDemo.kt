package com.kotlin.leran.cls.classDemo

/**
 * 描述 ：    数据类
 * author :  Jetictors
 * time :    2017/12/13  0:42
 * version : v1.0.1
 */

/**
 * 数据类专门用来存储数据
 * 数据类提供了toString的个性化实现
 * 数据类==比较对象的引用值，数据类提供了equals和hashCode的个性化实现
 */
data class Person(
    var param1: String = "param1",
    var param2: String = "param2",
    var param3: String,
    var param4: Long,
    var param5: Int = 2,
    var param6: String,
    var param7: Float = 3.14f,
    var param8: Int,
    var param9: String
) {
    // exp
}

data class User(val name: String, val pwd: String)

class PlayerScore(val experience: Int, val level: Int) {
    operator fun component1() = experience
    operator fun component2() = level
}

data class Coordinate(val x: Int, val y: Int) {
    operator fun plus(other: Coordinate) = Coordinate(x + other.x, y + other.y)
}

class DataClassDemo {

    fun test() {
        val mUser = User("kotlin", "123456")
        println(mUser)

        // 赋值一个对象，只改变了name属性，copy函数次构造函数里面赋值的属性不会复制
        val mNewUser = mUser.copy(name = "new Kotlin")
        println(mNewUser)

        // 普通类解构语法
        val (x, y) = PlayerScore(10, 10)
        println("experience=　$x, level = $y")
        // 数据类解构语法，数据类自动为所有定义在主构造函数的属性添加对应的组件函数
        val (name, pwd) = mUser
        println("name = $name \t pwd = $pwd")

        // 数据类运算符重载需要重写指定的方法，见图片/src/operate.png
        val data1 = Coordinate(10, 10)
        val data2 = Coordinate(10, 10)
        println(data1 + data2)


        val pair = Pair(1, 2)        // 实例
        val triple = Triple(1, 2, 3)  // 实例
        println("$pair \t $triple") // 打印：即调用了各自的toString()方法
        println(pair.toList())      // 转换成List集合
        println(triple.toList())    // 转换成List集合
        println(pair to 3)          // Pair类特有: 其作用是把参数Pair类中的第二个参数替换
    }

}

fun main() {
    DataClassDemo().test()
}