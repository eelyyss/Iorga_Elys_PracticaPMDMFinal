package com.example.iorga_elys_practicapmdmfinal.model.database

import androidx.room.TypeConverter
import com.example.iorga_elys_practicapmdmfinal.model.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }
    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}