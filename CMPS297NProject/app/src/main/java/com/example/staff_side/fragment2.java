package com.example.staff_side;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class fragment2 extends Fragment{

    String s1[], s2[];
    int images[] = {R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza};

    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment2_layout,container, false);
        s1 = getResources().getStringArray(R.array.food_items);
        s2 = getResources().getStringArray(R.array.food_remaining);

        recyclerView = root.findViewById(R.id.recyclerview2);

        MyRecycler2Adapter myAdapter =  new MyRecycler2Adapter(this.getContext(), s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));

        return root;
    }
}
