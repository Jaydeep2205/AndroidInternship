package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GridviewDetailActivity extends AppCompatActivity {
ImageView ivimage;
TextView tvnamedetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview_detail);
        ivimage=findViewById(R.id.ivimage);
        tvnamedetail=findViewById(R.id.tvnamedetail);
        Intent intent=getIntent();
        int image=intent.getIntExtra("image",R.drawable.banana);
        ivimage.setImageResource(image);

        String name=intent.getStringExtra("name");
        tvnamedetail.setText(name);

    }
}