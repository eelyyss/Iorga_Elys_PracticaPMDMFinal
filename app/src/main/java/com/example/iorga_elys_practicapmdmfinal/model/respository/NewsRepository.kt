package com.example.iorga_elys_practicapmdmfinal.model.respository

import com.example.iorga_elys_practicapmdmfinal.model.Article
import com.example.iorga_elys_practicapmdmfinal.model.database.ArticleDatabase
import com.example.iorga_elys_practicapmdmfinal.network.RetrofitInstance

class NewsRepository(val db: ArticleDatabase) {

    suspend fun getHeadlines(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getHeadlines(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getFavouritesNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticles(article)

}