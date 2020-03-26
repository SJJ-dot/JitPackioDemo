package com.sjianjun.jitpackio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sjianjun.jitpackio.single.TestLib
import com.sjianjun.lib2.TestLib2
import com.sjianjun.retrofit.libjava.MyClass

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TestLib.print()
        TestLib2.print()
        MyClass()
    }
}
