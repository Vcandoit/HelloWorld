package com.jgy.helloworld.include

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.Toast
import com.jgy.helloworld.R
import kotlinx.android.synthetic.main.title.view.*

/**
 * TitleLayout 1.0
 * <pre>
 * Copyright 2017-2021 GE-SOFT, Inc. All rights reserved.
 * GE-SOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @description 请 jiangguangyu 填写注释
 * @author Jiangguangyu
 * @createdate: 2021/11/11 15:07
 * </pre>
 */
class TitleLayout(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs){
    init {
        LayoutInflater.from(context).inflate(R.layout.title,this)
        titleBack.setOnClickListener {
            val activity = context as Activity
            activity.finish()
        }
        titleEdit.setOnClickListener {
            Toast.makeText(context,"You clicked Edit button",Toast.LENGTH_SHORT).show()
        }
    }
}