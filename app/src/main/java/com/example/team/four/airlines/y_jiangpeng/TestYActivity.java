package com.example.team.four.airlines.y_jiangpeng;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.team.four.airlines.MainActivity;
import com.example.team.four.airlines.R;

public class TestYActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_y);
    }
    public void Button1(View view){
        Intent intent=new Intent(TestYActivity.this, MainActivity.class);
        startActivity(intent);
    }
}

