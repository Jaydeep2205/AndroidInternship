package com.example.callapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EmailActivity extends AppCompatActivity {
    EditText etTo,etSubject,etMessage;
    Button btnsend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        etTo=(EditText) findViewById(R.id.editText1_email1);
        etMessage=(EditText)findViewById(R.id.editText3_message);
        etSubject=(EditText)findViewById(R.id.editText2_subject);
        btnsend=(Button) findViewById(R.id.btnsend);
        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String to=etTo.getText().toString();
                String subject=etSubject.getText().toString();
                String message=etMessage.getText().toString();

                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
                intent.putExtra(Intent.EXTRA_SUBJECT,subject);
                intent.putExtra(Intent.EXTRA_TEXT,message);
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent,"send email"));
            }
        });
    }
}
