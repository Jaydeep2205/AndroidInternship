package com.example.day_9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
EditText etEmail,etPassword;
Button btnSignup,btnSignin;

    public static final String main_key="myprerf";
    public static final String email_key="emailkey";
    public static final String password_key="passwordkey";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etEmail=findViewById(R.id.etEmail);
        etPassword=findViewById(R.id.etPassword);
        btnSignin=findViewById(R.id.btnSignin);
        btnSignup=findViewById(R.id.btnsignup);
        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userEmail,userPassword;
                userEmail=etEmail.getText().toString();
                userPassword=etPassword.getText().toString();

                SharedPreferences preferences=getSharedPreferences(main_key,MODE_PRIVATE);
                String email=preferences.getString(email_key,"");
                String password=preferences.getString(password_key,"");

                if (userEmail.equals(email)&& userPassword.equals(password)){
                Intent intent=new Intent(LoginActivity.this,HomeActivity.class);
                startActivity(intent);
                }
                else {
                    Toast.makeText(LoginActivity.this, "Invalid Login Details...", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,SignupActivity.class);
                startActivity(intent);
            }
        });
    }
}