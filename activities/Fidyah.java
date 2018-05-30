package com.alexvasilkov.foldablelayout.sample.activities;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.alexvasilkov.foldablelayout.sample.R;

import java.util.Calendar;

public class Fidyah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fidyah);
        final Button button_calc = (Button) findViewById(R.id.button_calc);
        final EditText field_hari = (EditText) findViewById(R.id.field_hari);
        final EditText field_tahun = (EditText) findViewById(R.id.field_tahun);
        final EditText field_hari1 = (EditText) findViewById(R.id.field_hari1);
        final EditText field_tahun1 = (EditText) findViewById(R.id.field_tahun1);
        final EditText field_hari2 = (EditText) findViewById(R.id.field_hari2);
        final EditText field_tahun2 = (EditText) findViewById(R.id.field_tahun2);
        final TextView view_result = (TextView) findViewById(R.id.view_result);

        button_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Calendar calendar = Calendar.getInstance();
                double year = calendar.get(Calendar.YEAR);
                double hari = 0.00;
                double tahun = 0.00;
                double hari1 = 0.00;
                double tahun1 = 0.00;
                double hari2 = 0.00;
                double tahun2 = 0.00;
                double bayaran;
                double temptahun = 0.00;
                double temptahun1 = 0.00;
                double temptahun2 = 0.00;
                double kadar_fidyah = 1.8;

                if(((field_hari.getText().toString().equals("") && field_tahun.getText().toString().equals("")))&&((field_hari.getText().toString().equals("") && field_tahun.getText().toString().equals("")))&&((field_hari1.getText().toString().equals("") && field_tahun1.getText().toString().equals("")))&&((field_hari1.getText().toString().equals("") && field_tahun1.getText().toString().equals("")))&&((field_hari2.getText().toString().equals("") && field_tahun2.getText().toString().equals("")))&&((field_hari2.getText().toString().equals("") && field_tahun2.getText().toString().equals("")))) {
                    Toast.makeText(getApplicationContext(), "Maklumat tidak mencukupi!", Toast.LENGTH_SHORT).show();
                }else {
                    if (((field_hari1.getText().toString() != null) && (field_tahun1.getText().toString() != null)) && ((field_hari.getText().toString().equals("") || field_tahun.getText().equals(""))) && ((field_hari2.getText().toString().equals("") || field_tahun2.getText().equals("")))) {
                        hari1 = Double.parseDouble(field_hari1.getText().toString());
                        tahun1 = Double.parseDouble(field_tahun1.getText().toString());

                        temptahun1 = year - tahun1;

                        bayaran = hari1 * temptahun1 * kadar_fidyah /*+ (hari1 * temptahun1 * kadar_fidyah) + (hari2 * temptahun2 * kadar_fidyah))*/;

                        view_result.setText("RM" + (String.format("%.2f", bayaran)));
////                          view_result.setText(String.format("%.2f",temptahun));
//
                    } else if (((field_hari2.getText().toString() != null) && (field_tahun2.getText().toString() != null)) && ((field_hari.getText().toString().equals("") || field_tahun.getText().equals(""))) && ((field_hari1.getText().toString().equals("") || field_tahun1.getText().equals("")))) {
                        hari2 = Double.parseDouble(field_hari2.getText().toString());
                        tahun2 = Double.parseDouble(field_tahun2.getText().toString());

                        temptahun2 = year - tahun2;

                        bayaran = hari2 * temptahun2 * kadar_fidyah /*+ (hari1 * temptahun1 * kadar_fidyah) + (hari2 * temptahun2 * kadar_fidyah))*/;

                        view_result.setText("RM" + (String.format("%.2f", bayaran)));
////                          view_result.setText(String.format("%.2f",temptahun));
//
                    } else if (((field_hari.getText().toString() != null) && (field_tahun.getText().toString() != null)) && ((field_hari1.getText().toString() != null) && (field_tahun1.getText().toString() != null)) && ((field_hari2.getText().toString().equals("") || field_tahun2.getText().equals("")))) {
                        hari = Double.parseDouble(field_hari.getText().toString());
                        tahun = Double.parseDouble(field_tahun.getText().toString());
                        hari1 = Double.parseDouble(field_hari1.getText().toString());
                        tahun1 = Double.parseDouble(field_tahun1.getText().toString());

                        temptahun = year - tahun;
                        temptahun1 = year - tahun1;


                        bayaran = ((hari * temptahun * kadar_fidyah) + (hari1 * temptahun1 * kadar_fidyah)) /*+ (hari2 * temptahun2 * kadar_fidyah))*/;

                        view_result.setText("RM" + (String.format("%.2f", bayaran)));

                    } else if (((field_hari.getText().toString() != null) && (field_tahun.getText().toString() != null)) && ((field_hari1.getText().toString().equals("") || field_tahun1.getText().equals(""))) && ((field_hari2.getText().toString() != null) && (field_tahun2.getText().toString() != null))) {
                        hari = Double.parseDouble(field_hari.getText().toString());
                        tahun = Double.parseDouble(field_tahun.getText().toString());
                        hari2 = Double.parseDouble(field_hari2.getText().toString());
                        tahun2 = Double.parseDouble(field_tahun2.getText().toString());

                        temptahun = year - tahun;
                        temptahun2 = year - tahun2;


                        bayaran = ((hari * temptahun * kadar_fidyah) + (hari2 * temptahun2 * kadar_fidyah)) /*+ (hari2 * temptahun2 * kadar_fidyah))*/;

                        view_result.setText("RM" + (String.format("%.2f", bayaran)));
//
                    } else if (((field_hari.getText().toString() != null) && (field_tahun.getText().toString() != null)) && ((field_hari1.getText().toString() != null && field_tahun1.getText() != null)) && ((field_hari2.getText().toString() != null) && (field_tahun2.getText() != null))) {
                        hari1 = Double.parseDouble(field_hari1.getText().toString());
                        tahun1 = Double.parseDouble(field_tahun1.getText().toString());
                        hari = Double.parseDouble(field_hari.getText().toString());
                        tahun = Double.parseDouble(field_tahun.getText().toString());
                        hari2 = Double.parseDouble(field_hari2.getText().toString());
                        tahun2 = Double.parseDouble(field_tahun2.getText().toString());

                        temptahun = year - tahun;
                        temptahun1 = year - tahun1;
                        temptahun2 = year - tahun2;

                        bayaran = ((hari * temptahun * kadar_fidyah) + (hari1 * temptahun1 * kadar_fidyah) + (hari2 * temptahun2 * kadar_fidyah));

                        view_result.setText("RM" + (String.format("%.2f", bayaran)));
                    } else if (((field_hari.getText().toString() != null) && (field_tahun.getText().toString() != null)) && ((field_hari1.getText().toString().equals("") || field_tahun1.getText().equals(""))) && ((field_hari2.getText().toString().equals("") || field_tahun2.getText().equals("")))) {
                        hari = Double.parseDouble(field_hari.getText().toString());
                        tahun = Double.parseDouble(field_tahun.getText().toString());

                        temptahun = year - tahun;

                        bayaran = hari * temptahun * kadar_fidyah /*+ (hari1 * temptahun1 * kadar_fidyah) + (hari2 * temptahun2 * kadar_fidyah))*/;

                        view_result.setText("RM" + (String.format("%.2f", bayaran)));
////                          view_result.setText(String.format("%.2f",temptahun));
//
                    }
                }
            }

        });

