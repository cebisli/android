package com.example.ikram.fragmentenfragmentebilgignderimi;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Frm1 extends Fragment {

    EditText editText;
    Button buton;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_frm1, container, false);

        tanimla();

        return view;
    }

    private void tanimla(){
        editText=(EditText)view.findViewById(R.id.editText);
        buton=(Button)view.findViewById(R.id.buton);
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action();
            }
        });
    }

    private void action(){
        ChangeFragment changeFragment=new ChangeFragment(getContext());
        changeFragment.veriGonder(new Frm2(),editText.getText().toString());
    }

}
