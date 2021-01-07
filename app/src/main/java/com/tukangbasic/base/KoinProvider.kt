package com.tukangbasic.base

import com.github.florent37.application.provider.Provider
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class KoinProvider : Provider() {
    override fun provide() {
        startKoin {
            context?.let { androidContext(it) }
        }
    }
}