package com.jgy.helloworld.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jgy.helloworld.R

/**
 * RightFragment 1.0
 * <pre>
 * Copyright 2017-2021 GE-SOFT, Inc. All rights reserved.
 * GE-SOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @description 请 jiangguangyu 填写注释
 * @author Jiangguangyu
 * @createdate: 2021/11/16 10:07
 * </pre>
 */
class RightFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.right_fragment,container,false)
    }
}