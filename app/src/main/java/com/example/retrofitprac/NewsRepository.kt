package com.example.retrofitprac

import com.example.retrofitprac.Model.News
import javax.inject.Inject

class NewsRepository @Inject constructor(private val newsApi: NewsApi) {

    suspend fun getSearchedNews(language:String,search:String):News{
        return newsApi.getSearchedNews(language = language, search = search)
    }
}