package com.ahmedmhassaan.domain.repos

import com.ahmedmhassaan.domain.models.DomainSeries

interface SeriesRepository {

    suspend fun getSeries(): DomainSeries
}