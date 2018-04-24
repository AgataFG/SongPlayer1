package com.example.android.songplayer1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the Button play
        Button btnPlay = (Button) findViewById(R.id.play_button);

        // Set a click listener on that View
        btnPlay.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.loboloco);
                mediaPlayer.start();
            }
        });

        // Find the Button play
        Button btnPause = (Button) findViewById(R.id.pause_button);

        // Set a click listener on that View
        btnPause.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {

                mediaPlayer.stop();
            }
        });

    }
}
