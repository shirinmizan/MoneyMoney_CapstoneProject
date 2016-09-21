package com.example.shirin.moneymoney_capstoneproject;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.shirin.moneymoney_capstoneproject.AccountActivity;
import com.example.shirin.moneymoney_capstoneproject.R;

public class LoginActivity extends AppCompatActivity {

    final Context context = this;
    EditText username ;
    EditText password ;
    Button login ;
    TextView linksignup ;
    CheckBox remember ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.input_username);
        password = (EditText) findViewById(R.id.input_password);
        login = (Button) findViewById(R.id.btn_login);
        linksignup = (TextView) findViewById(R.id.link_signup);
        remember = (CheckBox) findViewById(R.id.remember_me);
    }


    public void login(View v) {
        String uname = username.getText().toString();
        String pwd = password.getText().toString();

        if (uname.equals("")) {
            Toast toast = Toast.makeText(context, "enter a valid username and password", Toast.LENGTH_LONG);
            toast.show();
        } else {
            Intent intent = new Intent(context, AccountActivity.class);
            startActivity(intent);
        }
    }

}


