package com.hoga.tugas5.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hoga.tugas5.HalamanGambar;
import com.hoga.tugas5.HalamanKalkulator;
import com.hoga.tugas5.HalamanProfil;
import com.hoga.tugas5.Model.Data;
import com.nuzul.nuzultugas5.R;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.DataViewHolder> {

    public List<Data> myData;
    public RVAdapter(List<Data> myData) {
        this.myData = myData;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false );
        DataViewHolder pvh = new DataViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {
        Data data = myData.get(position);
        holder.img.setImageResource(data.getGambar());
        holder.tvNama.setText(data.getNama());
    }

    @Override
    public int getItemCount() {
        return myData.size();
    }

    public class DataViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView tvNama;
        CardView cv;
        Context context;

        public DataViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.img);
            tvNama = itemView.findViewById(R.id.tv);

            context = itemView.getContext();
            cv = itemView.findViewById(R.id.cv);

            cv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent();
                    switch (getAdapterPosition()){
                        case 0:
                            i = new Intent(context, HalamanKalkulator.class);
                            break;
                        case 1:
                            i = new Intent(context, HalamanProfil.class);
                            i.putExtra("nama", "Septa Hoga Smara");
                            i.putExtra("nim", "1641720152");
                            i.putExtra("tlp", "082251238946");
                            i.putExtra("kampus", "Polinema");
                            break;
                        case 2:
                            i = new Intent(context, HalamanGambar.class);
                            break;
                    }
                    context.startActivity(i);
                }
            });
        }
    }
}