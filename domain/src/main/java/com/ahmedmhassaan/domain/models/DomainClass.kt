package com.ahmedmhassaan.domain.models

data class DomainClass(
//    val difficulty: String,
    val videos: List<DomainClassVideo>,
    val title: String,
    val description: String
)

data class DomainClassVideo(
    val videoId: Int,
    val videoLink: String,
)