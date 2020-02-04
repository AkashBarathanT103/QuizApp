package com.barathanakash.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {
    Button submitButton;
    EditText responseText;
    TextView displayText;
    final MediaPlayer bgm =MediaPlayer.create(this, R.raw.music);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton=findViewById(R.id.clickButton);
        responseText=findViewById(R.id.responseEditText);
        displayText=findViewById(R.id.textBox);
        submitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.out.println("Hello Mom");
                Log.i("testButton", "Hi dad!");
                displayText.setText(displayText.getText().toString()+" "+responseText.getText().toString());
            }

        });

        responseText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus){
                if(!hasFocus) if (responseText.getText().toString().equals("TJ")) {
                    displayText.setText("TJ Rocks");
                    responseText.setText("");
                    responseText.setHint("That's a good name.");
                }
            }
        });


        Button playMusic = (Button) this.findViewById(R.id.soundButton);
        playMusic.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                bgm.start();
            }
        });
        }



    }

