package com.example.roomln;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class A004 extends AppCompatActivity {
    Button mopen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a004);


        mopen = findViewById(R.id.open);
        mopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mopen.setVisibility(View.INVISIBLE);

            }
        });

    }
}