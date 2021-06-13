package com.example.mydemoapp_sum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SumActivity extends AppCompatActivity {
EditText etNum1,etNum2;
TextView tvAns;
Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);

        etNum1=findViewById(R.id.etNum1);
        etNum2=findViewById(R.id.etNum2);
        tvAns=findViewById(R.id.tvAns);
        btnSubmit=findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1,n2;
                n1=etNum1.getText().toString();
                n2=etNum2.getText().toString();
                int num1,num2,sum;
                num1=Integer.parseInt(n1);
                num2=Integer.parseInt(n2);
                sum=num1+num2;

                Toast.makeText(SumActivity.this, "Ans is"+sum, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
