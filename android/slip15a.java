main.xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:orientation="vertical">
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        android:gravity="center"
        android:background="@drawable/isha">


    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        android:textSize="40dp" >

    </TextView>
    </LinearLayout>
</LinearLayout>

Colors.xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <color name="purple_200">#FFBB86FC</color>
    <color name="purple_500">#FF6200EE</color>
    <color name="purple_700">#FF3700B3</color>
    <color name="teal_200">#FF03DAC5</color>
    <color name="teal_700">#FF018786</color>
    <color name="black">#FF000000</color>
    <color name="white">#FFFFFFFF</color>
</resources>

Isha.xml
<?xml version="1.0" encoding="utf-8"?>
    <layer-list xmlns:android="http://schemas.android.com/apk/res/android">
        <item>
            <shape android:shape="rectangle">
                <solid android:color="@color/white"> </solid>
                <corners android:radius="8dp"> </corners>
            </shape>
        </item>
        <item android:left="8dp">
            <shape android:shape="rectangle">
                <solid android:color="@color/white"> </solid>
                <corners android:radius="8dp"> </corners>
            </shape>
        </item>
        <item android:left="8dp" android:top="8dp">
            <shape android:shape="rectangle">
                <solid android:color="@color/white"> </solid>
                <corners android:radius="8dp"> </corners>
            </shape>
        </item>
        <item android:left="8dp" android:top="8dp" android:right="8dp">
            <shape android:shape="rectangle">
                <solid android:color="@color/white"> </solid>
                <corners android:radius="8dp"> </corners>
            </shape>
        </item>
        <item android:left="8dp" android:top="8dp" android:right="8dp" android:bottom="8dp">
            <shape android:shape="rectangle">
                <solid android:color="@color/purple_500"> </solid>
                <corners android:radius="8dp"> </corners>
            </shape>
        </item>

    </layer-list>
.java file:
package com.example.slip15_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}