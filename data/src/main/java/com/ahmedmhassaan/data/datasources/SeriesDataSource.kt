package com.ahmedmhassaan.data.datasources

import com.ahmedmhassaan.data.api.SeriesService
import javax.inject.Inject

class SeriesDataSource @Inject constructor(
    private val serieseService: SeriesService
) {

    suspend fun getSeriese() = serieseService.getSeries()

}