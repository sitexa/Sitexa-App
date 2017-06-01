package com.sitexa.android.screen

import android.content.Context
import cn.nekocode.meepo.annotation.Bundle
import cn.nekocode.meepo.annotation.TargetClass
import cn.nekocode.meepo.Meepo
import com.sitexa.android.data.DO.Meizi
import com.sitexa.android.screen.page2.Page2Activity
import com.sitexa.android.screen.page2.Page2Presenter

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
interface UIRouter {

    companion object {
        val IMPL = Meepo.Builder().build().create(UIRouter::class.java)
    }

    @TargetClass(Page2Activity::class)
    fun gotoPage2(context: Context?, @Bundle(Page2Presenter.ARG_MEIZI) meizi: Meizi) {
        IMPL.gotoPage2(context, meizi)
    }
}