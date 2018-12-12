package com.example.ikram.webviewkullanimi;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* WebView webView=new WebView(context);
        WebSettings ws=webView.getSettings();
        ws.setBuiltInZoomControls(true); // yakınlaştırma işlemi
        ws.setJavaScriptEnabled(true); // javaScript kullanımı için izin isteme

        webView.loadUrl("https://www.nefisyemektarifleri.com/kategori/tarifler/sebze-yemekleri/ev-yemekleri/");
        setContentView(webView);*/

        // offline kullanımı
        // res/raw/dosya.html
        WebView webView = new WebView(context);
        WebSettings ws = webView.getSettings();
        ws.setBuiltInZoomControls(true); // yakınlaştırma işlemi
        ws.setJavaScriptEnabled(true); // javaScript kullanımı için izin isteme


        String mime = "text/html";
        String encoding = "utf-8";

        try {
            Resources res = this.getResources(); // kaynağı açtık
            InputStream stream = res.openRawResource(R.raw.dosya); // hangi dosya okunacaksa onu işaret ettik
            InputStreamReader isr = new InputStreamReader(stream); // dosya içindeki verileri okuma işlemi yaptırdık
            BufferedReader br = new BufferedReader(isr); // okunan verileri buffered içine attık
            String line = "";
            String data = "";

            while (true) { // sonsuz döngü
                line = br.readLine(); // verileri line attık
                if (line != null) { // eğer line null değil ise
                    data += line; // line'i data nın üzerine yazdık
                } else {
                    break;
                }
            }

            // son açılan hangisi ise ondan başlayarak kapatma işlemlerini gerçekleştirdik
            br.close();
            isr.close();
            stream.close();
            webView.loadData(data, mime, encoding);
            setContentView(webView);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
