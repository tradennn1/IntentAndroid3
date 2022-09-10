package com.tradennn1.intentandroid3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText NameEntry;
    private Button changeActivityButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeActivityButton = findViewById(R.id.btn_click);
        changeActivityButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                NameEntry = findViewById(R.id.edit_text);
                intent.putExtra("Name", NameEntry.getText().toString());
                startActivity(intent);
                finish();

            }
        });
    }
}