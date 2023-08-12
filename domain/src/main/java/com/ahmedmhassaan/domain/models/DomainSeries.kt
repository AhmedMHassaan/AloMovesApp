package com.ahmedmhassaan.domain.models

import java.io.Serializable

data class DomainSeries(
    val coverPhoto: String,
    val community: List<DomainPost>,
    val coaches: List<DomainInstructor>,
    val aboutSeries: String,
    val classes: List<DomainClass>,
    val difficulty: String,
    val intensity: String,
) : Serializable
