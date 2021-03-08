package com.myapplicationlab1.joud_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button picFirstSong ;
    MediaPlayer mpFirstSong ;
    int playing;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        picFirstSong = (Button)findViewById(R.id.button2);
        mpFirstSong= new MediaPlayer();
        mpFirstSong = MediaPlayer.create(this,R.raw.music2);
        
        playing = 0;

        picFirstSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (playing){
                    case 0:
                        mpFirstSong.start();
                        playing = 1 ;
                        picFirstSong.setText("pause first song");

                        break;
                    case 1:
                        mpFirstSong.pause();
                        playing = 0 ;
                       picFirstSong.setText("start first song");

                        break;
                }

            }
        });

    }
}
