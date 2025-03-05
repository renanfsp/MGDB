package com.renanfsp.mgdb.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity
data class UserEntity(
    @PrimaryKey
    val id: String = UUID.randomUUID().toString(),
    val user: String
)
