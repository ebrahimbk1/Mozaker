package com.example.mozaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button swm =(Button) findViewById(R.id.swm);

        swm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent swn = new Intent(MainActivity.this,saba7Wmasas2.class);
                startActivity(swn);
            }
        });

        Button collection =(Button) findViewById(R.id.collection);

        collection.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent collection = new Intent(MainActivity.this,collection.class);
                startActivity(collection);
            }
        });

        Button master =(Button) findViewById(R.id.master);

        master.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent master = new Intent(MainActivity.this,master.class);
                startActivity(master);
            }
        });

        final Button free =(Button) findViewById(R.id.free);

        free.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent free = new Intent(MainActivity.this,free.class);
                startActivity(free);
            }
        });
    }


}
