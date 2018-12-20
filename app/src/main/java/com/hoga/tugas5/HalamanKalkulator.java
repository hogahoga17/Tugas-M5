package com.hoga.tugas5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.nuzul.nuzultugas5.R;

public class HalamanKalkulator extends AppCompatActivity {

    EditText et1, et2;
    RadioButton rbTambah, rbKurang, rbKali, rbBagi;
    Button btnHitung;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_kalkulator);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        rbTambah = findViewById(R.id.rbTambah);
        rbKurang = findViewById(R.id.rbKurang);
        rbKali = findViewById(R.id.rbKali);
        rbBagi = findViewById(R.id.rbBagi);
        btnHitung = findViewById(R.id.btnHitung);
        tvHasil = findViewById(R.id.tvHasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double angka1, angka2, hasil;
                angka1 = Double.parseDouble(et1.getText().toString());
                angka2 = Double.parseDouble(et2.getText().toString());

                if(rbTambah.isChecked())
                {
                    hasil = angka1+angka2;
                }
                else if(rbKurang.isChecked())
                {
                    hasil = angka1-angka2;
                }
                else if(rbKali.isChecked())
                {
                    hasil = angka1*angka2;
                }
                else
                {
                    hasil = angka1/angka2;
                }

                tvHasil.setText(String.valueOf(hasil));
            }
        });
    }
}