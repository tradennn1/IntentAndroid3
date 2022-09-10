package com.tradennn1.intentandroid3;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {
    private TextView Name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Name = findViewById(R.id.activity);
        String txtName = getIntent().getStringExtra("Name");
        Name.setText(Name.getText().toString() + " " + txtName);

    }
}