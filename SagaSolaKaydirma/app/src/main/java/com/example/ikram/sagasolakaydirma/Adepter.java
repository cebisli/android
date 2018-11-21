package com.example.ikram.sagasolakaydirma;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class Adepter extends FragmentPagerAdapter {
    private Context MyContext;

    public Adepter(FragmentManager fm, Context myContext) {
        super(fm);
        MyContext = myContext;
    }

    @Override
    public Fragment getItem(int position) {
        //
        Fragment frag = new Fragment();
        switch(position){

            case 0:
                frag=Ekran1.newInstance(MyContext);
                break;
            case 1:
                frag=Ekran2.newInstance(MyContext);
                break;

            case 2:
                frag=Ekran3.newInstance(MyContext);
                break;
        }
        return frag;
    }

    @Override
    public int getCount() {

        return 3;  // gösterilecek fragment sayısı
    }
}
