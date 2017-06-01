package com.sitexa.android.data.api

import com.sitexa.android.data.DO.Meizi
import com.sitexa.android.data.DO.Response
import com.sitexa.android.data.DataLayer
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * @author nekocode (nekocode.cn@gmail.com)
 */
internal interface GankApi {

    companion object {
        val IMPL: GankApi = DataLayer.RETROFIT_GANK!!.create(GankApi::class.java)
    }

    @GET("{count}/{pageNum}")
    fun getMeizis(@Path("count") count: Int, @Path("pageNum") pageNum: Int): Observable<Response<Meizi>>
}