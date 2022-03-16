package com.example.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder1 {
    val get2:Get2
    val baseUrl="https://rickandmortyapi.com/api/"
    init {
        val retrofit= Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(baseUrl)
            .build()
        get2=retrofit.create(Get2::class.java)

    }

}