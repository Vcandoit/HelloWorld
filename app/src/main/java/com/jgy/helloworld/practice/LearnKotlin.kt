package com.jgy.helloworld

import com.jgy.helloworld.practice.Cellphone
import com.jgy.helloworld.practice.Singleton
import com.jgy.helloworld.practice.Student
import com.jgy.helloworld.practice.Study

fun main() {
    val a = 20
    val b = 43
    val value = largerNumber(a, b)
    println("最大的数字 = $value")

    //val num = 10
    val num = 10L
    checkNumber(num)

//    for (i in 0..10){
//        println(i)
//    }

//    for (i in 0 until 10 step 2) {
//        println(i)
//    }

//    for (i in 10 downTo 1) {
//        println(i)
//    }

//    val p = Person()
//    p.name = "Jack"
//    p.age = 23
//    p.eat()

    val student = Student("Jack", 19)
    doStudy(student)

    val cellphone1 = Cellphone("Huawei", 6666.99)
    val cellphone2 = Cellphone("Huawei", 6666.99)
    println(cellphone1)
    println("cellphone equals cellphone2 " + (cellphone1 == cellphone2))

    Singleton.singletonTest()

    val list = mutableListOf("Apple","Banner","Orange")
    for (fruit in list){
        println(fruit)
    }

    //setOf中不可以存放重复元素，多个只会保留一个
    val set = setOf("Apple","Banner","Orange")
    for (fruit in set){
        println(fruit)
    }

    val map = mapOf("Apple" to 1, "Banner" to 2)
    for ((fruit,number) in map){
        println("fruit is $fruit, number is $number")
    }

    val list2 = listOf("Apple", "Banner", "Watermelon")
    val maxLengthFruit = list2.maxByOrNull { it.length }
    println("max length fruit is $maxLengthFruit")

    val list3 = listOf("Apple","Watermelon")
    val lambda = { fruit: String -> fruit.length }
    val maxLengthFruit2 = list3.maxByOrNull(lambda)

    val maxLengthFruit3 = list3.maxByOrNull { fruit: String -> fruit.length }

    val maxLengthFruit4 = list3.maxByOrNull{ fruit -> fruit.length}
    //Lambda表达式参数列表中只有一个参数时候，使用it关键字代替
    val maxLengthFruit5 = list3.maxByOrNull{ it.length }

    val newList = list.map { it.toUpperCase() }
    for (fruit in newList){
        println(fruit)
    }


    //filter函数过滤集合
    val newList2 = list.filter { it.length <= 5 }
        .map{ it.toUpperCase()
        }

    val anyResult = list.any{ it.length <= 5 }
    val allResult = list.all{ it.length <= 5}
    println("anResult is $anyResult, allResult is $allResult")

    Thread {
        println("thread is running")
    }.start()
}

/*
-------------------------------------------------
 */
//fun doStudy(study: Study?) {
//    if (study != null){
//        study.readBooks()
//        study.doHomework()
//    }
//}

//fun doStudy(study: Study?) {
//    study?.readBooks()
//    study?.doHomework()
//}

//   ?可以为空
fun doStudy(study: Study?){
    study?.let {
        it.readBooks()
        it.doHomework()
    }
}

fun getTextLength(text: String?): Int {
    if (text != null){
        return text.length
    }
    return 0
}

fun getTextLength2(text: String?) = text?.length ?: 0

//非空断言工具 !!
var content: String? = "hello"

fun main2() {
    if (content != null){
        printUpperCase()
    }
}

fun printUpperCase() {
    val upperCase = content!!.toUpperCase()
    println(upperCase)
}

/*
-------------------------------------------------
 */

//fun largerNumber(num1: Int, num2: Int) = max(num1, num2)

//fun largerNumber(num1: Int, num2: Int): Int {
//    var value = 0
//    if (num1 > num2){
//        value = num1
//    } else {
//        value = num2
//    }
//    return value
//}

//fun largerNumber(num1: Int, num2: Int): Int {
//    val value = if (num1 > num2){
//        num1
//    } else {
//        num2
//    }
//    return value
//}

//fun largerNumber(num1: Int, num2: Int): Int {
//    return if (num1 > num2){
//        num1
//    } else {
//        num2
//    }
//}

//fun largerNumber(num1: Int, num2: Int) = if (num1 > num2) {
//    num1
//} else {
//    num2
//}

//fun largerNumber(num1: Int, num2: Int) = if (num1 > num2) {
//    num1
//} else {
//    num2
//}


fun largerNumber(num1: Int, num2: Int) = if (num1 > num2) num1 else num2

/*---------------------------------------------------------------------------*/

//fun getScore(name: String) = if (name == "Tom") {
//    86
//} else if (name == "Jim") {
//    77
//} else if (name == "Jack") {
//    95
//} else if (name == "Lily") {
//    100
//} else {
//    0
//}

//fun getScore(name: String) = when (name) {
//    "Tom" -> 86
//    "Jim" -> 77
//    "Jack" -> 95
//    "Lily" -> 100
//    else -> 0
//}

fun getScore(name: String) = when {
    name.startsWith("Tom") -> 86
    name == "Jim" -> 77
    name == "Jack" -> 95
    name == "Lily" -> 100
    else -> 0
}

fun checkNumber(num: Number) {
    when(num) {
        is Int -> println("number is Int")
        is Double -> println("number is Double")
        else -> println("number not support")
    }
}