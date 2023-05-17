Xml file
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">
    <ScrollView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">

        <LinearLayout
            android:layout_width="wrap_content"
"
            android:layout_height="wrap_content"
            android:orientation="vertical">
            <EditText
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="hello"
                android:textSize="30dp">
            </EditText>

            <Button
                android:layout_width="wrap_content"
                android:layout_height="wrap_content">
            </Button>
            <EditText
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="hello"
                android:textSize="30dp">
            </EditText>

            <Button
                android:layout_width="wrap_content"
                android:layout_height="wrap_content">
            </Button>
            <EditText
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="hello"
                android:textSize="30dp">
            </EditText>

            <Button
                android:layout_width="wrap_content"
                android:layout_height="wrap_content">
            </Button>
            <EditText
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="hello"
                android:textSize="30dp">
            </EditText>

            <Button
                android:layout_width="wrap_content"
                android:layout_height="wrap_content">
            </Button>
            <EditText
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="hello"
                android:textSize="30dp">
            </EditText>

            <Button
                android:layout_width="wrap_content"
                android:layout_height="wrap_content">
            </Button>
            <EditText
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="hello"
                android:textSize="30dp">
            </EditText>

            <Button
                android:layout_width="wrap_content"
                android:layout_height="wrap_content">
            </Button>
            <EditText
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="hello"
                android:textSize="30dp">
            </EditText>

            <Button
                android:layout_width="wrap_content"
                android:layout_height="wrap_content">
            </Button>
            <EditText
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="hello"
                android:textSize="30dp">
            </EditText>

            <Button
                android:layout_width="wrap_content"
                android:layout_height="wrap_content">
            </Button>
            <EditText
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="hello"
                android:textSize="30dp">
            </EditText>

            <Button
                android:layout_width="wrap_content"
                android:layout_height="wrap_content">
            </Button>

        </LinearLayout>
    </ScrollView>
</LinearLayout>


Main activity
package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}