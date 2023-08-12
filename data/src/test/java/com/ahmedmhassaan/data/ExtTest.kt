package com.ahmedmhassaan.data

import com.ahmedmhassaan.data.models.ClassVideo
import com.ahmedmhassaan.domain.models.DomainClassVideo
import com.ahmedmhassaan.domain.models.DomainSeries
import com.google.common.truth.Truth
import org.junit.Test


class ExtTest {

    @Test
    fun `check that domain class video conveted to data classVideo_return true`() {
        val expectedDomain = DomainClassVideo(
            1,
            "url"
        )
        val data = ClassVideo(1, "url")

        Truth.assertThat(expectedDomain).isEqualTo(data.toDomain())
    }


}