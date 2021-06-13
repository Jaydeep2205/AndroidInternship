package com.example.registerform;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user_name, user_email, user_phone, user_password, user_Repassword;
    RadioGroup genderRadioGroup, hobbyRadioGroup;
    String selectedgender;
    Button savebtn;
    String emailPattern = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}/";
    String passwordPattern = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,30})";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user_name = findViewById(R.id.user_name);
        user_email = findViewById(R.id.user_email);
        user_phone = findViewById(R.id.user_mobile);
        user_password = findViewById(R.id.user_password);
        savebtn = findViewById(R.id.savebtn);
        genderRadioGroup = (RadioGroup) findViewById(R.id.genderRadioGroup);
        hobbyRadioGroup = (RadioGroup) findViewById(R.id.hobbyRadioGroup);
        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                Bundle b = new Bundle();
                b.putString("user_name", user_name.getText().toString());
                b.putString("user_email", user_email.getText().toString());
                b.putString("user_phone", user_phone.getText().toString());
                b.putString("user_password", user_password.getText().toString());
                int gender = genderRadioGroup.getCheckedRadioButtonId();
                RadioButton radioButton = (RadioButton) findViewById(gender);
                b.putString("gender", radioButton.getText().toString());
                intent.putExtras(b);

                int hobby = hobbyRadioGroup.getCheckedRadioButtonId();
                RadioButton radioButton2 = (RadioButton) findViewById(hobby);
                b.putString("hobby", radioButton2.getText().toString());
                intent.putExtras(b);
                //Toast.makeText(MainActivity.this,""+radioButton2.getText().toString(),Toast.LENGTH_SHORT).show();
          startActivity(intent);
            }
        });
    }
}


