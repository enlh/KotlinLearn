package com.kotlin.leran.basis

import java.util.regex.Pattern

/**
 * 描述 ：    字符串的常用操作
 * author :  Jetictors
 * time :    2018/5/28  0:52
 * version : v1.0.1
 */

class OperatorStringDemo {

    /**
     * 字符串替换
     */
    private fun replaceStr() {
        println("-----------   ${Thread.currentThread().stackTrace[1].methodName}()   ------------")
        val str = "Kotlin is a very good programming language"

        // oldChar： 要替换的字符，newChar: 替换的字符
        println("-----------   1、replace()   ------------")
        println(str.replace('a', 'A', true))

        println("-----------   2、replace()   ------------")
        // oldValue: 要替换的字符串， newValue: 替换的字符串
        println(str.replace("Kotlin", "Java"))

        println("-----------   3、replace()   ------------")
        /*
            利用正则表达式替换
            regex: 规则
            replacement : 替换的字符

         */
        val str2 = "1234a kotlin 5678 3 is 4"
        println(str2.replace(Regex("[0-9]+"), "kotlin"))

        println("-----------   4、replace()   ------------")
        /*
            根据定义的正则规则去匹配源字符串，把满足规则的字符串通过`transform{}`高阶函数映射的新字符串替换。
            regex: 规则
            transform : 高阶函数
         */
        val newS = str2.replace(Regex("[0-9]")) { "abcd " }
        println(newS)

        // replaceFirst
        println("-----------   replaceFirst()   ------------")
        println(str.replaceFirst('a', 'A'))
        println(str.replaceFirst("Kotlin", "Java"))


        // replaceBefore
        println("-----------   replaceBefore()   ------------")
        println(str.replaceBefore('a', "AA"))
        println(str.replaceBefore("Kotlin", "Java"))

        // replaceBeforeLast
        println("-----------   replaceBeforeLast()   ------------")
        println(str.replaceBeforeLast('a', "AA"))
        println(str.replaceBeforeLast("Kotlin", "Java"))

        // replaceAfter
        println("-----------   replaceAfter()   ------------")
        println(str.replaceAfter('a', "AA"))
        println(str.replaceAfter("Kotlin", "Java"))

        // replaceAfterLast
        println("-----------   replaceAfterLast()   ------------")
        println(str.replaceAfterLast('a', "AA"))
        println(str.replaceAfterLast("Kotlin", "Java"))
    }

    /**
     * 字符串分割
     */
    private fun spiltStr() {
        println("-----------   ${Thread.currentThread().stackTrace[1].methodName}()   ------------")
        val str1 = "Kotlin is a very good programming language"

        val list1 = str1.split(' ')
        for (str in list1) {
            print("$str \t")
        }

        println()

        val list2 = str1.split(" ")
        for (str in list2) {
            print("$str \t")
        }

        println()

        val str2 = "1 kotlin 2 java 3 Lua 4 JavaScript"
        // 正则表达式
        val list3 = str2.split(Regex("[0-9]+"))
        for (str in list3) {
            print("$str \t")
        }

        println()

        val list4 = str2.split(Pattern.compile("[0-9]+"))
        for (str in list4) {
            print("$str \t")
        }

        println()

        val str3 = "a b c d e f g h 2+3+4+5"
        val list5 = str3.split(' ', '+')
        for (str in list5) {
            print("$str \t")
        }

        println()

        // 解构语法
        val data = "jcak,rose,tom"
        val (data1: String, data2: String, data3: String) = data.split(",")
        println("$data1 $data2 $data3")
    }

    /**
     * 字符串截取
     */
    private fun subStr() {
        println("-----------   ${Thread.currentThread().stackTrace[1].methodName}()   ------------")
        val str = "Kotlin is a very good programming language"

        val index: Int = str.indexOfFirst { it == 'a' }
        println(str.substring(0 until index))

        println(str.substring(10))
        println(str.substring(0, 15))
        println(str.substring(IntRange(0, 15)))

        println(str.subSequence(0, 15))
        println(str.subSequence(IntRange(0, 15)))
    }

    private fun optStr() {
        println("-----------   ${Thread.currentThread().stackTrace[1].methodName}()   ------------")

        // 字符串链接
        val oldStr = "kotlin"
        println(oldStr.plus(" very good"))
        println(oldStr + " very good")

        // 字符串反转
        val str = "kotlin"
        println("字符串反转：${str.reversed()}")

        // 检测字符串的起始字符与结尾字符
        println(str.endsWith("lin"))
        println(str.endsWith('n'))

        println(str.startsWith('k'))
        println(str.startsWith("kot"))
        println(str.startsWith("lin", 3))
    }

    /**
     * 字符串查找
     */
    private fun findStr() {
        println("-----------   ${Thread.currentThread().stackTrace[1].methodName}()   ------------")

        val str = "kotlin very good"

        println(str.first())
        println(str.first { it == 't' })
        println(str.firstOrNull())
        println(str.firstOrNull { it == 't' })
        println(str.last())
        println(str.last { it == 'o' })
        println(str.lastOrNull())
        println(str.lastOrNull { it == 'o' })

        println(str.indexOfFirst { it == 'o' })
        println(str.indexOfLast { it == 'o' })
        println(str.indexOf('o', 0))
        println(str.indexOf("very", 0))
        println(str.lastIndexOf('o'))
        println(str.lastIndexOf("good"))
    }

    /**
     * 统计
     */
    private fun getStrLength() {
        println("-----------   ${Thread.currentThread().stackTrace[1].methodName}()   ------------")

        val str = "kotlin very good"

        // 1. 直接用length属性获取
        println("str.length => ${str.length}")

        // 2. 用count()函数获取
        println("str.count() => ${str.count()}")

        // 3. 统计重复
        val count = str.count { it == 'o' }
        println("count : $count")
    }


    /**
     * 检测字符串是否为空，或空字符串，以及是否包含了空格
     */
    private fun checkNullStr() {
        println("-----------   ${Thread.currentThread().stackTrace[1].methodName}()   ------------")

        val str: String? = "kotlin"

        println(str?.isEmpty())
        println(str?.isNotEmpty())
        println(str.isNullOrEmpty())
        println(str?.isBlank())
        println(str?.isNotBlank())
        println(str.isNullOrBlank())

    }

    /**
     * 字符串比较
     * == 比较字符串的字符时候匹配
     * === 比较两个对象是否指向内存堆上同一个对象
     *
     * java中==比较对象引用 equals比较内容、结构
     */
    private fun checkEquals() {
        println("-----------   ${Thread.currentThread().stackTrace[1].methodName}()   ------------")
        val str1 = "Jack"
        val str2 = "jack".capitalize()
        val str3 = "Jack"

        println("$str1 $str2")
        println(str1 == str2)
        println(str1 === str2)
        // 字符串常量池
        println(str1 === str3)
    }

    fun test() {
        checkNullStr()
        getStrLength()
        optStr()
        findStr()
        subStr()
        spiltStr()
        replaceStr()
        checkEquals()
    }

}

fun main() {
    OperatorStringDemo().test()
}