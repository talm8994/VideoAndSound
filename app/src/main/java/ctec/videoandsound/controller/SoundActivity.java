package ctec.videoandsound.controller;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.*;


public class SoundActivity extends AppCompatActivity
{
    private Button startButton;
    private Button stopButton;
    private Button pauseButton;
    private Button videoBoutton;
    private seekBar soundSeekBar;
    private thread soundThread;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound);

        startButton = (Button) findViewById(R.id.startButton);
        pauseButton = (Button) findViewById(R.id.pauseButton);
        stopButton = (Button) findViewById(R.id.stopButton);
        soundSeekBar = (SeekBar) findViewById(R.id.seekBar);
        videoBoutton = (Button) findViewById(R.id.videoButton);
        soundPlayer = MideaPlayer.create(this.getBaseContext(), R.raw.lovelikeyou);

        setupListeners();

        soundThread = new Thread(this);
        soundThread.start();

    }
    private void setupListeners()
    {
        startButton.setOnClickListener(new View.OnClickListener();
        {
            @Override
            public void onClick(View v)
            {
                soundPlayer.start();
            }
        });

        pauseButton.setOnClickListener();


    }
}
