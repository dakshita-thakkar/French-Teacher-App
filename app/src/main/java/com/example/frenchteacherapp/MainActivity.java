package com.example.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button redBtn, yellowBtn, greenBtn, purpleBtn, blackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redBtn = findViewById(R.id.redBtn);
        greenBtn = findViewById(R.id.greenBtn);
        yellowBtn = findViewById(R.id.yellowBtn);
        blackBtn = findViewById(R.id.blackBtn);
        purpleBtn = findViewById(R.id.purpleBtn);

        redBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);
        blackBtn.setOnClickListener(this);
        purpleBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        int clickedkBtnId = v.getId();
        if(clickedkBtnId == R.id.redBtn){
            PlaySounds(R.raw.red);

        } else if (clickedkBtnId==R.id.greenBtn) {
            PlaySounds(R.raw.green);
        }else if (clickedkBtnId== R.id.yellowBtn){
            PlaySounds(R.raw.yellow);
        } else if (clickedkBtnId== R.id.purpleBtn) {
            PlaySounds(R.raw.purple);
        }else if(clickedkBtnId ==R.id.blackBtn){
            PlaySounds(R.raw.black);
        }

    }

    public void PlaySounds(int id){
        MediaPlayer mediaPlayer = MediaPlayer.create(this,id);
        mediaPlayer.start();
    }
}