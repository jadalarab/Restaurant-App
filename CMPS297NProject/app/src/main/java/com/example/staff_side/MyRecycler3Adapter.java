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

public class MyRecycler3Adapter extends RecyclerView.Adapter<MyRecycler3Adapter.MyViewHolder> {

    String data1[], data2[], data3[];
    int images[];
    Context context;

    public MyRecycler3Adapter(Context ct, String s1[], String s2[], String s3[], int img[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        data3 = s3;
        images = img;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.order_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.myText3.setText(data3[position]);
        holder.myImage.setImageResource(images[position]);

        holder.mainRowLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ViewOrders.class);
                intent.putExtra("data1", data1[position]);
                intent.putExtra("data2", data2[position]);
                intent.putExtra("data3", data3[position]);
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

        TextView myText1, myText2, myText3;
        ImageView myImage;
        ConstraintLayout mainRowLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.food_name);
            myText2 = itemView.findViewById(R.id.food_description);
            myText3 = itemView.findViewById(R.id.food_price);
            myImage = itemView.findViewById(R.id.myImageView);
            mainRowLayout = itemView.findViewById(R.id.mainRowLayout);
        }
    }
}
