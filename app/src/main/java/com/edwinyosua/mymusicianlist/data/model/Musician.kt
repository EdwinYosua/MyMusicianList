package com.edwinyosua.mymusicianlist.data.model

data class Musician(
    val id: Int,
    val name: String,
    val gender: String,
    val age: Int,
    val description: String,
    val profileImg: Int = 0
)
