package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
GridView gridView;
    String[]name= {"This is banana","This is grapes","This is kivi","This is oranges"};
    int[] image={R.drawable.banana,R.drawable.grapes,R.drawable.kivi,R.drawable.oranges};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView =findViewById(R.id.grid_view);
        MainAdapter mainAdapter=new MainAdapter(MainActivity.this,image,name);
        gridView.setAdapter(mainAdapter);
        gridView.setOnItemClickListener(new  AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this,GridviewDetailActivity.class);
                intent.putExtra("image",image[position]);
                intent.putExtra("name",name[position]);
                startActivity(intent);
                //Toast.makeText(getApplicationContext(),"you clicked"+name[+position],Toast.LENGTH_SHORT).show();
            }
        });
    }
}
