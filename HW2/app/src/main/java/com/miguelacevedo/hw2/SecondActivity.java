package com.miguelacevedo.hw2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import static android.content.ContentValues.TAG;

public class SecondActivity extends Activity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.i(TAG, "onCreate: SecondActivity");

        //create reference to textView xml
        textView = findViewById(R.id.textView);

        //get Intent from main activity
        Intent intent = getIntent();

        //set intent to string variable
        String message = intent.getStringExtra("message");

        //set textView text to intent message
        textView.setText(message);


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(TAG, "onDestroy: SecondActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i(TAG, "onStop: SecondActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(TAG, "onPause: SecondActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(TAG, "onResume: SecondActivity");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(TAG, "onStart: SecondActivity");
    }
}
