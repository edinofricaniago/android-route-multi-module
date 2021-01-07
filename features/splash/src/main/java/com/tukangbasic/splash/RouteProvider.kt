package com.tukangbasic.splash

import android.content.Intent
import com.github.florent37.application.provider.Provider
import com.tukangbasic.routing.Routes

class RouteProvider : Provider() {
    override fun provide() {
        Routes.Splash.register { context ->
            Intent(context, SplashActivity::class.java)
        }
    }
}