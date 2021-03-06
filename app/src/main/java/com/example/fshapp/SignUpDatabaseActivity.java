package com.example.fshapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.TextView;
public class SignUpDatabaseActivity extends AsyncTask<String,Void,String>{
    private TextView connStatus;
    private Context context;
    private int byGetOrPost = 0;
    //flag 0 means get and 1 means post.(By default it is get.)
    public SignUpDatabaseActivity(Context context, TextView status) {
        this.context = context;
        this.connStatus = status;
        //byGetOrPost = flag;
    }
    protected void onPreExecute(){
    }
    @Override
    protected String doInBackground(String... arg0) {
        try{
            String username = (String)arg0[0];
            String email = (String)arg0[1];
            String password = (String)arg0[2];
            String link="http://192.168.1.159/fshtrans/registration.php";
            String data = URLEncoder.encode("username", "UTF-8")
                    + "=" + URLEncoder.encode(username, "UTF-8");
            data += "&" + URLEncoder.encode("email", "UTF-8")
                    + "=" + URLEncoder.encode(email, "UTF-8");
            data += "&" + URLEncoder.encode("password", "UTF-8")
                    + "=" + URLEncoder.encode(password, "UTF-8");
            URL url = new URL(link);
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter
                    (conn.getOutputStream());
            wr.write( data );
            wr.flush();
            BufferedReader reader = new BufferedReader
                    (new InputStreamReader(conn.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line = null;
// Read Server Response
            while((line = reader.readLine()) != null)
            {
                sb.append(line);
                break;
            }
            return sb.toString();
        }catch(Exception e){
            return new String("Exception: " + e.getMessage());
        }
    }
    @Override
    protected void onPostExecute(String result){
        //this.statusField.setText("Login Successful");
        this.connStatus.setText(result);
    }
}