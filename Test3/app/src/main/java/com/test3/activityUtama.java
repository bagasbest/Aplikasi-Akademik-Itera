package com.test3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class activityUtama extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Menu");

       Button profilIcon = findViewById(R.id.icon_profil);
       Button btnLogout = findViewById(R.id.bt_logout);

       btnLogout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(final View v) {
               AlertDialog.Builder builder = new AlertDialog.Builder(activityUtama.this);

               builder.setIcon(R.drawable.ic_warning);
               builder.setTitle("Peringatan Log Out");
               builder.setMessage("Apakah anda yakin ingin keluar?")
                       .setCancelable(false)
                       .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                           @Override
                           public void onClick(DialogInterface dialog, int which) {
                               Intent i = new Intent(activityUtama.this, MainActivity.class);
                               startActivity(i);

                           }
                       })

                       .setNegativeButton("No", new DialogInterface.OnClickListener() {
                           @Override
                           public void onClick(DialogInterface dialog, int which) {
                               dialog.cancel();
                           }
                       });
               AlertDialog alertDialog = builder.create();
               alertDialog.show();

           }
       });

       profilIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activityUtama.this, profilActivity.class);
                startActivity(i);
            }
        });

       Button akademikIcon = findViewById(R.id.icon_akademik);
        akademikIcon.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i = new Intent(activityUtama.this, akademikActivity.class);
               startActivity(i);
           }
       });





    }

}
