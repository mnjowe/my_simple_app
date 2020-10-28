package com.example.fshapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class AboutUs extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        Toolbar mtoolbar = findViewById(R.id.mytoolbar);
        setSupportActionBar(mtoolbar);
        ActionBar myActionBar = getSupportActionBar();
        if ( myActionBar != null ) {

            myActionBar.setDisplayHomeAsUpEnabled(true);

        }

    }

}

