package com.example.mydemoapp_sum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnsubmit;
    EditText etName;
    TextView tvName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsubmit=findViewById(R.id.btnsubmit);
        etName=findViewById(R.id.etName);
        tvName=findViewById(R.id.tvName);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nm=etName.getText().toString();
                tvName.setText("your name is"+nm);
                Toast.makeText(MainActivity.this, "Your name is "+nm, Toast.LENGTH_SHORT).show();
            }
        });
    }
}