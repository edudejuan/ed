package org.institutoserpis.cronometro;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {

    Button contar, pausa;
    Chronometer crono;
    long Time=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    crono = (Chronometer) findViewById(R.id.chronometer2);
            contar = (Button) findViewById(R.id.contar);
        pausa = (Button) findViewById(R.id.pausa;


                contar.setEnabled(true);
        pausa.setEnabled(false);

        contar.setOnClickListener(new View.OnClickListener()){

        @Override
                public void onClick(View v) {

            contar.setEnabled(false);
            pausa.setEnabled(true);
            crono.setBase(SystemClock.elapsedRealtime());
            crono.start();

        }

    });

    }
    pausa.setOnClickListener(new View.OnClickListener(){

    }
}
