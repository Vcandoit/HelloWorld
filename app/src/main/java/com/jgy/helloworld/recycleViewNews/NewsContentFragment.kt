package com.jgy.helloworld.recycleViewNews

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jgy.helloworld.R
import kotlinx.android.synthetic.main.news_content_frag.*

/**
 * NewsContentFragment 1.0
 * <pre>
 * Copyright 2017-2021 GE-SOFT, Inc. All rights reserved.
 * GE-SOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @description 请 jiangguangyu 填写注释
 * @author Jiangguangyu
 * @createdate: 2021/11/18 16:30
 * </pre>
 */
class NewsContentFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return  inflater.inflate(R.layout.news_content_frag,container,false)
    }

    fun refresh(title: String, content: String){
        contentLayout.visibility = View.VISIBLE
        newsTitle.text = title
        newsContent.text = content
    }
}