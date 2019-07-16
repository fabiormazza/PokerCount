package com.example.android.pokercount;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        final ArrayList<LevelBlinds> blinds = new ArrayList<>();

        blinds.add(new LevelBlinds(10, 20, 0));
        blinds.add(new LevelBlinds(15, 30, 0));
        blinds.add(new LevelBlinds(20, 40, 0));
        blinds.add(new LevelBlinds(25, 50, 0));
        blinds.add(new LevelBlinds(50, 100, 0));
        blinds.add(new LevelBlinds(75, 150, 0));
        blinds.add(new LevelBlinds(100, 200, 0));
        blinds.add(new LevelBlinds(150, 300, 0));
        blinds.add(new LevelBlinds(200, 400, 0));
        blinds.add(new LevelBlinds(300, 600, 0));
        blinds.add(new LevelBlinds(400, 800, 0));
        blinds.add(new LevelBlinds(500, 1000, 0));
        blinds.add(new LevelBlinds(600, 1200, 0));
        blinds.add(new LevelBlinds(800, 1600, 0));
        blinds.add(new LevelBlinds(1000, 2000, 0));

        final ArrayList<EditText> levelViews = new ArrayList<>();

        levelViews.add((EditText) findViewById(R.id.round_1_small));
        levelViews.add((EditText)findViewById(R.id.round_1_big));
        levelViews.add((EditText)findViewById(R.id.round_1_ante));

        levelViews.add((EditText)findViewById(R.id.round_2_small));
        levelViews.add((EditText)findViewById(R.id.round_2_big));
        levelViews.add((EditText)findViewById(R.id.round_2_ante));

        levelViews.add((EditText)findViewById(R.id.round_3_small));
        levelViews.add((EditText)findViewById(R.id.round_3_big));
        levelViews.add((EditText)findViewById(R.id.round_3_ante));

        levelViews.add((EditText)findViewById(R.id.round_4_small));
        levelViews.add((EditText)findViewById(R.id.round_4_big));
        levelViews.add((EditText)findViewById(R.id.round_4_ante));

        levelViews.add((EditText)findViewById(R.id.round_5_small));
        levelViews.add((EditText)findViewById(R.id.round_5_big));
        levelViews.add((EditText)findViewById(R.id.round_5_ante));

        levelViews.add((EditText)findViewById(R.id.round_6_small));
        levelViews.add((EditText)findViewById(R.id.round_6_big));
        levelViews.add((EditText)findViewById(R.id.round_6_ante));

        levelViews.add((EditText)findViewById(R.id.round_7_small));
        levelViews.add((EditText)findViewById(R.id.round_7_big));
        levelViews.add((EditText)findViewById(R.id.round_7_ante));

        levelViews.add((EditText)findViewById(R.id.round_8_small));
        levelViews.add((EditText)findViewById(R.id.round_8_big));
        levelViews.add((EditText)findViewById(R.id.round_8_ante));

        levelViews.add((EditText)findViewById(R.id.round_9_small));
        levelViews.add((EditText)findViewById(R.id.round_9_big));
        levelViews.add((EditText)findViewById(R.id.round_9_ante));

        levelViews.add((EditText)findViewById(R.id.round_10_small));
        levelViews.add((EditText)findViewById(R.id.round_10_big));
        levelViews.add((EditText)findViewById(R.id.round_10_ante));

        levelViews.add((EditText)findViewById(R.id.round_11_small));
        levelViews.add((EditText)findViewById(R.id.round_11_big));
        levelViews.add((EditText)findViewById(R.id.round_11_ante));

        levelViews.add((EditText)findViewById(R.id.round_12_small));
        levelViews.add((EditText)findViewById(R.id.round_12_big));
        levelViews.add((EditText)findViewById(R.id.round_12_ante));

        levelViews.add((EditText)findViewById(R.id.round_13_small));
        levelViews.add((EditText)findViewById(R.id.round_13_big));
        levelViews.add((EditText)findViewById(R.id.round_13_ante));

        levelViews.add((EditText)findViewById(R.id.round_14_small));
        levelViews.add((EditText)findViewById(R.id.round_14_big));
        levelViews.add((EditText)findViewById(R.id.round_14_ante));

        levelViews.add((EditText)findViewById(R.id.round_15_small));
        levelViews.add((EditText)findViewById(R.id.round_15_big));
        levelViews.add((EditText)findViewById(R.id.round_15_ante));

        for (int i=0; i<15; i++){

            levelViews.get(3*i).setText(String.valueOf(blinds.get(i).getSmallBlind()));
            levelViews.get(3*i+1).setText(String.valueOf(blinds.get(i).getBigBlind()));
            levelViews.get(3*i+2).setText(String.valueOf(blinds.get(i).getAnte()));


        }


//        final EditText text1 = findViewById(R.id.round_1_small);
//
//
//        text1.addTextChangedListener(new TextWatcher() {
//            @Override public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
//            @Override public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
//            @Override
//            public void afterTextChanged(Editable editable) {
//                String text = text1.getText().toString();
//            }
//        });
    }
}

