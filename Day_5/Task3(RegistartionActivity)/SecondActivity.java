package com.example.registerform;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView user_name, user_email, user_phone, user_password,gender,hooby;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle b = getIntent().getExtras();
        setContentView(R.layout.activity_second);



        user_name = findViewById(R.id.user_name);
        user_email = findViewById(R.id.user_email);
        user_phone = findViewById(R.id.user_mobile);
        user_password = findViewById(R.id.user_password);
        gender = findViewById(R.id.gender);
        hooby = findViewById(R.id.hooby);


        user_name.setText(b.getCharSequence("user_name"));
        user_email.setText(b.getCharSequence("user_email"));
        user_phone.setText(b.getCharSequence("user_phone"));
        user_password.setText(b.getCharSequence("user_password"));
        gender.setText(b.getCharSequence("gender"));
        hooby.setText(b.getCharSequence("hobby"));

    }

}
