package com.bikloo.allinonepractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    EditText edtEmail;
    EditText edtPassword;
    Button btnLogin;
    CheckBox cbRememberMe;
    Map<String,String> userList = new HashMap<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        cbRememberMe = (CheckBox) findViewById(R.id.cbRememberMe);
        edtEmail = (EditText) findViewById(R.id.txtEmail);
        edtPassword = (EditText) findViewById(R.id.txtPassword);

        userList.put("narangkishore98@gmail.com","1212");

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( userList.get(edtEmail.getText().toString().trim()) != null)
                {
                    if(userList.get(edtEmail.getText().toString().trim()).equals(edtPassword.getText().toString().trim()))
                    {
                        Bundle bundle = new Bundle();
                        bundle.putString("email",(edtEmail.getText().toString().trim()));
                        DashboardActivity.startActivity(MainActivity.this, bundle);
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "User Does Not Exist", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
