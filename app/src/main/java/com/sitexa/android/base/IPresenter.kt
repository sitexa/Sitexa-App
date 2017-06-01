package com.sitexa.android.base

import com.sitexa.android.screen.UIRouter
import org.jetbrains.anko.toast

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
interface IPresenter : IContextProvider, UIRouter {

    fun onError(err: Throwable) {
        getContext()?.toast(err.message ?: "Unknown Error")
    }
}