package com.example.ikram.fragmentegitimi;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class BirinciFragment extends Fragment {
    View view;
    Button buton1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_birinci, container, false);
        tanimla();
        action();
        return view;
    }

    void tanimla(){
        buton1=(Button)view.findViewById(R.id.buton1);
    }
    void action(){
        buton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 ChangeFragment changeFragment=new ChangeFragment(getContext());
                 changeFragment.Change(new Fragment2());

                Toast.makeText(getContext(), "Birinci Fragment", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
