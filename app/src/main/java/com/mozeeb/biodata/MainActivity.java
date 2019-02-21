package com.mozeeb.biodata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.mozeeb.biodata.adapter.AdapterBio;
import com.mozeeb.biodata.model.ItemBio;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyler;
    private AdapterBio Madapterbio;
    private ArrayList<ItemBio> itemBioArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AddData();
        mRecyler = (RecyclerView)findViewById(R.id.rv_bio);

        Madapterbio = new AdapterBio(this,itemBioArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        mRecyler.setLayoutManager(layoutManager);
        mRecyler.setAdapter(Madapterbio);


    }

    private void AddData() {
        itemBioArrayList = new ArrayList<>();

        itemBioArrayList.add(new ItemBio("Faruq","Kalimantan","15","Faruq@gmail.com"));
        itemBioArrayList.add(new ItemBio("Saya","Indonesia","16","Saya@gmail.com"));
        itemBioArrayList.add(new ItemBio("Aku","Bogor","14","Aku@gmail.com"));
        itemBioArrayList.add(new ItemBio("Faruq","Kalimantan","15","Faruq@gmail.com"));
        itemBioArrayList.add(new ItemBio("Faruq","Kalimantan","15","Faruq@gmail.com"));
        itemBioArrayList.add(new ItemBio("Faruq","Kalimantan","15","Faruq@gmail.com"));
        itemBioArrayList.add(new ItemBio("Faruq","Kalimantan","15","Faruq@gmail.com"));
    }
}
