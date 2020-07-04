package com.mayumi.calculadora.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

//sempre que atualizar o BD, atualizar também a versão.
@Database(entities = [Valores::class], version = 1, exportSchema = false)
abstract class ValoresDatabase : RoomDatabase() {

    abstract val valoresDAO: ValoresDAO

    companion object {
        @Volatile
        private var INSTANCE: ValoresDatabase? = null

        fun getInstance(context: Context): ValoresDatabase {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        ValoresDatabase::class.java,
                        "valores_history_database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }

                return instance
            }
        }
    }

}