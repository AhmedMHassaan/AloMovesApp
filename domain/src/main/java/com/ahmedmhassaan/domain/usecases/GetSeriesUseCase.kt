package com.ahmedmhassaan.domain.usecases

import com.ahmedmhassaan.domain.BaseFlowUseCase
import com.ahmedmhassaan.domain.models.DomainSeries
import com.ahmedmhassaan.domain.models.Resource
import com.ahmedmhassaan.domain.repos.SeriesRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GetSeriesUseCase @Inject constructor(
    private val seriesRepository: SeriesRepository
) : BaseFlowUseCase<Any?, DomainSeries>() {
    override fun execute(request: Any?): Flow<Resource<DomainSeries>> = flow {
        val response = seriesRepository.getSeries()
        emit(Resource.Success(response))
    }
}