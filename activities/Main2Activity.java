package com.alexvasilkov.foldablelayout.sample.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.alexvasilkov.foldablelayout.FoldableListLayout;
import com.alexvasilkov.foldablelayout.sample.R;

public class Main2Activity extends AppCompatActivity {

    ImageView img1;
    TextView tv1;
    ImageView img2;
    TextView tv2;
    ImageView img3;
    TextView tv3;
    ImageView img4;
    TextView tv4;
    ImageView img5;
    TextView tv5;
    ImageView img6;
    TextView tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        img1 = (ImageView) findViewById(R.id.img1);
        tv1 = (TextView) findViewById(R.id.tv1);
        img2 = (ImageView) findViewById(R.id.img2);
        tv2 = (TextView) findViewById(R.id.tv2);
        img3 = (ImageView) findViewById(R.id.img3);
        tv3 = (TextView) findViewById(R.id.tv3);
        img4 = (ImageView) findViewById(R.id.img4);
        tv4 = (TextView) findViewById(R.id.tv4);
        img5 = (ImageView) findViewById(R.id.img5);
        tv5 = (TextView) findViewById(R.id.tv5);
        img6 = (ImageView) findViewById(R.id.img6);
        tv6 = (TextView) findViewById(R.id.tv6);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,AmalanHarian.class);
                startActivity(intent);
            }
        });

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,AmalanHarian.class);
                startActivity(intent);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,DoaHarian.class);
                startActivity(intent);
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,DoaHarian.class);
                startActivity(intent);
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,MenyambutKelahiran.class);
                startActivity(intent);
            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,MenyambutKelahiran.class);
                startActivity(intent);
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,SolatJenazah.class);
                startActivity(intent);
            }
        });

        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,SolatJenazah.class);
                startActivity(intent);
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,UnfoldableDetailsActivity.class);
                startActivity(intent);
            }
        });

        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, UnfoldableDetailsActivity.class);
                startActivity(intent);
            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,Calculator.class);
                startActivity(intent);
            }
        });

        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,Calculator.class);
                startActivity(intent);
            }
        });

    }
}
