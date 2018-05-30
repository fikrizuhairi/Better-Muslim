package com.alexvasilkov.foldablelayout.sample.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.alexvasilkov.foldablelayout.sample.R;

public class KeputusanFaraid extends AppCompatActivity
{

//    private TextView hartaSpouse, hartaAyah, hartaIbu, hartaSon, hartaDaughter;
//    String hSpouse = getIntent().getStringExtra("hartaSpouse");
//    String hAyah = getIntent().getStringExtra("hartaAyah");
//    String hIbu = getIntent().getStringExtra("hartaIbu");
//    String hSon = getIntent().getStringExtra("hartaSon");
//    String hDaughter = getIntent().getStringExtra("hartaDaughter");

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keputusan_faraid);
        Button buttonSelesai;

        buttonSelesai = (Button) findViewById(R.id.button5);


        Bundle bundle = getIntent().getExtras();

        String spouse = bundle.getString("spouse");
        String ayah = bundle.getString("ayah");
        String ibu = bundle.getString("ibu");
        String son = bundle.getString("son");
        String daughter = bundle.getString("daughter");

        final TextView hartaSpouse, hartaAyah, hartaIbu, hartaSon, hartaDaughter;

        hartaSpouse = (TextView)findViewById(R.id.hartaSpouse);
        hartaAyah = (TextView)findViewById(R.id.hartaAyah);
        hartaIbu = (TextView)findViewById(R.id.hartaIbu);
        hartaSon = (TextView)findViewById(R.id.hartaSon);
        hartaDaughter = (TextView)findViewById(R.id.hartaDaughter);

        double sPouse = Double.parseDouble(spouse);
        double aYah = Double.parseDouble(ayah);
        double iBu = Double.parseDouble(ibu);
        double sOn = Double.parseDouble(son);
        double dAughter = Double.parseDouble(daughter);

        hartaSpouse.setText("RM"+String.format("%.2f",sPouse));
        hartaAyah.setText("RM"+String.format("%.2f",aYah));
        hartaIbu.setText("RM"+String.format("%.2f",iBu));
        hartaSon.setText("RM"+String.format("%.2f",sOn));
        hartaDaughter.setText("RM"+String.format("%.2f",dAughter));



        buttonSelesai.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent(KeputusanFaraid.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }


}

