package com.jgy.helloworld.practice

/**
 * String 1.0
 * <pre>
 * Copyright 2017-2021 GE-SOFT, Inc. All rights reserved.
 * GE-SOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @description 请 jiangguangyu 填写注释
 * @author Jiangguangyu
 * @createdate: 2021/11/19 10:47
 * </pre>
 */

fun String.lettersCount(): Int{
    var count = 0
    for (char in this){
        if (char.isLetter()){
            count++
        }
    }
    return count
}

//使用  获取一个字符串中字母的数量
val count = "ABC123XYZ!@#".lettersCount()