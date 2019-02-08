package com.example.paola.leccion_suma;

import android.media.MediaPlayer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class pantalla extends AppCompatActivity {

    TextView intentos;
    TextView correctos;
    TextView incorrectos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla);

        MediaPlayer mp = MediaPlayer.create(this, R.raw.instrucciones);
        mp.start();




    }
}
