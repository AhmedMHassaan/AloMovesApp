package com.ahmedmhassaan.data.api

import com.ahmedmhassaan.data.models.Series
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class SeriesServiceTest {
    private lateinit var service: SeriesService

    @Before
    fun setup() {
        service = SeriesService()
    }

    @Test
    fun `parsed json string is Series _ retuen true`() {
        val series = service.getSeries()

        assertThat(series).isInstanceOf(Series::class.java)
    }


}