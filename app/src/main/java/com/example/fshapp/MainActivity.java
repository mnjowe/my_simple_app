package com.example.fshapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.res.ResourcesCompat;


public class MainActivity extends Activity {
    private Button clickbutton;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickbutton = (Button) findViewById(R.id.my_button);
        clickbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "clicked", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, startActivity.class);
                startActivity(intent);
            }
        });
    }

}