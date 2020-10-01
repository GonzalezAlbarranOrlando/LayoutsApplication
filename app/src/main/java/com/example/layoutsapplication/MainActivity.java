package com.example.layoutsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //este es un cometarioooo

    public void ir_ConstraintLayoutActivity(View view) {
        Intent i= new Intent(getApplication(), ConstraintLayoutActivity.class);
        startActivity(i);
    }

    public void ir_Guideline(View view) {
        Intent i= new Intent(getApplication(), LinearLayoutHActivity.class);
        startActivity(i);
    }
}
