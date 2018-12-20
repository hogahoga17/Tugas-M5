package com.hoga.tugas5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.nuzul.nuzultugas5.R;

public class HalamanProfil extends AppCompatActivity {
    TextView tvNim, tvNama, tvTlp, tvKampus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_profil);

        tvNim = findViewById(R.id.tvNim);
        tvNama = findViewById(R.id.tvNama);
        tvTlp = findViewById(R.id.tvTlp);
        tvKampus = findViewById(R.id.tvKampus);

        Intent i = getIntent();
        String nama = i.getStringExtra("nama");
        String nim = i.getStringExtra("nim");
        String tlp = i.getStringExtra("tlp");
        String kampus = i.getStringExtra("kampus");

        tvNim.setText(nim);
        tvNama.setText(nama);
        tvTlp.setText(tlp);
        tvKampus.setText(kampus);
    }
}
