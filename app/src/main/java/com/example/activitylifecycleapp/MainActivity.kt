package com.example.activitylifecycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    // methods: onRestart(), onStart(), onResume(), onPause(), onStop(), and onDestroy().

    override fun onRestart() {
        super.onRestart()
        Log.d("activityLifecycle", "This is onRestart")
    }
    override fun onStart() {
        super.onStart()
        Log.d("activityLifecycle", "This is onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("activityLifecycle", "This is onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("activityLifecycle", "This is onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("activityLifecycle", "This is onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("activityLifecycle", "This is onDestroy")
    }
}