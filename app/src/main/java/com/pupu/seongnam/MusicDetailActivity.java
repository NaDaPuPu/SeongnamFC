package com.pupu.seongnam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class MusicDetailActivity extends AppCompatActivity {
    private TextView title, lyrics;
    private SeekBar seekBar;
    private ImageButton imageButton;
    private int position;
    private MediaPlayer mediaPlayer;
    private boolean isPlaying = false;

    MusicFragment musicFragment;

    class MyThread extends Thread {
        @Override
        public void run() {
            while(isPlaying) {
                seekBar.setProgress(mediaPlayer.getCurrentPosition());
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_detail);

        final Intent intent = getIntent();

        title = findViewById(R.id.title);
        lyrics = findViewById(R.id.lyrics);
        seekBar = findViewById(R.id.seekBar);
        imageButton = findViewById(R.id.imageButton);

        position = intent.getIntExtra("position", 0);

        title.setText(musicFragment.musics.get(position).getTitle());
        lyrics.setText(musicFragment.musics.get(position).getLyrics());
        mediaPlayer = MediaPlayer.create(this, musicFragment.musics.get(position).getMusic());

        seekBar.setMax(mediaPlayer.getDuration());

        mediaPlayer.start();
        isPlaying = true;
        new MyThread().start();

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                new MyThread();
                mediaPlayer.pause();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                mediaPlayer.seekTo(seekBar.getProgress());
                if (isPlaying) {
                    mediaPlayer.start();
                    new MyThread().start();
                }
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPlaying) {
                    imageButton.setImageResource(android.R.drawable.ic_media_play);
                    mediaPlayer.pause();
                    isPlaying = false;
                } else {
                    imageButton.setImageResource(android.R.drawable.ic_media_pause);
                    mediaPlayer.seekTo(seekBar.getProgress());
                    mediaPlayer.start();
                    isPlaying = true;
                    new MyThread().start();
                }
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        isPlaying = false;
        mediaPlayer.release();
        mediaPlayer = null;
    }
}