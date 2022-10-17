package com.example.retrofitprac

import com.example.retrofitprac.Model.News
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Singleton

//https://newsapi.org/v2/top-headlines?q=adani&country=in&category=business&apiKey=2e5c50e075d44b61acfe63aad6d25997
//https://newsapi.org/v2/everything?q=adani&language=hi&apiKey=2e5c50e075d44b61acfe63aad6d25997

@Singleton
interface NewsApi {

    @GET("everything?apiKey=${Constants.API_KEY}")
    suspend fun getSearchedNews(
        @Query("language") language:String,
        @Query("q") search:String
    ): News
}