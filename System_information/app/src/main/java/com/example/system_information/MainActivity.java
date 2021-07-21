package com.example.system_information;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView osName;
    TextView osArch;
    TextView osVersion;
    TextView userName;
    TextView tw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tw = findViewById(R.id.textView5);
        String str = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(("/proc/cpuinfo")));
            String line;
            while((line = reader.readLine()) != null){
                str += line + "\n";
            }
            reader.close();
        }catch (Exception e){}


        tw.setText(str);
        osName=findViewById(R.id.osName);
        osArch=findViewById(R.id.osArch);
        osVersion=findViewById(R.id.osVersion);
        userName=findViewById(R.id.userName);

        osName.setText("OS NAME : "+System.getProperty("os.name"));
        osArch.setText("OS ARCHITECTURE : " + System.getProperty("os.arch"));
        osVersion.setText("OS VERSION : " + System.getProperty("os.version"));
        userName.setText("USER NAME : " + System.getProperty("user.name"));

    }
}