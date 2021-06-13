package com.example.smsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etMobile,etMsg;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etMobile=findViewById(R.id.etMobile);
        etMsg=findViewById(R.id.etMsg);
        btnSend=findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no=etMobile.getText().toString();
                String msg=etMsg.getText().toString();
                SmsManager sms=SmsManager.getDefault();
                sms.sendTextMessage(no,null,msg,null,null);
                Toast.makeText(getApplicationContext(),"Message sent successfully",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
