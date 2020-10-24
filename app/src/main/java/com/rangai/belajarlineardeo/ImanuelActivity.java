package com.rangai.belajarlineardeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ImanuelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imanuel);
    }

    public void map(View view) {
        Uri link_imanuel = Uri.parse("google.navigation:q=Rumah+Sakit+Imanuel+Way+Halim");
        Intent buka_maps = new Intent(Intent.ACTION_VIEW,link_imanuel);
        startActivity(buka_maps);
    }
}