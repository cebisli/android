package com.example.ikram.fragmentegitimi;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Fragment2 extends Fragment {

    View view;
    Button buton2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_fragment2, container, false);
        tanimla();
        action();
        return view;
    }

    void tanimla(){
        buton2=(Button)view.findViewById(R.id.buton2);
    }
    void action(){
        buton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // fagmentler arası geçiş kodu
                ChangeFragment changeFragment=new ChangeFragment(getContext());
                changeFragment.Change(new BirinciFragment());

                Toast.makeText(getContext(), "Fragment 2", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
