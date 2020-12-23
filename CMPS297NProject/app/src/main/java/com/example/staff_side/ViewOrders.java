package com.example.staff_side;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ViewOrders extends AppCompatActivity {

    ImageView mainImageView;
    TextView title, description, price;

    String data1, data2, data3;
    int myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_orders);

        mainImageView = findViewById(R.id.foodImageView);
        title = findViewById(R.id.editFoodName);
        description = findViewById(R.id.editFoodDescription);
        price = findViewById(R.id.editFoodPrice);

        getData();
        setData();
    }

    private void getData() {
        if (getIntent().hasExtra("myImage") && getIntent().hasExtra("data1") && getIntent().hasExtra("data2")) {
            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            if (getIntent().hasExtra("data3")){
                data3 = getIntent().getStringExtra("data3");
            } else {
                data3 = null;
            }
            myImage = getIntent().getIntExtra("myImage", 1);

        } else {
            Toast.makeText(this, "No data.", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData() {
        title.setText(data1);
        description.setText(data2);
        price.setText(data3);
        mainImageView.setImageResource(myImage);

    }
}