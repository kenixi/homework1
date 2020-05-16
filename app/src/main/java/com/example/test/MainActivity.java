package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn1 = findViewById(R.id.btn1);
        final TextView text1 = findViewById(R.id.text1);
        final ImageView image1 = findViewById(R.id.image1);
        final ProgressBar progress1 = findViewById(R.id.progress1);
        SeekBar seek1 = findViewById(R.id.seek1);
        final int[] img = {R.drawable.ok, R.drawable.no};
        final boolean[] btn1state = {true};

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(btn1state[0]){
                    text1.setText("ok!");
                    image1.setImageResource(img[0]);
                    btn1.setText("stop");
                    btn1state[0] = false;
                    Log.d("MainActivity","start");
                }
                else{
                    text1.setText("no!");
                    image1.setImageResource(img[1]);
                    btn1.setText("start");
                    btn1state[0] = true;
                    Log.d("MainActivity","stop");
                }
            }
        });

        seek1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progress1.setProgress(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
