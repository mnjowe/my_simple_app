package com.example.fshapp;

import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class HelpActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        Toolbar mtoolbar = findViewById(R.id.help_toolbar);
        setSupportActionBar(mtoolbar);
        ActionBar myActionBar = getSupportActionBar();
        if ( myActionBar != null ) {

            myActionBar.setDisplayHomeAsUpEnabled(true);

        }

    }

}

