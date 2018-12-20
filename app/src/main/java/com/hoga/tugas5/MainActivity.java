package com.hoga.tugas5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hoga.tugas5.Adapter.RVAdapter;
import com.hoga.tugas5.Model.Data;
import com.nuzul.nuzultugas5.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private RecyclerView.LayoutManager lm;
    private RecyclerView.Adapter a;
    private List<Data> myData = new ArrayList<>();
    private Data data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv);
        rv.setHasFixedSize(true);

        lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        data = new Data("Kalkulator",R.drawable.kalkul);
        myData.add(data);
        data = new Data("Profil",R.drawable.data);
        myData.add(data);
        data = new Data("Halaman bergambar",R.drawable.random);
        myData.add(data);

        a = new RVAdapter(myData);
        rv.setAdapter(a);
    }
}