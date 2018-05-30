package com.alexvasilkov.foldablelayout.sample.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.alexvasilkov.foldablelayout.sample.R;

import static com.alexvasilkov.foldablelayout.sample.R.id.radioFemale;
import static com.alexvasilkov.foldablelayout.sample.R.id.radioMale;

public class PengiraanFaraid extends AppCompatActivity {

    private Button btnKira;
    private EditText etHarta, etSpouse, etAyah, etIbu, etSon, etDaughter;
    private TextView tvResult;
    private RadioGroup radioGroup;
    private RadioButton radioButton;

    double hartaSpouse = 0;
    double hartaAyah = 0;
    double hartaIbu = 0;
    double hartaSon = 0;
    double hartaDaughter = 0;
    double temp = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengiraan_faraid);
        init();
    }

    private void init() {
        btnKira = (Button) findViewById(R.id.btnKira);

        radioGroup = (RadioGroup) findViewById(R.id.radioSex);

        etHarta = (EditText) findViewById(R.id.bilHarta);
        etSpouse = (EditText) findViewById(R.id.bilSpouse);
        etAyah = (EditText) findViewById(R.id.bilAyah);
        etIbu = (EditText) findViewById(R.id.bilIbu);
        etSon = (EditText) findViewById(R.id.bilSon);
        etDaughter = (EditText) findViewById(R.id.bilDaughter);
        tvResult = (TextView) findViewById(R.id.tvResult);

        btnKira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int gender = radioGroup.getCheckedRadioButtonId();
                int totalHarta = Integer.parseInt(etHarta.getText().toString());
                int bilSpouse = Integer.parseInt(etSpouse.getText().toString());
                int bilAyah = Integer.parseInt(etAyah.getText().toString());
                int bilIbu = Integer.parseInt(etIbu.getText().toString());
                int bilSon = Integer.parseInt(etSon.getText().toString());
                int bilDaughter = Integer.parseInt(etDaughter.getText().toString());
                // Integer.parseInt(myEditText.getText().toString())

                radioButton = (RadioButton) findViewById(gender);

                //harta untuk suami
                if ((gender == radioMale && bilSpouse == 0) || (gender == radioFemale && bilSpouse == 0))
                {
                    hartaSpouse = 0;
                }
                else if (gender == radioFemale && bilSpouse != 0)
                {
                    if (bilSon == 0 && bilDaughter == 0)
                    {
                        hartaSpouse = (0.5 * totalHarta)/ bilSpouse;
                    }
                    else if (bilSon >= 1 || bilDaughter >= 1)
                    {
                        hartaSpouse = (0.25 * totalHarta)/ bilSpouse;
                    }
                    temp = totalHarta - hartaSpouse;
                }

                //harta untuk isteri
                else if (gender == radioMale && bilSpouse != 0)
                {
                    if (bilSon == 0 && bilDaughter == 0)
                    {
                        hartaSpouse = (0.25 * totalHarta) ;
                    }
                    else if (bilSon >= 1 || bilDaughter >= 1)
                    {
                        hartaSpouse = (0.125 * totalHarta) ;
                    }

                    temp = totalHarta - hartaSpouse;
                }

                //harta untuk ayah
                if (bilAyah != 0)
                {
                    hartaAyah = 0.1667 * totalHarta;
                    temp = temp - hartaAyah;
                }
                else
                {
                    hartaAyah = 0;
                }

                //harta untuk ibu
                if (bilIbu != 0)
                {
                    if (bilSon != 0 || bilDaughter != 0)
                    {
                        hartaIbu = 0.1667 * totalHarta;
                    }
                    else if (bilSon == 0 && bilDaughter == 0)
                    {
                        hartaIbu = 0.3333 * temp;
                        //harta untuk son and daughter
                    }

                    temp = temp - hartaIbu;
                }
                else
                {
                    hartaIbu = 0;
                }

                //harta anak anak
                if (bilSon == 0 && bilDaughter == 0)
                {
                    hartaSon = 0;
                    hartaDaughter = 0;
                }
                else if (bilSon == 0 && bilDaughter == 1)
                {
                    hartaSon = 0;
                    hartaDaughter = 0.5 * temp;
                }
                else if (bilSon == 0 && bilDaughter >= 1)
                {
                    hartaSon = 0;
                    hartaDaughter = (0.6667 * temp) / bilDaughter;
                }
                else if (bilSon >= 1 && bilDaughter == 0)
                {
                    hartaDaughter = 0;
                    hartaSon = temp / bilSon;
                }
                else
                {
                    hartaSon = (0.6667 * temp) / bilSon;
                    temp = temp - (hartaSon * bilSon);
                    hartaDaughter = temp / bilDaughter;
                }


                String hSpouse = Double.toString(hartaSpouse);
                String hAyah = Double.toString(hartaAyah);
                String hIbu = Double.toString(hartaIbu);
                String hSon = Double.toString(hartaSon);
                String hDaughter = Double.toString(hartaDaughter);

                Intent i = new Intent(PengiraanFaraid.this, KeputusanFaraid.class);

                Bundle bundle = new Bundle();

                bundle.putString("spouse", hSpouse);
                bundle.putString("ayah", hAyah);
                bundle.putString("ibu", hIbu);
                bundle.putString("son", hSon);
                bundle.putString("daughter", hDaughter);

                i.putExtras(bundle);

                startActivity(i);
//        Intent i = new Intent(PengiraanFaraid.this, PengiraanFaraid2.class);
//        i.putExtra("hartaSpouse", hartaSpouse);
//        i.putExtra("hartaAyah", hartaAyah);
//        i.putExtra("hartaIbu", hartaIbu);
//        i.putExtra("hartaSon", hartaSon);
//        i.putExtra("hartaDaughter", hartaDaughter);
//        startActivity(i);

            }
        });
    }
}
