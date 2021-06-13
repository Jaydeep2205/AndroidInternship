package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class CustomListActivity extends AppCompatActivity {
ListView lv1;
int[] image=(new int[]{R.drawable.watermelon, R.drawable.banana, R.drawable.grapes, R.drawable.kivi, R.drawable.oranges});
    String[]name= {"This is Watermelon","This is banana","This is grapes","This is kivi","This is oranges"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cutom_list);
        lv1=findViewById(R.id.lv1);

        MyAdapter myAdapter=new MyAdapter(image,name, CustomListActivity.this);
        lv1.setAdapter(myAdapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(CustomListActivity.this,ListViewDetailActivity.class);
                intent.putExtra("image",image[position]);
                intent.putExtra("name", name [position]);
                startActivity(intent);
            }
        });
        }
    }