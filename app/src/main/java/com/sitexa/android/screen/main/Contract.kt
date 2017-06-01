package com.sitexa.android.screen.main

import android.support.v7.widget.RecyclerView
import com.sitexa.android.base.IPresenter
import com.sitexa.android.base.IView

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
interface Contract {

    interface View : IView {
        fun setAdapter(adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>)
    }

    interface Presenter: IPresenter {
    }
}