package com.example.glang;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class omg extends AppCompatActivity {
    private Button balikon;
    MediaPlayer mysound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_omg);
        balikon = findViewById(R.id.balikon);
        mysound = MediaPlayer.create(omg.this, R.raw.omg);
        balikon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(omg.this, MainActivity2.class);
                startActivity(intent);
                finish();
            }
        });
    }
    public void play (View view) {
        mysound.start();
    }

    @Override
    protected void onPause () {
        super.onPause();
        mysound.release();
    }
}