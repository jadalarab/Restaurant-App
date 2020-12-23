package com.example.staff_side;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import com.example.staff_side.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private int staffFragmentPosition = 0;
    private static final int NEW_FRAGMENT_ACTIVITY_REQUEST_CODE = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        final FloatingActionButton fab = findViewById(R.id.fab);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                if (position < 1) {
                    fab.show();
                } else {
                    fab.hide();
                }
                staffFragmentPosition = position;
            }

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                if (staffFragmentPosition == 0) {
                    Intent intent = new Intent(MainActivity.this, EditItems.class);
                    startActivityForResult(intent, NEW_FRAGMENT_ACTIVITY_REQUEST_CODE);
                }
            }
        });


    }
}