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

public class LoginPage extends AppCompatActivity {
    Button SignUp;
    Button SignIn;
    Button Guest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        SignIn = findViewById(R.id.signIn);
        SignUp = findViewById(R.id.signUp);
        Guest = findViewById(R.id.Guest);

        SignIn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        SignUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });


    }
    public void openActivity2(){
        Intent intent = new Intent(this, SignIn.class);
        startActivity(intent);
    }
    public void openActivity3(){
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }
}