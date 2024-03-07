package com.example.iorga_elys_practicapmdmfinal.model.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.iorga_elys_practicapmdmfinal.model.data.Article

@Dao
interface ArticleDao {

    @Insert
    fun updateInsert(article: Article): Long

    @Query("SELECT * FROM articles")
    fun getAll(): List<Article>

    @Delete
    fun delete(article: Article)

}
