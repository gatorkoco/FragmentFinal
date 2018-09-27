package com.example.rexita.finalfragment;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //sebuah statement pengecekan agar fragment hanya dibuat 1x saja
        if(savedInstanceState == null){
            bajuCelanaFragment bajuCelana;
            FragmentManager fm = getSupportFragmentManager();

            //membuat object baju
            bajuCelana = new bajuCelanaFragment();
            bajuCelana.setImageId(gambarBajuCelana.getKaos());
            bajuCelana.setIndexImg(0);
            //transaksi fragment baju
            fm.beginTransaction().add(R.id.kaos_container,bajuCelana).commit();

            //membuat object untuk celana
            bajuCelana = new bajuCelanaFragment();
            bajuCelana.setImageId(gambarBajuCelana.getCelana());
            bajuCelana.setIndexImg(0);
            //transaksi fragment celana
            fm.beginTransaction().add(R.id.celana_container,bajuCelana).commit();

        }
    }
}
