package com.example.staff_side;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = Item.class, version = 1)
public abstract class UserDb extends RoomDatabase {

    public abstract InventoryDao inventoryDao();

    private static volatile InventoryDB UserInstance;

    static InventoryDB getDatabase(final Context context) {
        if (UserInstance == null){
            synchronized (InventoryDB.class){
                if (UserInstance == null) {
                    UserInstance = Room.databaseBuilder(context.getApplicationContext(), InventoryDB.class, "User_db").build();
                }
            }
        }
        return UserInstance;
    }
}