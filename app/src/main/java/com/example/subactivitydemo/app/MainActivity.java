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
