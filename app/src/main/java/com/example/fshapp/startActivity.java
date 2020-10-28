package com.example.fshapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toast;

public class startActivity extends AppCompatActivity{
    private BottomNavigationView mBtmView;
    private int mMenuId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       /* mBtmView = (BottomNavigationView) findViewById(R.id.bottom_view);
        mBtmView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Toast.makeText(startActivity.this, "Bottom Item Selected", Toast.LENGTH_LONG).show();
                //Intent intent = new Intent(startActivity.this, MainActivity.class);
                //startActivity(intent);
                return true;
            }
            }); */
        mBtmView = (BottomNavigationView) findViewById(R.id.bottom_view);
        mBtmView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.our_location:
                        Intent intent = new Intent(startActivity.this, MapsActivity.class);
                        startActivity(intent);
                        //Toast.makeText(startActivity.this, "Location", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.call_us:
                        Intent phone_call = new Intent(Intent.ACTION_DIAL);
                        phone_call.setData(Uri.parse("tel:0993305832"));
                        startActivity(phone_call);
                        //Toast.makeText(startActivity.this, "Call", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.email_us:
                        Intent i = new Intent(Intent.ACTION_SENDTO);
                        i.setData(Uri.parse("mailto:"));
                        i.putExtra(Intent.EXTRA_EMAIL  , new String[] { "fshtrans20@gmail.com" });
                        //i.putExtra(Intent.EXTRA_SUBJECT, "My subject");

                        startActivity(Intent.createChooser(i, "Email via..."));
                       // Toast.makeText(startActivity.this, "Email", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.whatsapp_us:
                        String number = "+265993305832";
                        String url = "https://api.whatsapp.com/send?phone="+ number;
                        Intent call = new Intent(Intent.ACTION_VIEW);
                        call.setData(Uri.parse(url));
                        startActivity(call);
                        //Toast.makeText(startActivity.this, "Whatsapp", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent settings = new Intent(startActivity.this, SettingsActivity.class);
            startActivity(settings);
        }
        else if (id == R.id.search) {

            //Toast.makeText(this, "Search", Toast.LENGTH_LONG).show();
        }
        else if (id == R.id.action_about) {
            Intent about = new Intent(startActivity.this, AboutUs.class);
            startActivity(about);
           // Toast.makeText(this, "About Us", Toast.LENGTH_LONG).show();
        }
        else if (id == R.id.action_help) {
           // Toast.makeText(this, "Help", Toast.LENGTH_LONG).show();
            Intent help = new Intent(startActivity.this, HelpActivity.class);
            startActivity(help);
        }
        else if (id == R.id.user) {
            Intent signin = new Intent(startActivity.this, Signin.class);
            startActivity(signin);
            //Toast.makeText(this, "Help", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
    public void detailsPage(View view){
        Intent details = new Intent(startActivity.this, ScrollingActivity.class);
        startActivity(details);
    }
    public void bookService(View view){
        Intent details = new Intent(startActivity.this, BookServiceActivity.class);
        startActivity(details);
    }
}

