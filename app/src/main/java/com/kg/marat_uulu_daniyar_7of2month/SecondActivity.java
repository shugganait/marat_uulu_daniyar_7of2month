package com.kg.marat_uulu_daniyar_7of2month;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private String value;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String text = getIntent().getStringExtra("result");
        ((TextView)findViewById(R.id.tv_result)).setText(text);
        findViewById(R.id.btn_destroy).setOnClickListener(v -> {
                finishAffinity();
        });
    }
}