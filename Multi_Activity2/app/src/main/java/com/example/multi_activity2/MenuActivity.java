package com.example.multi_activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    Button buttonCustomer;
    Button buttonSales;
    Button buttonGoods;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        buttonCustomer = findViewById(R.id.buttonCustomer);
        buttonSales = findViewById(R.id.buttonSales);
        buttonGoods = findViewById(R.id.buttonGoods);

        buttonCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                setResult(101, intent);
                finish();
            }
        });

        buttonSales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                setResult(102, intent);
                finish();
            }
        });

        buttonGoods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                setResult(103, intent);
                finish();
            }
        });
    }
}