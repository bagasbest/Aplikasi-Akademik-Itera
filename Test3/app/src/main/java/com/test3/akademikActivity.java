package com.test3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class akademikActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akademik);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Akademik");
    }

    public void bt_back(View view) {
        Intent i = new Intent(akademikActivity.this, activityUtama.class);
        startActivity(i);
    }
}
