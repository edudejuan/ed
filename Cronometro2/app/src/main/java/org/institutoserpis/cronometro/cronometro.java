package org.institutoserpis.cronometro;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class cronometro extends AppCompatActivity {


    Button startB, stopB;
    Chronometer cronometro;
    long time = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cronometro);

        cronometro = (Chronometer) findViewById(R.id.cronometro);
        startB = (Button) findViewById(R.id.startB);
        stopB = (Button) findViewById(R.id.stopB);

        startB.setEnabled(true);
        stopB.setEnabled(false);

        startB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startB.setEnabled(false);
                stopB.setEnabled(true);
                cronometro.setBase(SystemClock.elapsedRealtime());
                cronometro.start();
            }
        });

        stopB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startB.setEnabled(true);
                stopB.setEnabled(false);
                cronometro.stop();
            }
        });

    }
}
