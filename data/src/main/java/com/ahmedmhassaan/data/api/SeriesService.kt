package com.ahmedmhassaan.data.api

import com.ahmedmhassaan.data.models.Series
import com.google.gson.Gson
import org.json.JSONObject
import javax.inject.Inject

class SeriesService @Inject constructor() {

    fun getSeries(): Series {

        val jsonResponse = """
            {
    "coverPhoto":"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS5v91v6WpXE8v4DprJzdGZQguXeVneI0FZBfRShNeGNg&s",
    "community":[
        {
            "postId":1,
            "postText":"Hi I am post 1",
            "username":"Ahmed Mohamed Hassaan",
            "timestamp":"3 min ago"
        },
        {
            "postId":2,
            "postText":"Hi I am post 2",
            "username":"Ahmed Mohamed Hassaan",
            "timestamp":"4 min ago"
        },
        {
            "postId":3,
            "postText":"Hi I am post 3",
            "username":"Ahmed Mohamed Hassaan",
            "timestamp":"5 min ago"
        }
    ],
    "coaches":[
        {
            "name":"John Alone",
            "about":"Ahmed is An Android Developer Gratuaded From Faculty of Computers and information 2021",
            "image":"https://images.pexels.com/photos/1431282/pexels-photo-1431282.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
        }
    ],
    "aboutSeries":"ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd",
    "classes":[
        {
            "title":"Class 1",
            "description":"desc of class 1",
            "videos":[
                {
                    "videoId":1,
                    "videoLink":""
                }
            ]
        }
    ],
    "difficulty":"Hard",
        "intensity":"Level 4"
        }
        """.trimIndent()

        return Gson().fromJson(
            jsonResponse, Series::class.java
        )
    }

}