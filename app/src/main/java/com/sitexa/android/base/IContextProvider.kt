package com.sitexa.android.base

import android.content.Context

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
interface IContextProvider {

    fun getContext(): Context?
}