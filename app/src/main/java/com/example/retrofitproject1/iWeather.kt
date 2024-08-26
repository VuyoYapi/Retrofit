package com.example.retrofitproject1

import retrofit2.http.GET

const val apiKey = "6139fdfb87584775a3cb8fc0c4f19e63"
const val lon = 28.1879101
const val  lat = -25.7459277

interface iWeather {
    @GET("/data/2.5/weather?lat=${lat}&lon=${lon}&appid=${apiKey}")
    suspend fun getWeekData()
}