package com.momah.studentapp.api

import com.momah.studentapp.model.Item
import com.momah.studentapp.model.Student
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiRequests {

    @GET("items")
    suspend fun getItems(): List<Item>

    @POST("students")
    suspend fun addStudents(@Body newStudent: Student): List<Student>
}