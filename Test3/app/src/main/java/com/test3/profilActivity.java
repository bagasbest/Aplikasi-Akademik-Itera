package com.test3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class profilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setTitle("Profil");


        final EditText pNama = findViewById(R.id.et_nama);
        final EditText pTtl = findViewById(R.id.et_ttl);
        final EditText pUmur = findViewById(R.id.et_umur);
        final EditText pAlamat = findViewById(R.id.et_alamat);
        Button pSimpan = findViewById(R.id.bt_simpan);

        pSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = pNama.getText().toString();
                String ttl = pTtl.getText().toString();
                String umur = pUmur.getText().toString();
                String alamat = pAlamat.getText().toString();

                Intent i = new Intent(profilActivity.this, profilTampilan.class);
                i.putExtra("NAMA",nama);
                i.putExtra("TTL",ttl);
                i.putExtra("UMUR",umur);
                i.putExtra("ALAMAT" ,alamat);
                startActivity(i);


            }
        });

    }


    public void bt_profil_kembali(View view) {
        Intent i = new Intent(profilActivity.this, activityUtama.class);
        startActivity(i);
    }
}
