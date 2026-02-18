package com.example.buspay.models

data class UserResponse(
    val user_id: Int,
    val username: String,
    val email: String?,
    val isSeller: Boolean
)
