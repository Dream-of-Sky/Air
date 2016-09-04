package com.example.team.four.airlines.z_fan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.team.four.airlines.R;

public class F_TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f__test);
        System.out.println("张帆的activity请以此activity 名字格式命名创建的Activity");
    }
}
