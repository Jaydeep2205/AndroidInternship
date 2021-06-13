package com.example.mydemo_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NameActivity extends AppCompatActivity {
TextView tvNAme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        tvNAme=(TextView)findViewById(R.id.tvName);
        Intent intent=getIntent();
        String name= intent.getStringExtra("NAME");
        tvNAme.setText("Welcome"+name);
    }
}
