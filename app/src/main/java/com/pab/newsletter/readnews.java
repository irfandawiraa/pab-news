package com.pab.newsletter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class readnews extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_readnews);

        String judul = getIntent().getStringExtra("judul");
        String tanggal = getIntent().getStringExtra("tanggal");
        String tag = getIntent().getStringExtra("tag");
        String berita = getIntent().getStringExtra("berita");
        Integer img = getIntent().getIntExtra("img", 0);

        ImageView timg = (ImageView) findViewById(R.id.imageView2);
        TextView tjudul = (TextView) findViewById(R.id.judul);
        TextView ttanggal = (TextView) findViewById(R.id.tanggal);
        TextView ttag = (TextView) findViewById(R.id.tag);
        TextView tberita = (TextView) findViewById(R.id.artikel);

        timg.setImageResource(img);
        tjudul.setText(judul);
        ttanggal.setText(tanggal);
        ttag.setText(tag);
        tberita.setText(berita);
    }
}