package com.example.multi_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonConfirm;
    EditText textName;
    EditText textAge;
    EditText textAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonConfirm = findViewById(R.id.buttonConfirm);
        textName = findViewById(R.id.editTextName);
        textAge = findViewById(R.id.editTextAge);
        textAddress = findViewById(R.id.editTextAddress);

        buttonConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = textName.getText().toString();
                String age = textAge.getText().toString();
                String address = textAddress.getText().toString();

                if(name.equals("") || age.equals("") || address.equals("")){
                    Toast.makeText(getApplicationContext(),
                            "이름, 나이, 주소 모두 입력해주세요", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                    intent.putExtra("name", name);
                    intent.putExtra("age", age);
                    intent.putExtra("address", address);

                    startActivity(intent);
                }
            }
        });

    }

}