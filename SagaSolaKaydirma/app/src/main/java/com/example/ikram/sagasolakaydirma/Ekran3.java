package com.example.ikram.sagasolakaydirma;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Ekran3 extends Fragment {

    public static Fragment newInstance(Context context) {
        Ekran3 frag = new Ekran3();

        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ekran3, container, false);
    }


}
