package com.example.iorga_elys_practicapmdmfinal.model

import java.io.Serializable

data class Source(
    val id: String?,
    val name: String
): Serializable{
    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }

}