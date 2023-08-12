package com.ahmedmhassaan.alomovesapp.presentation.ui.series_activity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ahmedmhassaan.alomovesapp.base.BaseViewModel
import com.ahmedmhassaan.domain.models.DomainSeries
import com.ahmedmhassaan.domain.usecases.GetSeriesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SerieseViewModel @Inject constructor(
    private val getSeriesUseCase: GetSeriesUseCase
) : BaseViewModel() {

    private val _progress = MutableLiveData<Boolean>()
    val progress: LiveData<Boolean> = _progress

    private val _error = MutableLiveData<String>()
    val error: LiveData<String> = _error


    private val _series = MutableLiveData<DomainSeries>()
    val series: LiveData<DomainSeries> = _series


    fun fetchSeriese() {
        getSeriesUseCase.invoke(null).dataHandling(success = {
            _series.postValue(it)
        }, showError = {
            _error.postValue(it.message)
        }, showLoading = {
            _progress.postValue(it)
        })
    }
}