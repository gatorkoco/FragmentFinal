package com.example.rexita.finalfragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;


public class bajuCelanaFragment extends Fragment {
    public List<Integer>imageId;
    private int indexImg;

    //membuat variabel Image list
    private static String TAG = "BajuCelanaFragment";
    public static final String IMAGE_ID_LIST = "image_id";
    public static final String LIST_INDEX ="list_index";

    public bajuCelanaFragment(){

    }

    //method overide on create view
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //perintah ini untuk merubah posisi menjadi lanscape atau sebaliknya
        if(savedInstanceState!=null){
            imageId = savedInstanceState.getIntegerArrayList(IMAGE_ID_LIST);
            indexImg = savedInstanceState.getInt(LIST_INDEX);
        }

        //membuat tampilan fragment
        View kaosView = inflater.inflate(R.layout.fragment_layout,container,false);

        //Peletakan gambar pada id imageView
        final ImageView imageViewVar = (ImageView) kaosView.findViewById(R.id.imageViewFragment);

        //Membuat object dari resource
        gambarBajuCelana varAssets = new gambarBajuCelana();

        //mengisi id:imageView dengan gambar dari resource
        imageViewVar.setImageResource(imageId.get(indexImg));
        //fungsi ini digunakan untuk mengalihkan gambar disaat di klik
        imageViewVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(indexImg<imageId.size()-1){
                    indexImg++;
                }
                else{
                    indexImg=0;
                }
                imageViewVar.setImageResource(imageId.get(indexImg));
            }
        });
        return kaosView;
    }

    //method untuk menyimpan variable array dan index (pada sesion pemr.web)
    @Override
    public void onSaveInstanceState(@NonNull Bundle currentState) {
        currentState.putIntegerArrayList(IMAGE_ID_LIST,(ArrayList<Integer>)imageId);
        currentState.putInt(LIST_INDEX,indexImg);
    }

    //perintah untuk mengeset variabel image yang berada pada list
    public void setImageId(List<Integer> imageId) {
        this.imageId = imageId;
    }

    public void setIndexImg(int indexImg) {
        this.indexImg = indexImg;
    }
}
