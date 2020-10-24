package com.rangai.belajarlineardeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout layoutImanuel = findViewById(R.id.rs_imanuel);
        layoutImanuel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah_abdul_muluk = new Intent(MainActivity.this, ImanuelActivity.class);
                startActivity(pindah_abdul_muluk);
            }
        });

    }

    public void rs_abdolmuluk(View view) {
        Intent pindah_abdul_muluk = new Intent(MainActivity.this, AbdulMulukActivity.class);
        startActivity(pindah_abdul_muluk);
    }
}