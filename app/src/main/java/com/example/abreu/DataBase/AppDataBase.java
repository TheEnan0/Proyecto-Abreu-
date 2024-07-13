package com.example.abreu.DataBase;


import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;

import com.example.abreu.Models.Clientes;

@Database(entities = {Clientes.class},
        version = 1
)

public class AppDataBase extends RoomDatabase {
    @Override
    public void clearAllTables() {

    }

    @NonNull
    @Override
    protected InvalidationTracker createInvalidationTracker() {
        return null;
    }
}
