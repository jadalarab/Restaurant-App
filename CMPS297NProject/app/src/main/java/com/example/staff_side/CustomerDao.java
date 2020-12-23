package com.example.staff_side;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface CustomerDao {

    @Insert
    void insert(Fragment fragment);

    @Query("SELECT * FROM customer")
    LiveData<List<Fragment>> getAllItems(); }
