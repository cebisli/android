package com.example.ikram.firebasekullanicigirisi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class UserActivity extends AppCompatActivity {

    FirebaseAuth auth;
    FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        auth=FirebaseAuth.getInstance();
        user=auth.getCurrentUser();
        if(user == null){
            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this, user.getUid(), Toast.LENGTH_SHORT).show();
        }
    }
}
