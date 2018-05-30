package com.alexvasilkov.foldablelayout.sample.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alexvasilkov.foldablelayout.sample.R;

public class SolatJenazah extends AppCompatActivity {

    Button sj12;
    Button sj13;
    Button sj15;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solat_jenazah);

        sj12 = (Button) findViewById(R.id.sj12);
        sj13 = (Button) findViewById(R.id.sj13);
        sj15 = (Button) findViewById(R.id.sj15);

        sj12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SolatJenazah.this,JenazahLelaki.class);
                startActivity(intent);
            }
        });

        sj13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SolatJenazah.this,JenazahPerempuan.class);
                startActivity(intent);
            }
        });

        sj15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SolatJenazah.this,Talkin.class);
                startActivity(intent);
            }
        });
    }
}
