package com.example.network

import retrofit2.http.GET

interface Get2 {


        @GET("character")
        suspend fun fetchCharacters():CharacterResponse


}