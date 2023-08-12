package com.ahmedmhassaan.alomovesapp.base

import androidx.lifecycle.ViewModel
import com.ahmedmhassaan.domain.models.Resource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach


open class BaseViewModel : ViewModel() {

    inline fun <T> Flow<Resource<T>>.dataHandling(

        crossinline success: (data: T) -> Unit,
        crossinline showLoading: (loading: Boolean) -> Unit = {},
        crossinline showError: (error: Throwable) -> Unit = {}
    ): Job {
        return this.onEach {
            when (it) {
                is Resource.Success -> {
                    success.invoke(it.data)
                }

                is Resource.Loading -> {
                    showLoading.invoke(it.isLoading)
                }

                is Resource.Error -> {
                    showError.invoke(it.error)
                }
            }
        }.catch {
            showError.invoke(it)
        }

            .launchIn(CoroutineScope(Dispatchers.IO))
    }
}