package com.renanfsp.mgdb.models

import java.util.UUID

data class User (
    val id: String = UUID.randomUUID().toString(),
    val user: String
)