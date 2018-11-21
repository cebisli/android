package com.example.ikram.fragmentenfragmentebilgignderimi;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

public class ChangeFragment {
    private Context context;

    public ChangeFragment(Context context) {
        this.context = context;
    }

    public void change(Fragment fragment){
        ((FragmentActivity) context).getSupportFragmentManager().beginTransaction()
                .replace(R.id.frameLayout,fragment,"fragmenet")
                .setTransitionStyle(FragmentTransaction.TRANSIT_ENTER_MASK)
                .commit();
    }


    public void change(Fragment fragment,String isim){

        Bundle bundle=new Bundle();
        bundle.putString("isim",isim);
        fragment.setArguments(bundle);
        ((FragmentActivity) context).getSupportFragmentManager().beginTransaction()
                .replace(R.id.frameLayout,fragment,"fragmenet")
                .setTransitionStyle(FragmentTransaction.TRANSIT_ENTER_MASK)
                .commit();
    }

    public void ikinciFragmentiGoster(Fragment fragment){

        ((FragmentActivity) context).getSupportFragmentManager().beginTransaction()
                .replace(R.id.frameLayout2,fragment,"fragmenet")
                .setTransitionStyle(FragmentTransaction.TRANSIT_ENTER_MASK)
                .commit();
    }

    public void veriGonder(Fragment fragment,String asd){

        Bundle bundle=new Bundle();
        bundle.putString("veri",asd);
        fragment.setArguments(bundle);

        ((FragmentActivity) context).getSupportFragmentManager().beginTransaction()
                .replace(R.id.frameLayout2,fragment,"fragmenet")
                .setTransitionStyle(FragmentTransaction.TRANSIT_ENTER_MASK)
                .commit();
    }

}
