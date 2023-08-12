package com.ahmedmhassaan.data

import com.ahmedmhassaan.data.models.Class
import com.ahmedmhassaan.data.models.ClassVideo
import com.ahmedmhassaan.data.models.Instructor
import com.ahmedmhassaan.data.models.Post
import com.ahmedmhassaan.data.models.Series
import com.ahmedmhassaan.domain.models.DomainClass
import com.ahmedmhassaan.domain.models.DomainClassVideo
import com.ahmedmhassaan.domain.models.DomainInstructor
import com.ahmedmhassaan.domain.models.DomainPost
import com.ahmedmhassaan.domain.models.DomainSeries

fun Series.toDomain(): DomainSeries {
    return DomainSeries(
        coverPhoto,
        community.map {
            it.toDomain()
        },
        coaches.map {
            it.toDomain()
        },
        aboutSeries,
        classes.map {
            it.toDomain()
        },
        difficulty,
        intensity
    )
}

fun Post.toDomain(): DomainPost {
    return DomainPost(
        postId,
        postText, username, timestamp
    )
}

fun Instructor.toDomain(): DomainInstructor {
    return DomainInstructor(
        name, about, image
    )
}

fun ClassVideo.toDomain(): DomainClassVideo {
    return DomainClassVideo(
        videoId, videoLink
    )
}

fun Class.toDomain(): DomainClass {
    return DomainClass(
        videos.map {
            it.toDomain()
        },
        title,
        description
    )
}