package com.example.android.pokercount;


import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private TextView timeView;
    private Button startStopButton;
    private CountDownTimer countDownTimer;
    private long timeLeftMilliseconds = 600000;
    private boolean timerRunning = false;
    private ArrayList<LevelBlinds> blinds;

    private EditText duracaoRodadaView;
    private EditText numeroRodadasIntervaloView;
    private int duracaoRodada;
    private int numeroRodadasIntervalo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numeroRodadasIntervaloView = findViewById(R.id.numeroRodadasIntervalo);

        Button settingsButton = findViewById(R.id.settings_button);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SettingsActivity.class));
            }
        });

        timeView = findViewById(R.id.time_view);
        startStopButton = findViewById(R.id.start_stop_button);

        updateTimerText();

        startStopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startStop();
            }
        });

        blinds = getIntent().getParcelableArrayListExtra("blinds");

    }

    public void startStop (){
        if (timerRunning){
            stopTimer();
            startStopButton.setText("Continuar");
        }
        else {
            startTimer();
            startStopButton.setText("Pausar");
        }

    }

    public void stopTimer (){
        countDownTimer.cancel();
        timerRunning = false;
    }

    public void startTimer (){
        countDownTimer = new CountDownTimer(timeLeftMilliseconds, 1000) {
            @Override
            public void onTick(long l) {
                timeLeftMilliseconds = l;
                updateTimerText();
            }

            @Override
            public void onFinish() {
                timeView.setText("00:00");
            }
        }.start();
        timerRunning = true;
    }

    public void updateTimerText(){
        int minutes = (int) timeLeftMilliseconds /60000;
        int seconds = (int) (timeLeftMilliseconds % 60000) / 1000;

        String timeLeftText = "";
        if (minutes < 10){timeLeftText += "0" + minutes;} else{timeLeftText += minutes;}
        timeLeftText += ":";
        if (seconds < 10){timeLeftText += "0" + seconds;} else {timeLeftText += seconds;}

        timeView.setText(timeLeftText);
    }

}
