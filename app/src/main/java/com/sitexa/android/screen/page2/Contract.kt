package com.sitexa.android.screen.page2

import com.sitexa.android.base.IPresenter
import com.sitexa.android.base.IView

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
interface Contract {

    interface View : IView {
        fun setMeizi(vo: MeiziVO)
    }

    interface Presenter: IPresenter {
        fun onImageClick()
    }
}