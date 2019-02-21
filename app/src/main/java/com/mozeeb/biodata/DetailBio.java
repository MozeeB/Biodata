package com.mozeeb.biodata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailBio extends AppCompatActivity {

    //TODO membuat variabel untuk menampung id detailbionya
    TextView nama, alamat, umur, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_bio);

        //TODO memasukan id kedalam variabel yang telah kita buat
        nama = (TextView) findViewById(R.id.tv_detail_nama);
        alamat = (TextView) findViewById(R.id.tv_detail_alamat);
        umur = (TextView)findViewById(R.id.tv_detail_umur);
        email = (TextView)findViewById(R.id.tv_detail_email);

        //TODO menampilkan data ke dalam detailBionya
        nama.setText(getIntent().getStringExtra("nama"));
        alamat.setText(getIntent().getStringExtra("alamat"));
        umur.setText(getIntent().getStringExtra("umur"));
        email.setText(getIntent().getStringExtra("email"));



    }
}
