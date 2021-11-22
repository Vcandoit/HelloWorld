package com.jgy.helloworld.fragment

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.jgy.helloworld.R
import kotlinx.android.synthetic.main.activity_fragment.*
import kotlinx.android.synthetic.main.left_fragment.*

/**
 * FragmentActivity 1.0
 * <pre>
 * Copyright 2017-2021 GE-SOFT, Inc. All rights reserved.
 * GE-SOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @description 请 jiangguangyu 填写注释
 * @author Jiangguangyu
 * @createdate: 2021/11/16 10:59
 * </pre>
 */
class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

//        button.setOnClickListener {
//            replaceFragment(AnotherRightFragment())
//        }
//        replaceFragment(RightFragment())
//
//        val fragment = leftFrag as FragmentActivity

    }

    private fun replaceFragment(fragment: Fragment){
//        val fragmentManager = supportFragmentManager
//        val transaction = fragmentManager.beginTransaction()
//        transaction.replace(R.id.rightLayout,fragment)
//        transaction.addToBackStack(null)
//        transaction.commit()
    }
}