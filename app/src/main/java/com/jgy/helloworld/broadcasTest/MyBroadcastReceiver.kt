package com.jgy.helloworld.broadcasTest

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast
import android.os.Looper




class MyBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

        Thread {
            Looper.prepare()
            Toast.makeText(context,"received in MyBroadcastReceiver",Toast.LENGTH_SHORT).show()
            Looper.loop()
        }.start()

    }
}