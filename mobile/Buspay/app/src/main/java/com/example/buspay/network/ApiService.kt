package com.example.buspay.network

import com.example.buspay.models.LoginRequest
import com.example.buspay.models.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("api/auth/login")
    suspend fun loginUser(@Body request: LoginRequest): Response<UserResponse>

    @POST("api/auth/register")
    suspend fun registerUser(@Body request: Map<String, String>): Response<String>
}