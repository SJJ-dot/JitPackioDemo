package com.sjianjun.jitpackio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sjianjun.jitpackio.single.TestLib

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TestLib.print()
    }
}
