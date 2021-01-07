package com.tukangbasic.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.cancel
import org.koin.android.viewmodel.ext.android.viewModel

class SplashActivity : AppCompatActivity(), CoroutineScope by MainScope() {
    private val splashViewModel : SplashViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        splashViewModel.load()
    }

    override fun onDestroy() {
        cancel()
        super.onDestroy()
    }
}