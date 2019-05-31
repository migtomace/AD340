package com.miguelacevedo.hw5;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String[] array = new String[]{"Title1","Title2","Title3","Title4","Title5","Title6"};
    private Button button;
    private TextView textView;
    private RadioGroup radioGroup;
    private RadioButton checkedRadioButton;
    private String purchaseType;
    private String movieTitle;
    private Spinner spinner;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, array);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner = findViewById(R.id.spinner);
        spinner.setAdapter(adapter);

        button = findViewById(R.id.button);
        button.setOnClickListener(this);

        textView = findViewById(R.id.price);

        editText = findViewById(R.id.edit_text);

        radioGroup = findViewById(R.id.radio);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected

                checkedRadioButton = findViewById(checkedId);
                purchaseType = checkedRadioButton.getText().toString();

            }
        });


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long arg3) {
                movieTitle = array[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });


    }


    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {

        String text = editText.getText().toString();

        try {
            int quantity = Integer.parseInt(text);
            Movie movie = new Movie(movieTitle, purchaseType);

            TextView textView = findViewById(R.id.price);
            textView.setText("Movie: " + movie.getTitle()
                    + "\nPurchase Type: " + movie.getRentOrBuy()
                    + "\nQuantity: " + quantity
                    + "\nPrice: " + movie.price(quantity));
            Log.i("Main On Click: ",text +" is a number");
        } catch (NumberFormatException e) {
            Toast.makeText(getApplicationContext(), "Check your inputs", Toast.LENGTH_SHORT).show();
            Log.i("Main On Click: ",text+" is not a number");
        }

    }


}
