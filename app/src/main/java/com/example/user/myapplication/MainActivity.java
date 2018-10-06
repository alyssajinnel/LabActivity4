package com.example.user.myapplication;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1 = (Button) findViewById(R.id.button1);
        Button button0 = (Button) findViewById(R.id.button0);


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message = "BACK";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(getApplicationContext(), message, duration).show();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.main_layout_id);
                String message = "NEXT";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbar(view, message, duration);
            }
        });
    }
    public void showSnackbar(View view, String message, int duration)
    {
        Snackbar.make(view, message, duration).show();
    }
}
