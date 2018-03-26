package com.example.giuseppe.contatore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TextView vMessaggio;
    private Button vAumenta;
    private Button vDiminuisci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vMessaggio = findViewById(R.id.Textmessaggio);
        vAumenta= findViewById(R.id.button);
        vDiminuisci= findViewById (R.id.button2);
    }
}
