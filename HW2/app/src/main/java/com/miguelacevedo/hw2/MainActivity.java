package com.miguelacevedo.hw2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener {

    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create references
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

        //create listener
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        //set editText contents to a string
        String message = editText.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("message", message);
        startActivity(intent);

    }
}
