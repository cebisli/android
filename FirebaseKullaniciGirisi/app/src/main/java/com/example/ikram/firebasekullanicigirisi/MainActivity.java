package com.example.ikram.firebasekullanicigirisi;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    EditText txtGmail, txtPassword;
    Button btnGiris;
    FirebaseAuth auth;
    FirebaseUser user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtGmail = (EditText) findViewById(R.id.txtGmail);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        btnGiris = (Button) findViewById(R.id.btnGiris);

        auth=FirebaseAuth.getInstance();

        btnGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ad = txtGmail.getText().toString();
                String sifre = txtPassword.getText().toString();

                if (!ad.equals("") && !sifre.equals("")) {

                    loginUser(ad, sifre);

                }
            }
        });
    }

    private void loginUser(String kadi,String pass){
        auth.signInWithEmailAndPassword(kadi,pass).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
              if(task.isSuccessful()){
                  Intent intent=new Intent(MainActivity.this,UserActivity.class);
                  startActivity(intent);
                  finish();
              }
              else
              {
                  Toast.makeText(MainActivity.this, "Böyle Bir kullanıcı Yok"+task.getException(), Toast.LENGTH_LONG).show();
              }
            }
        });
    }
}
