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

public class fragment3 extends Fragment {

    String s1[], s2[], s3[];
    int images[] = {R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza};

    RecyclerView recyclerView3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment3_layout, container, false);
        s1 = getResources().getStringArray(R.array.customer_orders);
        s2 = getResources().getStringArray(R.array.order_descriptions);
        s3 = getResources().getStringArray(R.array.order_prices);

        recyclerView3 = root.findViewById(R.id.recyclerview3);

        MyRecycler3Adapter myAdapter = new MyRecycler3Adapter(this.getContext(), s1, s2, s3, images);
        recyclerView3.setAdapter(myAdapter);
        recyclerView3.setLayoutManager(new LinearLayoutManager(this.getContext()));

        return root;
    }
}
