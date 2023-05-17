Xml file
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.example.radiobutton.MainActivity" >

    <TextView
        android:id="@+id/tvRg"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentTop="true"
        android:layout_centerHorizontal="true"
        android:gravity="center"
        android:text="Radio Buttons and CheckBoxes"
        android:textAppearance="?android:attr/textAppearanceMedium" />
    <RadioGroup
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@+id/tvRg"
        android:layout_centerHorizontal="true"
        android:orientation="vertical"
        android:layout_marginTop="10dp"
        android:id="@+id/radioGroup" >

        <RadioButton
            android:id="@+id/rb1"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:checked="false"
            android:text="FYBBA CA" />

        <RadioButton
            android:id="@+id/rb2"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="SY BBA CA"
            android:checked="false" />

        <RadioButton
            android:id="@+id/rb3"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="TY BBA CA"
            android:checked="true" />


        <CheckBox

            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text=" C++ "
            android:id="@+id/cb1"
            android:layout_below="@+id/rb3"
            android:layout_centerHorizontal="true"
            android:checked="false" />

        <CheckBox
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="DS using C"
            android:id="@+id/cb2"
            android:layout_below="@+id/cb1"
            android:layout_centerHorizontal="true"
            android:checked="false" />

        <CheckBox
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="PHP"
            android:id="@+id/cb3"
            android:layout_below="@+id/cb2"
            android:layout_centerHorizontal="true"
            android:checked="false" />

        <CheckBox
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="JAVA"
            android:id="@+id/cb4"
            android:layout_below="@+id/cb3"
            android:layout_centerHorizontal="true"
            android:checked="false" />

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="SUBMIT"
            android:id="@+id/btnSubmit"
            android:layout_below="@+id/cb4"
            android:layout_centerHorizontal="true"
            android:layout_marginTop="10dp"/>
    </RadioGroup>

</RelativeLayout>

Main activity file
package com.example.radiobutton;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton selectedRadioButton;
    Button buttonSubmit;
    CheckBox cb1, cb2, cb3, cb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonSubmit = (Button) findViewById(R.id.btnSubmit);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb2 = (CheckBox) findViewById(R.id.cb2);
        cb3 = (CheckBox) findViewById(R.id.cb3);
        cb4 = (CheckBox) findViewById(R.id.cb4);

        /*
            Submit Button
        */
        buttonSubmit.setOnClickListener(v -> {
            //Get the selected RadioButton
            selectedRadioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
            // get RadioButton text
            String yourVote = selectedRadioButton.getText().toString();

            String checkBoxChoices = "";

            if (cb1.isChecked()) {
                checkBoxChoices += cb1.getText().toString() + "\t: " +
                        "YES\n";
            } else {
                checkBoxChoices += cb1.getText().toString() + "\t: NO\n";
            }

            if (cb2.isChecked()) {
                checkBoxChoices += cb2.getText().toString() + "\t: YES\n";
            } else {
                checkBoxChoices += cb2.getText().toString() + "\t: NO\n";
            }

            if (cb3.isChecked()) {
                checkBoxChoices += cb3.getText().toString() + "\t: YES\n";
            } else {
                checkBoxChoices += cb3.getText().toString() + "\t: NO\n";
            }

            if (cb4.isChecked()) {
                checkBoxChoices += cb4.getText().toString() + "\t: YES\n";
            } else {
                checkBoxChoices += cb4.getText().toString() + "\t: NO\n";
            }

            // display it as Toast to the user

            Toast.makeText(MainActivity.this, "Selected Radio Button is:" + yourVote+ "\n CheckBox Choices: \n "+checkBoxChoices,Toast.LENGTH_LONG).show();


    });
    }
}