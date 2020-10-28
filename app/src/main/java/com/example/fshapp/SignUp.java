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

public class SignUp extends AppCompatActivity {
    private EditText user, email, pass, conf_pass;
    private TextView textView4;
    private  TextView status;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Toolbar mtoolbar = findViewById(R.id.signup_toolbar);
        setSupportActionBar(mtoolbar);
        ActionBar myActionBar = getSupportActionBar();
        if ( myActionBar != null ) {

            myActionBar.setDisplayHomeAsUpEnabled(true);

        user = (EditText) findViewById(R.id.username);
        email = (EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.pass);
        conf_pass = (EditText) findViewById(R.id.confirm_pass);
        status = (TextView)findViewById(R.id.reg_status);
        }
    }
    public void signUpForm(View view){
        Intent signin = new Intent(SignUp.this, Signin.class);
        startActivity(signin);
    }

   public void createAccount(View v){
        String username = user.getText().toString();
        String usr_email = email.getText().toString();
        String password = pass.getText().toString();
        String cpassword = conf_pass.getText().toString();
        if(password.equals(cpassword))
            new SignUpDatabaseActivity(this,status).execute(username,usr_email,password);
        else{
            Toast.makeText(this, "Password Mismatch", Toast.LENGTH_LONG).show();
        }
      // Toast.makeText(this, "success", Toast.LENGTH_LONG).show();
   }

}
