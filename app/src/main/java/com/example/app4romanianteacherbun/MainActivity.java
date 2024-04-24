package com.example.app4romanianteacherbun;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button luniBtn, martiBtn, miercuriBtn, joiBtn, vineriBtn, sambataBtn, duminicaBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    luniBtn = findViewById(R.id.luniBtn);
    martiBtn = findViewById(R.id.martiBtn);
    miercuriBtn = findViewById(R.id.miercuriBtn);
    joiBtn = findViewById(R.id.joiBtn);
    vineriBtn = findViewById(R.id.vineriBtn);
    sambataBtn = findViewById(R.id.sambataBtn);
    duminicaBtn = findViewById(R.id.duminicaBtn);

    luniBtn.setOnClickListener(this);
    martiBtn.setOnClickListener(this);
    miercuriBtn.setOnClickListener(this);
    joiBtn.setOnClickListener(this);
    vineriBtn.setOnClickListener(this);
    sambataBtn.setOnClickListener(this);
    duminicaBtn.setOnClickListener(this);

//   daca le fac pe toate ca si mai jos: nu e profesional = boiler plate code

//    luniBtn.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            MediaPlayer mediaPlayer = MediaPlayer.create(
//                    getApplicationContext(),
//                    R.raw.luni
//            );
//            mediaPlayer.start();
//        }
//    });

    }


    @Override
    public void onClick(View v) {
        //find the button by ID and play the correct sound
        int clickedBtnId = v.getId();
        if(clickedBtnId==R.id.luniBtn){
            playSound(R.raw.luni);
        } else if (clickedBtnId==R.id.martiBtn) {
            playSound(R.raw.marti);
        }else if (clickedBtnId==R.id.miercuriBtn) {
            playSound(R.raw.miercuri);
        }else if (clickedBtnId==R.id.joiBtn) {
            playSound(R.raw.joi);
        }else if (clickedBtnId==R.id.vineriBtn) {
            playSound(R.raw.vineri);
        }else if (clickedBtnId==R.id.sambataBtn) {
            playSound(R.raw.sambata);
        }else if (clickedBtnId==R.id.duminicaBtn) {
            playSound(R.raw.duminica);
        }

    }


    public void playSound(int iD){
        MediaPlayer mediaPlayer = MediaPlayer.create(
                    this,
                    iD
            );

        mediaPlayer.start();
    }
}