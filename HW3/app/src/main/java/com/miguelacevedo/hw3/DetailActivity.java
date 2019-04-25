package com.miguelacevedo.hw3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.miguelacevedo.hw3.RecyclerViewAdapter.DESCRIPTION;
import static com.miguelacevedo.hw3.RecyclerViewAdapter.NAME;
import static com.miguelacevedo.hw3.RecyclerViewAdapter.TITLE;
import static com.miguelacevedo.hw3.RecyclerViewAdapter.URL;
import static com.miguelacevedo.hw3.RecyclerViewAdapter.YEAR;

public class DetailActivity extends AppCompatActivity {

//    declare variables
    TextView title, year, name, url, description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

//        reference views
        title = findViewById(R.id.title);
        year = findViewById(R.id.year);
        name = findViewById(R.id.name);
        url = findViewById(R.id.url);
        description = findViewById(R.id.description);

//        set intent to views
        Intent intent = getIntent();
        String mtitle = intent.getStringExtra(TITLE);
        String myear = intent.getStringExtra(YEAR);
        String mname = intent.getStringExtra(NAME);
        String murl = intent.getStringExtra(URL);
        String mdescription = intent.getStringExtra(DESCRIPTION);

        title.setText(mtitle);
        year.setText(myear);
        name.setText(mname);
        url.setText(murl);
        description.setText(mdescription);


    }
}
