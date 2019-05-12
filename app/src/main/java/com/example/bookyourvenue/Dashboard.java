package com.example.bookyourvenue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;



public class Dashboard extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Button btnAdd;
    private ImageView refresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        recyclerView = findViewById(R.id.recyclerview);
        btnAdd = findViewById(R.id.btnAdd);
        refresh = findViewById(R.id.refresh);

        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Dashboard.class);
                startActivity(intent);
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }}
