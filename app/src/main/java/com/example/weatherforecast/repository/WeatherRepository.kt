package com.example.weatherforecast.repository

import android.util.Log
import com.example.weatherforecast.data.DataorException
import com.example.weatherforecast.model.Weather
import com.example.weatherforecast.model.WeatherObject
import com.example.weatherforecast.network.WeatherApi
import retrofit2.http.Query
import javax.inject.Inject

class WeatherRepository @Inject constructor(private val api: WeatherApi){
    suspend fun getWeather(cityQuery: String)
    :DataorException<Weather,Boolean,Exception>{
        val response = try {
            api.getWeather(query = cityQuery)
        }catch (e:Exception){
            Log.d("REX","getWeather: $e")
            return DataorException(e=e)
        }
        Log.d("INSIDE","getWeather: $response")
        return DataorException(data = response)

    }
}