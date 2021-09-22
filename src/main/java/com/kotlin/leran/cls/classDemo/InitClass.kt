package com.kotlin.leran.cls.classDemo

/**
 * 延迟初始化
 */
class InitClass {
    lateinit var equipment: String
    fun ready() {
        equipment = "gun"
    }

    fun battle() {
        if (::equipment.isInitialized) {
            println(equipment)
        }
    }
}

/**
 * 惰性初始化，即首次使用时进行初始化
 * 先写好初始化的方法，当要使用属性的时候调用该方法，进行初始化
 */

class LazyClass(_name: String) {
    var name = _name
    val config by lazy { configLazy() }

//    val config = configLazy()
    private fun configLazy(): String {
        println("loading....")
        return "xxx"
    }
}

fun main() {
    val per = InitClass()
    per.ready()
    per.battle()

    val lazyClass = LazyClass("leiou")
    Thread.sleep(3000)
    println(lazyClass.config)
}