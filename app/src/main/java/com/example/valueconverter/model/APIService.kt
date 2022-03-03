package com.example.valueconverter.model

import retrofit2.Call
import retrofit2.http.GET

interface APIService {
    @GET("daily_json.js")
    fun getData(): Call<ValuesList>
}