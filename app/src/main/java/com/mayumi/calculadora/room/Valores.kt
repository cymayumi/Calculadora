package com.mayumi.calculadora.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "valores_calculadora_table")
data class Valores(

    @PrimaryKey(autoGenerate = true)
    var valorId: Long = 0L,

    @ColumnInfo(name = "valor_a")
    var valorA: Float = 0.0f,

    @ColumnInfo(name = "valor_b")
    var valorB: Float = 0.0f,

    @ColumnInfo(name = "soma_final")
    var somaFinal: Float = 0.0f
)

//descrição da nossa Entity com as annotations