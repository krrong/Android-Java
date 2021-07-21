package com.example.multi_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button buttonPrev;
    TextView textviewName;
    TextView textviewAge;
    TextView textviewAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        buttonPrev = findViewById(R.id.buttonPrev);
        textviewName = findViewById(R.id.textName);
        textviewAge = findViewById(R.id.textAge);
        textviewAddress = findViewById(R.id.textAddress);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String age = intent.getStringExtra("age");
        String address = intent.getStringExtra("address");

        textviewName.setText("이름 : " + name);
        textviewAge.setText("나이 : " + age);
        textviewAddress.setText("주소 : " + address);

    }

    public void buttonFinish(View view){
        finish();
    }
}