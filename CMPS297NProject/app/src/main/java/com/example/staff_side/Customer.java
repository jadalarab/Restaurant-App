package com.example.staff_side;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "customer")
public class Customer {

    @PrimaryKey
    @NonNull
    private String id;

    @NonNull
    private String foodName;

    @NonNull
    private String foodDescription;

    @NonNull
    private float foodPrice;

    @NonNull
    private boolean hidden = false;

    @NonNull
    private int count ;
}
