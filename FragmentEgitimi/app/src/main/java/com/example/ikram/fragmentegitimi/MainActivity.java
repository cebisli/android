package com.example.ikram.fragmentegitimi;

import android.content.Context;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Context context=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ChangeFragment changeFragment=new ChangeFragment(context);

        if(savedInstanceState == null){
            changeFragment.Change(new BirinciFragment());
        }
    }
}
