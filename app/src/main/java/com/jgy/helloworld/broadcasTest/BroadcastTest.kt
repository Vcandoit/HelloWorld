package com.jgy.helloworld.broadcasTest

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.jgy.helloworld.R
import kotlinx.android.synthetic.main.activity_broadcast_text.*

/**
 * BroadcastTest 1.0
 * <pre>
 * Copyright 2017-2021 GE-SOFT, Inc. All rights reserved.
 * GE-SOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @description 请 jiangguangyu 填写注释
 * @author Jiangguangyu
 * @createdate: 2021/11/19 14:13
 * </pre>
 */
class BroadcastTest : AppCompatActivity() {
    //lateinit var timeChangeReceiver : TimeChangeReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broadcast_text)
//        val intentFilter = IntentFilter()
//        intentFilter.addAction("android.intent.action.TIME_TICK")
//        timeChangeReceiver = TimeChangeReceiver()
//        registerReceiver(timeChangeReceiver,intentFilter)

        button.setOnClickListener {
            val intent = Intent("com.jgy.helloworld.MY_BROADCAST")
            intent.setPackage(packageName)
            sendBroadcast(intent)
        }
    }

//    inner class TimeChangeReceiver : BroadcastReceiver(){
//        override fun onReceive(context: Context?, p1: Intent?) {
//            //Toast.makeText(context,"Time has changed",Toast.LENGTH_SHORT).show()
//        }
//    }

//    override fun onDestroy() {
//        super.onDestroy()
//        unregisterReceiver(timeChangeReceiver)
//    }
}