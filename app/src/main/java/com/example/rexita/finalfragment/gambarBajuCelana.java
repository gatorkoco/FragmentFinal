package com.example.rexita.finalfragment;

import java.util.ArrayList;
import java.util.List;

public class gambarBajuCelana {

    //pengambilan gambar pada drawable
    private static List<Integer>kaos = new ArrayList<Integer>(){
        {
            add(R.drawable.kaos1);
            add(R.drawable.kaos2);
            add(R.drawable.kaos3);
            add(R.drawable.kaos4);
            add(R.drawable.kaos5);
        }
    };

    private static List<Integer>celana = new ArrayList<Integer>(){
        {
            add(R.drawable.celana1);
            add(R.drawable.celana2);
            add(R.drawable.celana3);
            add(R.drawable.celana4);
            add(R.drawable.celana5);

        }};

    //perintah untuk memanggil tiap" list (baju & celana)
    public static List<Integer> getKaos() {
        return kaos;
    }

    public static List<Integer> getCelana() {
        return celana;
    }
}
