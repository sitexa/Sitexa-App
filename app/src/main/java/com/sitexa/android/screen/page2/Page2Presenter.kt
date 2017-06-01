package com.sitexa.android.screen.page2

import android.os.Bundle
import com.sitexa.android.base.BasePresenter
import com.sitexa.android.data.DO.Meizi

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
class Page2Presenter : BasePresenter<Contract.View>(), Contract.Presenter {
    companion object {
        const val ARG_MEIZI = "ARG_MEIZI"
    }

    override fun onViewCreated(view: Contract.View, savedInstanceState: Bundle?) {
        val meizi = arguments.getParcelable<Meizi>(ARG_MEIZI)
        view.setMeizi(MeiziVO.fromMeizi(meizi))
    }

    override fun onImageClick() {
        activity.finish()
    }
}