package com.example.team.four.airlines.h_jingbo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.team.four.airlines.R;

public class B_TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b__test);
        System.out.println("贺静博的activity请以此activity 名字格式命名创建的Activity");
    }
}
