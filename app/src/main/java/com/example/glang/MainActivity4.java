package com.example.glang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity4 extends AppCompatActivity {
    private Button balikon;
    private CardView idk;
    private CardView idc;
    private CardView brb;
    private CardView iykyk;
    private CardView tbh;
    private CardView frfr;
    private CardView ftw;
    private CardView skl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);
        idk = findViewById(R.id.idk);
        idc = findViewById(R.id.idc);
        brb = findViewById(R.id.brb);
        iykyk = findViewById(R.id.iykyk);
        tbh = findViewById(R.id.tbh);
        frfr= findViewById(R.id.frfr);
        ftw = findViewById(R.id.ftw);
        skl = findViewById(R.id.skl);

        balikon = findViewById(R.id.balikon);
        balikon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        idk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4.this, idk.class);
                startActivity(intent);
                finish();
            }
        });
        idc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4.this, idc.class);
                startActivity(intent);
                finish();
            }
        });
        brb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4.this, brb.class);
                startActivity(intent);
                finish();
            }
        });
        iykyk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4.this, iykyk.class);
                startActivity(intent);
                finish();
            }
        });
        tbh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4.this, tbh.class);
                startActivity(intent);
                finish();
            }
        });
        frfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4.this, frfr.class);
                startActivity(intent);
                finish();
            }
        });
        ftw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4.this, ftw.class);
                startActivity(intent);
                finish();
            }
        });
        skl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4.this, skl.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

