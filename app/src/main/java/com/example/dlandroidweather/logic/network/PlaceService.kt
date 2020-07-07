package com.example.dlandroidweather.logic.network

import com.example.dlandroidweather.DlWeatherApplication
import com.example.dlandroidweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    @GET("v2/place?token=${DlWeatherApplication.TOKEN}&lang=zh_cn")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}