package com.sitexa.android

import android.app.Application
import com.sitexa.android.data.DataLayer

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        DataLayer.init(this)
    }

}
