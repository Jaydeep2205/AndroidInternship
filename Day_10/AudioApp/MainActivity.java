package com.example.emailapp;

package com.example.audioapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonStart,buttonStop,buttonPause;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonStart=findViewById(R.id.buttonStart);
        buttonPause=findViewById(R.id.buttonPause);
        buttonStop=findViewById(R.id.buttonStop);

        mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.music);

        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);
        buttonPause.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.buttonStart:
                mediaPlayer.start();
                break;
            case R.id.buttonStop:
                mediaPlayer.stop();
                break;
            case R.id.buttonPause:
                mediaPlayer.pause();
                break;

        }
    }
}
