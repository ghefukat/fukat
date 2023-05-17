Xml 1 file
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:orientation="vertical">

    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter UserName"
        android:id="@+id/et_user"
        android:textSize="30sp"
        android:autofillHints=""
        android:inputType="text">
    </EditText>

    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter Password"
        android:id="@+id/et_pass"
        android:textSize="30sp"
        android:autofillHints=""
        android:inputType="text">
    </EditText>

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="okay"
        android:id="@+id/bt_okay">
    </Button>

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="cancel"
        android:id="@+id/bt_cancel">
    </Button>


</LinearLayout>

Main activity file
package com.example.logindemo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText et_user=findViewById(R.id.et_user);
        EditText et_pass=findViewById(R.id.et_pass);
        Button bt_okay=findViewById(R.id.bt_okay);
        Button bt_cancel=findViewById(R.id.bt_cancel);

        bt_okay.setOnClickListener(view -> {
            String user=et_user.getText().toString();
            String pass=et_pass.getText().toString();
            if (user.equals("admin")&& pass.equals("admin")) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
            else {
                Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
            }
        });

        bt_cancel.setOnClickListener(view -> {
            et_user.getText().clear();
            et_pass.getText().clear();
        });

    }
}

second xml 
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        android:id="@+id/tvResult"
        android:layout_gravity="center"
        android:textSize="50sp">

    </TextView>


</LinearLayout>

Second activity java file
package com.example.logindemo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getIntent();
        TextView tvResult=findViewById(R.id.tvResult);
        //Toast.makeText(SecondActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
        tvResult.setText("Login Successful");
    }
}
