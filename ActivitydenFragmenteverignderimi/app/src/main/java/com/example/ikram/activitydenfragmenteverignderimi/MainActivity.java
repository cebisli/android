package com.example.ikram.activitydenfragmenteverignderimi;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button buton;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        buton = (Button) findViewById(R.id.buton);


        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new Fragment1();
                Bundle bundle = new Bundle();
                bundle.putString("isim", editText.getText().toString());
                fragment.setArguments(bundle);

                ChangeFragment changeFragment = new ChangeFragment(context);
                changeFragment.Change(fragment);

                editText.setText("");
            }
        });


    }
}
