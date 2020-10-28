package com.example.fshapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Signin extends AppCompatActivity {
    private  EditText user;
    private  EditText pass;
    private TextView textView3;
    private TextView role;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_signin);
           Toolbar mtoolbar = findViewById(R.id.signin_toolbar);
            setSupportActionBar(mtoolbar);
            ActionBar myActionBar = getSupportActionBar();
            if ( myActionBar != null ) {

                myActionBar.setDisplayHomeAsUpEnabled(true);

            }
            user = (EditText) findViewById(R.id.username);
            pass = (EditText) findViewById(R.id.password);
            role = (TextView)findViewById(R.id.text2);
        }
    public void signUpForm(View view){
        Intent signin = new Intent(Signin.this, SignUp.class);
        startActivity(signin);
    }
    public void ForgotPassword(View view){
        Intent signin = new Intent(Signin.this, ForgotPass.class);
        startActivity(signin);
    }
    public void loginPost(View view){
        String username = user.getText().toString();
        String password = pass.getText().toString();
        //method.setText("Post Method");
        new SigninActivity(this,role).execute(username,password);
    }
}
