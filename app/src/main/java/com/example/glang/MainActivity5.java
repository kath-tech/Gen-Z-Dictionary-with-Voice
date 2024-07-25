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

public class MainActivity5 extends AppCompatActivity {
    private Button balikon;
    private CardView slay;
    private CardView anyare;
    private CardView satrue;
    private CardView korique;
    private CardView cringe;
    private CardView sheesh;
    private CardView rizz;
    private CardView ghost;
    private CardView delulu;
    private CardView bet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main5);
        slay = findViewById(R.id.slay);
        anyare = findViewById(R.id.anyare);
        satrue = findViewById(R.id.satrue);
        korique = findViewById(R.id.korique);
        cringe = findViewById(R.id.cringe);
        sheesh= findViewById(R.id.sheesh);
        rizz= findViewById(R.id.rizz);
        ghost = findViewById(R.id.ghost);
        delulu = findViewById(R.id.delulu);
        bet = findViewById(R.id.bet);

        balikon = findViewById(R.id.balikon);
        balikon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity5.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        slay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity5.this, slay.class);
                startActivity(intent);
                finish();
            }
        });
        anyare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity5.this, anyare.class);
                startActivity(intent);
                finish();
            }
        });
        satrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity5.this, satrue.class);
                startActivity(intent);
                finish();
            }
        });
        korique.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity5.this, korique.class);
                startActivity(intent);
                finish();
            }
        });
        cringe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity5.this, cringe.class);
                startActivity(intent);
                finish();
            }
        });
        sheesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity5.this, sheesh.class);
                startActivity(intent);
                finish();
            }
        });
        rizz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity5.this, rizz.class);
                startActivity(intent);
                finish();
            }
        });
        ghost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity5.this, ghost.class);
                startActivity(intent);
                finish();
            }
        });
        delulu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity5.this, delulu.class);
                startActivity(intent);
                finish();
            }
        });
        bet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity5.this, bet.class);
                startActivity(intent);
                finish();
            }
        });
    }
}