package com.lgmro.nybooks.data

import retrofit2.Call
import retrofit2.http.GET

interface ApiNewYorkTimes {

    @GET("lists.json")
    fun listRespos(): Call<List<BookResponse>>
}