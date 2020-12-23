package com.example.staff_side;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class MyRecycler2Adapter extends RecyclerView.Adapter<MyRecycler2Adapter.MyViewHolder> {

    String data1[], data2[];
    int images[];
    Context context;

    public MyRecycler2Adapter(Context ct, String s1[], String s2[], int img[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.inventory_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.myImage.setImageResource(images[position]);

        holder.inventoryRowLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, EditItems.class);
                intent.putExtra("data1", data1[position]);
                intent.putExtra("data2", data2[position]);
                intent.putExtra("myImage", images[position]);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView myText1, myText2;
        ImageView myImage;
        ConstraintLayout inventoryRowLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.inventory_food_name);
            myText2 = itemView.findViewById(R.id.inventory_food_remaining);
            myImage = itemView.findViewById(R.id.inventory_image_view);
            inventoryRowLayout = itemView.findViewById(R.id.inventoryRowLayout);
        }
    }
}
