package com.sitexa.android.screen.page2

import com.sitexa.android.data.DO.Meizi

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
class MeiziVO(
        val url: String,
        val title: String,
        val DO: Any
) {
    companion object {
        fun fromMeizi(meizi: Meizi): MeiziVO {
            return MeiziVO(meizi.url, meizi.id, meizi)
        }
    }
}