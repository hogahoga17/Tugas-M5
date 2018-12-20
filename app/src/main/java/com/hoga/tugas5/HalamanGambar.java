package com.hoga.tugas5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.nuzul.nuzultugas5.R;

import java.util.Random;

public class HalamanGambar extends AppCompatActivity {
    ImageView imgRandom;
    Button btnRandom;
    Random random;
    Integer[] img = {R.drawable.a, R.drawable.b, R.drawable.c};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_gambar);

        imgRandom = findViewById(R.id.imgRandom);
        btnRandom = findViewById(R.id.btnRandom);
        random = new Random();

        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgRandom.setImageResource(img[random.nextInt(img.length)]);
            }
        });
    }
}