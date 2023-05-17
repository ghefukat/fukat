Xml file
<?xml version="1.0" encoding="utf-8"?>
<TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TableRow
        android:id="@+id/row1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@+id/tv1"
            android:text="First Name :"
            android:textSize="25sp">
        </TextView>

        <EditText
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@+id/f_name"
            android:text=""
            android:textSize="25sp">

        </EditText>

    </TableRow>
    <TableRow
        android:id="@+id/row2"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@+id/tv2"
            android:text="Last name"
            android:textSize="25sp">
        </TextView>

        <EditText
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@+id/l_name"
            android:text=""
            android:textSize="25sp">

        </EditText>

    </TableRow>
    <TableRow
        android:id="@+id/row3"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@+id/tv3"
            android:text="Address :"
            android:textSize="25sp">
        </TextView>

        <EditText
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@+id/address"
            android:text="         "
            android:textSize="25sp">

        </EditText>

    </TableRow>
    <TableRow
        android:id="@+id/row4"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@+id/tv4"
            android:text="Phone Number :"
            android:textSize="25sp">
        </TextView>

        <EditText
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@+id/ph_no"
            android:text="         "
            android:textSize="25sp">

        </EditText>

    </TableRow>
    <TableRow
        android:id="@+id/row5"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@+id/tv5"
            android:text="Email :"
            android:textSize="25sp">
        </TextView>

        <EditText
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@+id/email"
            android:text="         "
            android:textSize="25sp">

        </EditText>

    </TableRow>
    <TableRow
        android:id="@+id/row6"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <RadioButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Male"
            android:id="@+id/male">

        </RadioButton>
    </TableRow>
    <TableRow
        android:id="@+id/row7"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <RadioButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Female"
            android:id="@+id/female">

        </RadioButton>
    </TableRow>

    <TableRow
        android:id="@+id/row8"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@+id/btn_submit"
            android:text="Submit"
            android:layout_marginRight="3sp">

        </Button>

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@+id/btn_clear"
            android:text="Clear">

        </Button>
    </TableRow>




</TableLayout>
Main activity file
package com.example.tablelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText f_name=findViewById(R.id.f_name);
        EditText l_name=findViewById(R.id.l_name);
        EditText address=findViewById(R.id.address);
        EditText ph_no=findViewById(R.id.ph_no);
        EditText email=findViewById(R.id.email);

        Button submit=findViewById(R.id.btn_submit);
        Button clear=findViewById(R.id.btn_clear);

        RadioButton male=findViewById(R.id.male);
        RadioButton female=findViewById(R.id.female);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=f_name.getText().toString();
                String name2=l_name.getText().toString();
                String name3=address.getText().toString();
                String name4=ph_no.getText().toString();
                String name5=email.getText().toString();
                String name6=male.getText().toString();
                String name7=female.getText().toString();
                showToast(name);
                showToast(name2);
                showToast(name3);
                showToast(name4);
                showToast(name5);
                showToast(name6);
                showToast(name7);
            }
            private void showToast(String text){
                Toast.makeText(MainActivity.this,text,Toast.LENGTH_SHORT).show();
            }
        });

        clear.setOnClickListener((View view) -> {
            f_name.getText().clear();
            l_name.getText().clear();
            address.getText().clear();
            ph_no.getText().clear();
            email.getText().clear();
        });

    }