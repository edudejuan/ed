package org.institutoserpis.camaraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {

    Button contar,pausa;
    Chronometer;
    long Time=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        crono = (Chronometer) findViewById(R.id.Cronometro)
    contar = (Button) findViewById(R.id.Contar)

    }

}
