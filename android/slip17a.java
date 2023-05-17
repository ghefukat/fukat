activity_main.xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <ImageSwitcher
        android:id="@+id/imgsw"
        android:layout_width="match_parent"
        android:layout_height="600dp"
        android:layout_margin="20dp">

    </ImageSwitcher>

    <Button
        android:id="@+id/prev"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="prev"
        android:layout_below="@id/imgsw"
        >

    </Button>

    <Button
        android:id="@+id/next"
        android:layout_below="@id/imgsw"
        android:layout_alignParentRight="true"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="next">

    </Button>
</RelativeLayout>

MainActivity.java


package com.example.imageswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {



   Integer[] images={R.drawable.scene,R.drawable.scene2,R.drawable.scene4,R.drawable.scene5,R.drawable.scene6};
   int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button next=findViewById(R.id.next);
        Button prev=findViewById(R.id.prev);
        ImageSwitcher imgsw=findViewById(R.id.imgsw);

        imgsw.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView=new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return imageView;
            }
        });
        Animation out= AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);
        Animation in= AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        imgsw.setOutAnimation(out);
        imgsw.setInAnimation(in);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i<images.length){
                    i++;
                    imgsw.setImageResource(images[i]);
                }


            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View view) {
            if(i>0){
                i--;
                imgsw.setImageResource(images[i]);
            }


        }
        });

    }
}
