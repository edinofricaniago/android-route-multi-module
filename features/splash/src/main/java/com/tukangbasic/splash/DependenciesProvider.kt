package com.tukangbasic.splash

import com.github.florent37.application.provider.Provider
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module


class DependenciesProvider : Provider() {
    override fun provide() {
        loadKoinModules(module {
            viewModel { SplashViewModel() }
        })
    }
}