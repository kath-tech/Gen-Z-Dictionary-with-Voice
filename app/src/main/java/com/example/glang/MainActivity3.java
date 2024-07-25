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

public class MainActivity3 extends AppCompatActivity {
    private Button balikon;
    private CardView chaka;
    private CardView gora;
    private CardView lafang;
    private CardView kimi;
    private CardView lavarn;
    private CardView pak;
    private CardView awra;
    private CardView keri;
    private CardView vaketch;
    private CardView anek;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        chaka = findViewById(R.id.chaka);
        gora = findViewById(R.id.gora);
        lafang = findViewById(R.id.lafang);
        kimi = findViewById(R.id.kimi);
        lavarn = findViewById(R.id.lavarn);
        pak = findViewById(R.id.pak);
        awra = findViewById(R.id.awra);
        keri = findViewById(R.id.keri);
        vaketch = findViewById(R.id.vaketch);
        anek = findViewById(R.id.anek);

        balikon = findViewById(R.id.balikon);
        balikon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        chaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, chaka.class);
                startActivity(intent);
                finish();
            }
        });
        gora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, gora.class);
                startActivity(intent);
                finish();
            }
        });
        lafang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, lafang.class);
                startActivity(intent);
                finish();
            }
        });
        kimi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, kimi.class);
                startActivity(intent);
                finish();
            }
        });
        lavarn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, lavarn.class);
                startActivity(intent);
                finish();
            }
        });
        pak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, pak.class);
                startActivity(intent);
                finish();
            }
        });
       awra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, awra.class);
                startActivity(intent);
                finish();
            }
        });
        keri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, keri.class);
                startActivity(intent);
                finish();
            }
        });
        vaketch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, vaketch.class);
                startActivity(intent);
                finish();
            }
        });
       anek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, anek.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
