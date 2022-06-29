package com.lgmro.nybooks.data

import com.lgmro.nybooks.Constants.Companion.URL_BOOKS_API
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

object ApiService {
    private fun initRetrofit() =
        Retrofit.Builder()
            .baseUrl(URL_BOOKS_API)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()


    val service: ApiNewYorkTimes = initRetrofit().create(ApiNewYorkTimes::class.java)
}