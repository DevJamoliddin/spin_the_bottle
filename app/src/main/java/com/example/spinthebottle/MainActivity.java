package com.example.spinthebottle;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button startBtn;
    ImageView myImageView;
    MediaPlayer spinSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startBtn = findViewById(R.id.startBtn);
        myImageView = findViewById(R.id.bottle);
        spinSound = MediaPlayer.create(this, R.raw.bottlesoundmp3cut_net);

        startBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Random random = new Random();
                int x = random.nextInt(1080) + 6480;

                myImageView.animate().rotation(myImageView.getRotation()+x).setDuration(4000);
                spinSound.start();

            }
        });
    }
}