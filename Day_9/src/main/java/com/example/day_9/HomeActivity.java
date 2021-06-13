package com.example.day_9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView text_name,text_email,text_number;
Button btnlogout;
SharedPreferences sharedPreferences;
    public static final String main_key="myprerf";
    public static final String name_key="namekey";
    public static final String email_key="emailkey";
    public static final String number_key="numberkey";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        text_number=findViewById(R.id.text_Number);
        text_name=findViewById(R.id.text_name);
        text_email=findViewById(R.id.text_email);
        btnlogout=findViewById(R.id.btnlogout);
        sharedPreferences=getSharedPreferences(main_key,MODE_PRIVATE);
        String name=sharedPreferences.getString(name_key,"");
        String email=sharedPreferences.getString(email_key,"");
        String number=sharedPreferences.getString(number_key,"");
        if(name !=null || email!=null || number!=null){
        text_name.setText(sharedPreferences.getString(name_key,""));
            text_email.setText(sharedPreferences.getString(email_key,""));
            text_number.setText(sharedPreferences.getString(number_key,""));

        }

        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences=getSharedPreferences(main_key,MODE_PRIVATE);
                SharedPreferences.Editor editor=preferences.edit();
                editor.clear();
                editor.commit();
                finish();
                moveTaskToBack(true);
            }
        });
    }
}