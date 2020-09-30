package com.example.layoutsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //este es un cometario

    public void ir_ConstraintLayoutActivity_(View view) {
        Intent i= new Intent(getApplication(), ConstraintLayoutActivity.class);
        startActivity(i);
    }
        public void ir_Guideline(View view) {
            Toast.makeText(MainActivity.this,"Guideline",Toast.LENGTH_LONG).show();
    }
}
