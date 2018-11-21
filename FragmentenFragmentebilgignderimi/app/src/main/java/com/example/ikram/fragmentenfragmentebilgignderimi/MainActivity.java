package com.example.ikram.fragmentenfragmentebilgignderimi;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button goster;
    Context context=this;
    FrameLayout frameLayout,frameLayout2;
    TextView gelenText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameLayout=(FrameLayout)findViewById(R.id.frameLayout);
        frameLayout2=(FrameLayout)findViewById(R.id.frameLayout2);

        gelenText=(TextView)findViewById(R.id.gelenVeri);

        goster=(Button)findViewById(R.id.goster);
        goster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frameLayout.setVisibility(View.VISIBLE);
                frameLayout2.setVisibility(View.VISIBLE);
                goster.setVisibility(View.GONE);
                gelenText.setVisibility(View.GONE);
                ChangeFragment changeFragment=new ChangeFragment(context);
                changeFragment.change(new Frm1());
                changeFragment.ikinciFragmentiGoster(new Frm2());
            }
        });


        if(getIntent().getExtras() != null){
            String gelenVeri=getIntent().getExtras().getString("giden").toString();
            gelenText.setText(gelenVeri);

            /*Bundle bundle=getIntent().getExtras();
            String veri=bundle.getString("giden");
            gelenText.setText(veri);*/
        }
    }
}
