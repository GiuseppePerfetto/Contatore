package com.example.giuseppe.contatore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView vMessaggio;
    private Button vAumenta;
    private Button vDiminuisci;

    private int Contatore=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vMessaggio = findViewById(R.id.Textmessaggio);
        vAumenta= findViewById(R.id.button);
        vDiminuisci= findViewById (R.id.button2);

        vAumenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Contatore++;
                VisualizzaMessaggio();

            }
        });

        vDiminuisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Contatore--;
                VisualizzaMessaggio();

            }
        });
    }

    /**
     * funzione che mostra il conteggio.
     */
    private void VisualizzaMessaggio(){
        vMessaggio.setText(getString(R.string.valore) + "  " + Contatore );


    }
}
