package com.example.practicavantis
import retrofit2.converter.gson.GsonConverterFactory
import okhttp3.Call
import retrofit2.http.GET

public interface API {

    val BASE_URL: String
        get() = "http://35.236.88.26:8074/vantischeckin-services/rest/History"


}