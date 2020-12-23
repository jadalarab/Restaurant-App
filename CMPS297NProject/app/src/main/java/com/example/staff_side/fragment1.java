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

public class fragment1 extends Fragment{

    String s1[], s2[], s3[];
    int images[] = {R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza};

    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment1_layout,container, false);
        s1 = getResources().getStringArray(R.array.food_items);
        s2 = getResources().getStringArray(R.array.food_descriptions);
        s3 = getResources().getStringArray(R.array.food_prices);

        recyclerView = root.findViewById(R.id.recyclerview1);

        MyRecycler1Adapter myAdapter =  new MyRecycler1Adapter(this.getContext(), s1, s2, s3, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));

        return root;
    }
}
