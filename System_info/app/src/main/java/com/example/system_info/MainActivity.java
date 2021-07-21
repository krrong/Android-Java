package com.example.system_info;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileReader;

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

        tw = findViewById(R.id.Systeminfo);
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