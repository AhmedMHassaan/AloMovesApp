package com.ahmedmhassaan.data.models

data class Class(
//    val difficulty: String,
    val videos: List<ClassVideo>,
    val title: String,
    val description: String
)

data class ClassVideo(
    val videoId: Int,
    val videoLink: String,
)