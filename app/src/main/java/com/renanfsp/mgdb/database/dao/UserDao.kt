package com.renanfsp.mgdb.database.dao

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {
//    @Query("")
    fun storeUser(username: String)

//    @Query("")
    fun showUser(): Flow<String>
}
