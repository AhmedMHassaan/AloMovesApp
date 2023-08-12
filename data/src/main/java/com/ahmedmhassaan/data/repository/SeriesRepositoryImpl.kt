package com.ahmedmhassaan.data.repository

import com.ahmedmhassaan.data.datasources.SeriesDataSource
import com.ahmedmhassaan.data.toDomain
import com.ahmedmhassaan.domain.models.DomainSeries
import com.ahmedmhassaan.domain.repos.SeriesRepository
import javax.inject.Inject

class SeriesRepositoryImpl @Inject constructor(
    private val seriesDataSource: SeriesDataSource
) : SeriesRepository {
    override suspend fun getSeries(): DomainSeries {
        return seriesDataSource.getSeriese().toDomain()
    }
}