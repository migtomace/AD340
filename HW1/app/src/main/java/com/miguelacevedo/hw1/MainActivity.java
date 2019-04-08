package com.miguelacevedo.hw1;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Layout;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nameTV = new TextView(this);
        TextView interestTV = new TextView(this);

        LinearLayout linearLayout = findViewById(R.id.layout);


        nameTV.setText("Miguel Acevedo");
        nameTV.setGravity(Gravity.CENTER | Gravity.TOP);
        nameTV.setTypeface(Typeface.SANS_SERIF);
        nameTV.setTextColor(Color.RED);
        nameTV.setTextSize(40);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(-1, -2,1);
        LinearLayout.LayoutParams lp2 = new LinearLayout.LayoutParams(-1, -2,3);
        nameTV.setLayoutParams(lp);
        interestTV.setText("I am deeply interested in Android Development. I have already taken four Android Development courses during my Associates at Seattle Central College. My long term goal is to seek out a career as an Android Developer at Google. I was in fact dissapointed with how little we will be spending with Android Development in this Bachelor's Program.");
        interestTV.setGravity(Gravity.START);
        interestTV.setTypeface(Typeface.SANS_SERIF);
        interestTV.setLayoutParams(lp2);
        interestTV.setTextSize(15);
        interestTV.setLetterSpacing(0.08f);
        linearLayout.addView(nameTV);
        linearLayout.addView(interestTV);

    }
}
