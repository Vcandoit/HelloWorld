package com.jgy.helloworld.recycleViewNews

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jgy.helloworld.R
import kotlinx.android.synthetic.main.activity_news_content.*

/**
 * NewsContentActivity 1.0
 * <pre>
 * Copyright 2017-2021 GE-SOFT, Inc. All rights reserved.
 * GE-SOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @description 请 jiangguangyu 填写注释
 * @author Jiangguangyu
 * @createdate: 2021/11/18 16:39
 * </pre>
 */
class NewsContentActivity : AppCompatActivity() {
    companion object{
        fun actionStart(context: Context, title: String, content: String){
            val intent = Intent(context,NewsContentActivity::class.java).apply{
                putExtra("news_title",title)
                putExtra("news_content",content)
            }
            context.startActivity(intent)
        }
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_content)

        val title = intent.getStringExtra("news_title")//获取传入的新闻标题
        val content = intent.getStringExtra("news_content")//获取传入的新闻内容
        if (title != null && content != null){
            val fragment = newsContentFrag as NewsContentFragment
            fragment.refresh(title,content)//刷新NewsContentFragment界面
        }
    }
}