package com.example.staff_side;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "User")
public class User {

    @PrimaryKey @NonNull
    private String id;

    @NonNull
    private String FirstName;

    @NonNull
    private String Password;

}
