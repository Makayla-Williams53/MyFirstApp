package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void back(View v)
    {
        Toast.makeText(this, "You have pressed the back button", Toast.LENGTH_LONG).show();
        Log.i("info", "You have clicked the back button");
        Intent intent2 = new Intent(SecondActivity.this, MainActivity.class);
        startActivity(intent2);
    }

}