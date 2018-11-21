package com.example.ikram.sagasolakaydirma;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ViewPager MyViewPager;
    private Adepter MyAdapter;
    Context context=this;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewCagir();
        AktifTab();

    }

    private void ViewCagir(){

        MyViewPager = (ViewPager) findViewById(R.id.viewPager);// ViewPager in tanımlama işlemi
        // adepter nesnesi alıp set etme işlemleri
        MyAdapter = (Adepter) new Adepter(getSupportFragmentManager(),this);
        MyViewPager.setAdapter(MyAdapter);
        MyViewPager.setCurrentItem(2);  // başta hangi fragmen tin gösterilmesi gerektiğini söyler

    }
    private void AktifTab(){

        MyViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener(){

            @Override
            public void onPageScrollStateChanged(int position) {}
            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {}
            @Override
            public void onPageSelected(int position) {
                // TODO Auto-generated method stub
                switch(position){

                    case 0:
                        findViewById(R.id.baslik1).setVisibility(View.VISIBLE);
                        findViewById(R.id.baslik2).setVisibility(View.INVISIBLE);
                        findViewById(R.id.baslik3).setVisibility(View.INVISIBLE);
                        break;

                    case 1:
                        findViewById(R.id.baslik1).setVisibility(View.INVISIBLE);
                        findViewById(R.id.baslik2).setVisibility(View.VISIBLE);
                        findViewById(R.id.baslik3).setVisibility(View.INVISIBLE);
                        break;

                    case 2:
                        findViewById(R.id.baslik1).setVisibility(View.INVISIBLE);
                        findViewById(R.id.baslik2).setVisibility(View.INVISIBLE);
                        findViewById(R.id.baslik3).setVisibility(View.VISIBLE);
                        break;
                }
            }

        });

    }
}
