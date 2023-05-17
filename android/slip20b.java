xml file 
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.example.stringoperation_radiobutton.MainActivity"
    android:orientation="horizontal">

    <TextView
        android:id="@+id/tvRg"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Enter String:"
        android:textAppearance="?android:attr/textAppearanceMedium"
        android:textSize="40dp" />

    <EditText
        android:id="@+id/tvRg1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentEnd="true"
        android:layout_toRightOf="@id/tvRg"
        android:text=""
        android:textSize="40dp">

    </EditText>
    <RadioGroup
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@+id/tvRg"
        android:layout_centerHorizontal="true"
        android:orientation="vertical"
        android:layout_marginTop="20dp"
        android:id="@+id/radioGroup" >

        <RadioButton
            android:id="@+id/rb1"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:checked="false"
            android:text="Uppercase" />

        <RadioButton
            android:id="@+id/rb2"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Lowercase"
            android:checked="false" />

        <RadioButton
            android:id="@+id/rb3"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Right 5 character"
            android:checked="false" />
        <RadioButton
            android:id="@+id/rb4"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Left 5 character"
            android:checked="false" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:layout_below="@id/rb4"
        android:text="Click"
        android:textSize="20dp"
        android:id="@+id/btn_submit"
        android:textAlignment="center">

    </Button>

        <TextView
            android:id="@+id/tvRg2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Output"
            android:textAppearance="?android:attr/textAppearanceMedium"
            android:textSize="40dp">

        </TextView>

        <TextView
            android:id="@+id/tvRg3"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentEnd="true"
            android:layout_toRightOf="@id/tvRg2"
            android:text=""
            android:textSize="40dp">

        </TextView>
    </RadioGroup>
</RelativeLayout>


mainactivity file
package com.example.stringoperation_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.biometrics.BiometricManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    // These are the global variables
    RadioGroup radioGroup;
    RadioButton rb1, rb2, rb3, rb4;
    RadioButton selectedRadioButton;
    Button buttonSubmit;
    TextView tvRg3, tvRg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // layout instances
        buttonSubmit = (Button) findViewById(R.id.btn_submit);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        rb4 = (RadioButton) findViewById(R.id.rb4);
        tvRg3 = findViewById(R.id.tvRg3);
        tvRg1 = findViewById(R.id.tvRg1);
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
                String radioButtonChoices = "";

                //String Rg3,Rg1;

                if (rb1.isChecked()) {

                   radioButtonChoices += tvRg1.getText().toString();
                   tvRg3.setText(radioButtonChoices.toUpperCase(Locale.ROOT));

                }
                else {
                }

                if (rb2.isChecked()) {
                    radioButtonChoices += tvRg1.getText().toString();
                    tvRg3.setText(radioButtonChoices.toLowerCase(Locale.ROOT));
                } else {

                }

                if (rb3.isChecked()) {
                    radioButtonChoices += tvRg1.getText().toString();
                    tvRg3.setText(radioButtonChoices.substring(tvRg1.length()-5, tvRg1.length()));
                } else {

                }
                if (rb4.isChecked()) {
                    radioButtonChoices += tvRg1.getText().toString();
                    tvRg3.setText(radioButtonChoices.substring(0,5));
                } else {

                }
            }
        });
    }
} 
