package com.elm.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);
        text.setText("0");
    }

    public void decrease(View view) {
        counter--;
        text.setText(counter+"");

    }

    public void increase(View view) {
        counter++;
        text.setText(counter+"");
    }

    public void reset(View view) {
        counter = 0;
        text.setText(counter + "");
    }
}