package com.example.ikram.fragmentenfragmentebilgignderimi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Frm2 extends Fragment {

    View view;
    TextView text;
    Button ActivityButon;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_frm2, container, false);

        if (getArguments() != null) {


            final String veri = getArguments().getString("veri").toString();
            text=(TextView)view.findViewById(R.id.text);
            text.setText(veri);

            ActivityButon=(Button)view.findViewById(R.id.ActivityButon);
            ActivityButon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(getActivity().getApplicationContext(),MainActivity.class);
                    intent.putExtra("giden",veri);
                    getActivity().startActivity(intent);
                }
            });

        }

        return view;
    }


}
