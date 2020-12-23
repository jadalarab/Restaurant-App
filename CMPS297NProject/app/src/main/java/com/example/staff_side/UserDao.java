package com.example.staff_side;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

public interface UserDao {
    @Insert
    void insert(Fragment fragment);

    @Query("SELECT * FROM Item")
    LiveData<List<Fragment>> getAllItems();
}
