package com.jgy.helloworld.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jgy.helloworld.R

/**
 * AnotherRightFragment 1.0
 * <pre>
 * Copyright 2017-2021 GE-SOFT, Inc. All rights reserved.
 * GE-SOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @description 请 jiangguangyu 填写注释
 * @author Jiangguangyu
 * @createdate: 2021/11/16 11:18
 * </pre>
 */
class AnotherRightFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.another_right_fragment,container,false)
    }
}