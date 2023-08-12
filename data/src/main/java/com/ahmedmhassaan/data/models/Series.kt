package com.ahmedmhassaan.data.models

data class Series(
    val coverPhoto: String,
    val community: List<Post>,
    val coaches: List<Instructor>,
    val aboutSeries: String,
    val classes: List<Class>,
    val difficulty: String,
    val intensity: String,
)