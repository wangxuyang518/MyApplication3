package com.example.wxy.myapplication;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void initImageView(List<String> paths){
        List<ImageView>images=Arrays.asList(imageView1,imageView2,imageView3);
        for (int i=0;i<paths.size();i++){
              images.get(i).setImageBitmap(BitmapFactory.decodeFile(paths.get(i)));
       }
    }

}
