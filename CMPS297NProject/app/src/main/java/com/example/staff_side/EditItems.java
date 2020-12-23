package com.example.staff_side;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

public class EditItems extends AppCompatActivity {

    ImageView mainImageView;
    EditText title, description, price;
    Button removeButton;
    Switch hideSwitch;

    String data1, data2, data3;
    int myImage;
    boolean hidden;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_items);

        mainImageView = findViewById(R.id.foodImageView);
        title = findViewById(R.id.editFoodName);
        description = findViewById(R.id.editFoodDescription);
        price = findViewById(R.id.editFoodPrice);
        removeButton = findViewById(R.id.button);
        hideSwitch = findViewById(R.id.hideSwitch);

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

            hidden = getIntent().getBooleanExtra("hideSwitch", false);

        } else {
            Toast.makeText(this, "No data.", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData() {

        if (data1 == null) {
            title.setText("Enter Food Name");
        } else{ title.setText(data1); }

        if (data2 == null) {
            description.setText("Enter Food Description");
        } else{ description.setText(data2); }

        if (data3 == null) {
            price.setText("Enter Food Price");
        } else{ price.setText(data3); }

        //did not have time to set anything else
        mainImageView.setImageResource(R.drawable.pizza);

        if (hidden){
            hideSwitch.setChecked(true);
        } else {
            hideSwitch.setChecked(false);
        }


    }
}