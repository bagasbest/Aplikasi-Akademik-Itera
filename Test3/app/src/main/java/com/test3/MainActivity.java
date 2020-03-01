package com.test3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
  EditText txUsername, txPassword;
  Button btSubmit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Login Page");

        txUsername =  findViewById(R.id.et_username);
        txPassword = findViewById(R.id.et_password);
        btSubmit = findViewById(R.id.bt_submit);

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(txUsername.getText().toString().equals("admin") && txPassword.getText().toString().equals("admin")) {
                   AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                   builder.setIcon(R.drawable.ic_check);
                   builder.setTitle("Berhasil Login");
                   builder.setMessage("Welcome to Siakad");

                   builder.setNegativeButton("YES", new DialogInterface.OnClickListener() {
                       @Override
                       public void onClick(DialogInterface dialog, int which) {
                           dialog.cancel();
                           openactivity_utama();

                       }
                   });
                   AlertDialog alertDialog = builder.create();
                   alertDialog.show();


               }else{
                   Toast.makeText(getApplicationContext(), "Username & Password Salah", Toast.LENGTH_SHORT).show();
               }
            }
        });
    }
    public void openactivity_utama() {
        Intent intent = new Intent(this, activityUtama.class);
        startActivity(intent);
    }

}
