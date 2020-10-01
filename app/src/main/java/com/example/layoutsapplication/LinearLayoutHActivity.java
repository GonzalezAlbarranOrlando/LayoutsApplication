package com.example.layoutsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LinearLayoutHActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout_h);
    }

    public void ir_MainActivity(View view) {
        Intent i= new Intent(getApplication(), MainActivity.class);
        startActivity(i);
    }
}