package com.jgy.helloworld.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.jgy.helloworld.R

/**
 * LeftFragment 1.0
 * <pre>
 * Copyright 2017-2021 GE-SOFT, Inc. All rights reserved.
 * GE-SOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @description 请 jiangguangyu 填写注释
 * @author Jiangguangyu
 * @createdate: 2021/11/16 10:03
 * </pre>
 */
class LeftFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.left_fragment,container,false)

        if(activity != null){
            val mainActivity = activity as FragmentActivity
        }
    }


    fun hello(){
        Toast.makeText(context,"Activity 中调用 fragment中方法",Toast.LENGTH_SHORT).show()
    }
}