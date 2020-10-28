package com.example.fshapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ForgotPass extends AppCompatActivity {
    private EditText usr_email;
    private EditText new_pass;
    private EditText cpassword;
    private TextView status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass);
        Toolbar mtoolbar = findViewById(R.id.forgotpass);
        setSupportActionBar(mtoolbar);
        ActionBar myActionBar = getSupportActionBar();
        if ( myActionBar != null ) {

            myActionBar.setDisplayHomeAsUpEnabled(true);

        }
       usr_email = (EditText)findViewById(R.id.usr_email);
       new_pass = (EditText)findViewById(R.id.new_pass);
       cpassword = (EditText) findViewById(R.id.cpassword);
       status = (TextView) findViewById(R.id.reset_status);
    }

    public void resetPass(View v){
        String email = usr_email.getText().toString();
        String pass = new_pass.getText().toString();
        String conf_pass = cpassword.getText().toString();
        if(pass.equals(conf_pass)) {
            //Toast.makeText(this, email, Toast.LENGTH_LONG).show();
            //Toast.makeText(this, pass, Toast.LENGTH_LONG).show();
            new ResetPassDatabaseConn(this,status).execute(email,pass);
        }
        else{
            Toast.makeText(this, "Password Mismatch", Toast.LENGTH_LONG).show();
        }
        // Toast.makeText(this, "success", Toast.LENGTH_LONG).show();
    }

}
