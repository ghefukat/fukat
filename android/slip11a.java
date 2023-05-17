Xml file:
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.example.slip11_1.MainActivity" >


    <RadioGroup
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_centerHorizontal="true"
        android:orientation="vertical"
        android:layout_marginTop="10dp"
        android:id="@+id/radioGroup" >

        <RadioButton
            android:id="@+id/rb1"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:checked="true"
            android:text="MALE" />

        <RadioButton
            android:id="@+id/rb2"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="FEMALE"
            android:checked="false" />

        <RadioButton
            android:id="@+id/rb3"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="YES"
            android:checked="false" />

        <RadioButton
            android:id="@+id/rb4"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="NO"
            android:checked="false" />




        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="SUBMIT"
            android:id="@+id/btnSubmit"
            android:layout_below="@+id/rb5"
            android:layout_centerHorizontal="true"
            android:layout_marginTop="10dp"/>
    </RadioGroup>

</RelativeLayout>

Main activity.java
package com.example.slip11_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // These are the global variables
    RadioGroup radioGroup;
    RadioButton rb1,rb2,rb3,rb4,selectedRadioButton;
    Button buttonSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // layout instances
        buttonSubmit = (Button) findViewById(R.id.btnSubmit);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        rb4 = (RadioButton) findViewById(R.id.rb4);

        /*
            Submit Button
        */
        buttonSubmit.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {
                //Get the selected RadioButton
                selectedRadioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
                // get RadioButton text
                String yourVote = selectedRadioButton.getText().toString();

                if (rb1.isChecked()) {
                    yourVote += rb1.getText().toString() + "\t TRUE\n";
                } else {
                    yourVote += rb1.getText().toString() + "\t FALSE\n";
                }

                if (rb2.isChecked()) {
                    yourVote += rb2.getText().toString() + "\t TRUE\n";
                } else {
                    yourVote += rb2.getText().toString() + "\t FALSE\n";
                }

                if (rb3.isChecked()) {
                    yourVote += rb3.getText().toString() + "\t TRUE\n";
                } else {
                    yourVote += rb3.getText().toString() + "\t FALSE\n";
                }

                if (rb4.isChecked()) {
                    yourVote += rb4.getText().toString() + "\t TRUE\n";
                } else {
                    yourVote += rb4.getText().toString() + "\t FALSE\n";
                }

                // display it as Toast to the user

                Toast.makeText(MainActivity.this, "Selected Radio Button is:" + yourVote+ "\n", Toast.LENGTH_LONG).show();

            }
        });
    }
}