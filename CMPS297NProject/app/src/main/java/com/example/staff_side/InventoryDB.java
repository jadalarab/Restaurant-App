package com.example.staff_side;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = Item.class, version = 1)
public abstract class InventoryDB extends RoomDatabase {

    public abstract InventoryDao inventoryDao();

    private static volatile InventoryDB inventoryInstance;

    static InventoryDB getDatabase(final Context context) {
        if (inventoryInstance == null){
            synchronized (InventoryDB.class){
                if (inventoryInstance == null) {
                    inventoryInstance = Room.databaseBuilder(context.getApplicationContext(), InventoryDB.class, "inventory_DB").build();
                }
            }
        }
        return inventoryInstance;
    }
}
