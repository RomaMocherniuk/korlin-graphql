package com.example.graphqldemo.model

import java.util.UUID

data class Book(
    val id: UUID,
    val title: String,
    val description: String? = null
)