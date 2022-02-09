package Network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder1 {
    val baseUrl="https://rickandmortyapi.com/api"
init {
    val retrofit= Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(baseUrl)
        .build()

}

}