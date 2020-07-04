package com.mayumi.calculadora.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ValoresDAO {
    @Insert
    fun insert(valor: Valores)

    @Query("SELECT * FROM valores_calculadora_table")
    fun getAllValores(): LiveData<List<Valores>>

    @Query("DELETE FROM valores_calculadora_table")
    fun clearAll()

}