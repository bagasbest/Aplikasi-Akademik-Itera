package com.test3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class profilTampilan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_tampilan);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Tampilan Profil");

        Intent i = getIntent();
        String nama = i.getStringExtra("NAMA");
        String ttl = i.getStringExtra("TTL");
        String umur = i.getStringExtra("UMUR");
        String alamat = i.getStringExtra("ALAMAT");

        TextView m_tampilan_hasil = findViewById(R.id.tampilan_hasil);

        m_tampilan_hasil.setText("Nama : "+nama+"\nTtl : "+ttl+"\nUmur : "+umur+"\nAlamat : "+alamat);


    }

    public void bt_pt_selesai(View view) {
        Intent i = new Intent(profilTampilan.this, activityUtama.class);
        startActivity(i);
    }
}