//        if (((field_hari.getText().toString().equals("") || field_tahun.getText().toString().equals(""))) || ((field_hari.getText().toString().equals("") && field_tahun.getText().toString().equals("")))
//                || ((field_hari1.getText().toString().equals("") || field_tahun1.getText().toString().equals(""))) || ((field_hari1.getText().toString().equals("") && field_tahun1.getText().toString().equals("")))
//                || ((field_hari2.getText().toString().equals("") || field_tahun2.getText().toString().equals(""))) || ((field_hari2.getText().toString().equals("") && field_tahun2.getText().toString().equals(""))))
//        {
//            Toast.makeText(getApplicationContext(), "All details must be fill2!", Toast.LENGTH_SHORT).show();
//        } else {
//            hari1 = Double.parseDouble(field_hari1.getText().toString());
//            tahun1 = Double.parseDouble(field_tahun1.getText().toString());
//            hari = Double.parseDouble(field_hari.getText().toString());
//            tahun = Double.parseDouble(field_tahun.getText().toString());
//            hari2 = Double.parseDouble(field_hari2.getText().toString());
//            tahun2 = Double.parseDouble(field_tahun2.getText().toString());
//
//            if(((field_hari.getText().toString()!=null && field_hari.getText().toString()!=null))&&((field_hari1.getText().toString().equals("") || field_tahun1.getText().toString().equals(""))) || ((field_hari1.getText().toString().equals("") && field_tahun1.getText().toString().equals(""))))
//            {
//                temptahun = year - tahun;
////                        temptahun1 = year - tahun1;
////                        temptahun2 = year - tahun2;
//
//                bayaran = (hari * temptahun * kadar_fidyah) /*+ (hari1 * temptahun1 * kadar_fidyah) + (hari2 * temptahun2 * kadar_fidyah))*/;
//
//                view_result.setText("RM" + (String.format("%.2f", bayaran)));
////                          view_result.setText(String.format("%.2f",temptahun));
//
//            }
//            if ((field_hari1.getText().toString()!=null && field_hari1.getText().toString()!=null))
//            {
//
//            }
//            if((field_hari.getText().toString()!=null && field_hari.getText().toString()!=null))
//            {
//
//            }
//
//
//        }

    }
}
