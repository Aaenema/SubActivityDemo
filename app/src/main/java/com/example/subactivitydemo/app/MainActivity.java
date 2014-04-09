package com.example.subactivitydemo.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


/*      Gli oggetti widget vogliono nel costruttore un oggetto che estenda la classe astratta android.content.Context.
        Si tratta di una struttura che permette l’accesso al sistema e che costituisce il contesto di esecuzione dell’applicazione.
        Non dovete preoccuparvi di come ottenere oggetti di questo tipo: android.app.Activity estende indirettamente Context, per cui dall’interno di un’attività,
        vi sarà sufficiente usare la parola chiave this.*/
        Button button  = new Button(this);
        button.setText("Lancia SubActivity");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startSubActivity();
            }
        });

        setContentView(button);
    }

    private void startSubActivity() {
        Intent intent = new Intent(this, SubActivity.class);
        startActivity(intent);
    }
}
