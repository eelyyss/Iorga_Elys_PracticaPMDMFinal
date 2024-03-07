package com.example.iorga_elys_practicapmdmfinal.model.data

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)