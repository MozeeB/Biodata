package com.mozeeb.biodata.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mozeeb.biodata.DetailBio;
import com.mozeeb.biodata.R;
import com.mozeeb.biodata.model.ItemBio;

import java.util.ArrayList;
import java.util.List;

public class AdapterBio extends RecyclerView.Adapter<AdapterBio.MyViewHolder> {

    private Context mContext;
    private List<ItemBio> itemBioList;

    public AdapterBio(Context context, List<ItemBio> itemBioList) {
        this.mContext = context;
        this.itemBioList = itemBioList;
    }




    @NonNull
    @Override
    public AdapterBio.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_bio, viewGroup, false)) ;
    }

    @Override
    public void onBindViewHolder(@NonNull final AdapterBio.MyViewHolder myViewHolder, final int i) {

        //TODO menampilkan data kedalam layout item_bio.xml nya
        myViewHolder.nama.setText(itemBioList.get(i).getNama());
        myViewHolder.alamat.setText(itemBioList.get(i).getAlamat());
        myViewHolder.umur.setText(itemBioList.get(i).getUmur());
        myViewHolder.email.setText(itemBioList.get(i).getEmail());

        //TODO untuk membawa data ke activity lain/ ke DetailBio
        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(mContext, DetailBio.class);
                in.putExtra("nama", itemBioList.get(i).getNama());
                in.putExtra("alamat", itemBioList.get(i).getAlamat());
                in.putExtra("umur", itemBioList.get(i).getUmur());
                in.putExtra("email", itemBioList.get(i).getEmail());
                mContext.startActivity(in);
            }
        });




    }

    @Override
    public int getItemCount() {
        return itemBioList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        //TODO membuat variabel penampung id
        TextView nama, alamat, umur, email;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            //TODO mengisi variable dengan id yang ada di item_bio.xml
            nama = (TextView) itemView.findViewById(R.id.tv_nama);
            alamat = (TextView) itemView.findViewById(R.id.tv_alamat);
            umur = (TextView)itemView.findViewById(R.id.tv_umur);
            email = (TextView) itemView.findViewById(R.id.tv_email);

        }
    }
}
