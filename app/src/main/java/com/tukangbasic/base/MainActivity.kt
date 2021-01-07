package com.tukangbasic.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.florent37.navigator.Navigator
import com.tukangbasic.routing.Routes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Navigator.of(this).pushReplacement(Routes.Splash)
    }
}