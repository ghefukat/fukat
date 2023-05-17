Xml file:
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="30sp"
        android:text="Array 1: "
        android:id="@+id/tv1">
    </TextView>

    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="30sp"
        android:id="@+id/ed1"
        android:layout_toRightOf="@id/tv1"
        android:layout_marginLeft="20sp">
    </EditText>

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="30sp"
        android:text="Array 2: "
        android:layout_marginTop="30sp"
        android:layout_below="@id/tv1"
        android:id="@+id/tv2">
    </TextView>

    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="30sp"
        android:id="@+id/ed2"
        android:layout_toRightOf="@id/tv2"
        android:layout_below="@id/ed1"
        android:layout_marginLeft="20sp">
    </EditText>

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="30sp"
        android:text="Array 3: "
        android:layout_marginTop="30sp"
        android:layout_below="@id/tv2"
        android:id="@+id/tv3">
    </TextView>

    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="30sp"
        android:id="@+id/ed3"
        android:layout_toRightOf="@id/tv3"
        android:layout_below="@id/ed2"
        android:layout_marginLeft="20sp">
    </EditText>

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="30sp"
        android:layout_marginTop="30sp"
        android:layout_below="@id/ed3"
        android:text="Show"
        android:id="@+id/btn1">
    </Button>

</RelativeLayout>

Main activity file:
package com.example.slip19;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
        ed3=findViewById(R.id.ed3);
        btn1=findViewById(R.id.btn1);

        btn1.setOnClickListener(view -> {
            String val1=ed1.getText().toString();
            String val2=ed2.getText().toString();
            //String val3=ed3.getText().toString();
            String ans=val1+val2;
            ed3.setText(ans);
        });
    }
}
