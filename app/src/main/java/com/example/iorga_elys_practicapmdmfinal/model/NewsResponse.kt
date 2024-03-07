package com.example.iorga_elys_practicapmdmfinal.model

import com.example.iorga_elys_practicapmdmfinal.model.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)