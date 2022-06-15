package com.chernybro.wb53.presentation.data

import kotlinx.serialization.Serializable

@Serializable
data class Cat(
    val id: String,
    val url: String
)

