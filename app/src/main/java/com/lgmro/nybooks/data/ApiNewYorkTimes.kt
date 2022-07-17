package com.lgmro.nybooks.data

import com.lgmro.nybooks.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiNewYorkTimes {

    @GET("lists.json")
    fun listRespos(
        @Query("api-key") apiKey: String = "your-key",
        @Query("list") list: String = "hardcover-fiction"
    ): Call<BookBodyResponse>
}