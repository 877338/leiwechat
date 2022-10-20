package com.example.leiwechat;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;

public class ActivityForResult extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_result);

        Intent intent=getIntent();
        intent.putExtra("data","today is\n" +Calendar.getInstance().getTime());
        setResult(66,intent);
        String str2= intent.getStringExtra("data");
        TextView textView=findViewById(R.id.textViewx);
        textView.setText(str2);

    }
}