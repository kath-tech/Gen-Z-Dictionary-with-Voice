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

public class MainActivity2 extends AppCompatActivity {
    private Button balikon;
    private CardView omg;
    private CardView sk;
    private CardView sana;
    private CardView luh;
    private CardView oa;
    private CardView amaccana;
    private CardView  dasurb;
    private CardView omsim;
    private CardView yarn;
    private CardView glowup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        balikon = findViewById(R.id.balikon);
        omg = findViewById(R.id.omg);
        sk = findViewById(R.id.sk);
        sana = findViewById(R.id.sana);
        luh = findViewById(R.id.luh);
        oa = findViewById(R.id.oa);
        amaccana = findViewById(R.id.amaccana);
        dasurb = findViewById(R.id.dasurb);
        omsim = findViewById(R.id.omsim);
        yarn = findViewById(R.id.yarn);
        glowup = findViewById(R.id.glowup);

        balikon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        omg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, omg.class);
                startActivity(intent);
                finish();
            }
        });
        sk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, sk.class);
                startActivity(intent);
                finish();
            }
        });
        sana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, sana.class);
                startActivity(intent);
                finish();
            }
        });
        luh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, luh.class);
                startActivity(intent);
                finish();
            }
        });
        oa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, oa.class);
                startActivity(intent);
                finish();
            }
        });
        amaccana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, amaccana.class);
                startActivity(intent);
                finish();
            }
        });
        dasurb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, dasurb.class);
                startActivity(intent);
                finish();
            }
        });
        omsim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, omsim.class);
                startActivity(intent);
                finish();
            }
        });
        yarn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, yarn.class);
                startActivity(intent);
                finish();
            }
        });
        glowup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, glowup.class);
                startActivity(intent);
                finish();
            }
        });

    }
}