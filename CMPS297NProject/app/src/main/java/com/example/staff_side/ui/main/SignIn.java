package com.example.staff_side.ui.main;

import android.content.Intent;
import android.os.Bundle;

import com.example.staff_side.MainActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

import com.example.staff_side.R;

public class SignIn extends AppCompatActivity {
    Button Enter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        Enter = findViewById(R.id.Enter);

        Enter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openMainactivity2();
            }
        });


    }
    public void openMainactivity2(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}