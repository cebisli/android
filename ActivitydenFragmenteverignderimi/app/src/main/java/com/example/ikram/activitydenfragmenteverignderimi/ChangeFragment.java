package com.example.ikram.activitydenfragmenteverignderimi;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

public class ChangeFragment {

    private  Context context;

    public ChangeFragment(Context context) {
        this.context = context;
    }

    public  void Change(Fragment fragment){
        ((FragmentActivity) context).getSupportFragmentManager().beginTransaction()
                .replace(R.id.frameLayout, fragment, "fragment")
                .setTransitionStyle(FragmentTransaction.TRANSIT_ENTER_MASK)
                .commit();
    }
}
