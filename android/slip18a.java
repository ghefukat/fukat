Xml file
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:orientation="vertical">

    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/ed1"
        android:layout_marginLeft="20sp"
        android:layout_marginRight="20sp"
        android:layout_marginTop="20sp"
        android:hint="Enter num 1"
        android:textSize="30sp">

    </EditText>

    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/ed2"
        android:layout_marginLeft="20sp"
        android:layout_marginRight="20sp"
        android:layout_marginTop="20sp"
        android:hint="Enter num 2"
        android:textSize="30sp">

    </EditText>

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginLeft="30sp"
        android:layout_marginRight="30sp"
        android:layout_marginTop="20sp"
        android:id="@+id/btn_val"
        android:text="DISPLAY"
        android:textSize="30sp">

    </Button>

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginLeft="30sp"
        android:layout_marginRight="30sp"
        android:layout_marginTop="20sp"
        android:textSize="30sp"
        android:id="@+id/tv">

    </TextView>

</LinearLayout>

Main activity file
package com.example.slip18;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    Button btn_val;
    TextView tv;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
        btn_val=findViewById(R.id.btn_val);
        tv=findViewById(R.id.tv);

        btn_val.setOnClickListener(view -> {
            int a=Integer.parseInt(ed1.getText().toString());
            int b=Integer.parseInt(ed2.getText().toString());

            if ((a > 10) || (b > 10))
            {
                ed1.getText().clear();
                ed2.getText().clear();
                tv.setText("Rejected as numbers should be less than 10");
            }
            else{
                tv.setText("Num 1 :\t" + a + "\nNum 2 :\t" + b);
            }
        });
    }
}
