package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void next(View v)
    {
        Toast.makeText(this, "You have pressed the next button", Toast.LENGTH_LONG).show();
        Log.i("info", "You have clicked the next button");
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }

}

/* art credit
    1) https://papik.pro/en/drawings/cute/147-cute-mushroom-drawing-45-photos.html
 */