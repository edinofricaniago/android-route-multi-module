package com.tukangbasic.home

import com.github.florent37.application.provider.Provider
import com.tukangbasic.routing.Routes


class RouteProvider : Provider(){
    override fun provide() {
        Routes.Home.registerActivity<HomeActivity>()
    }

}