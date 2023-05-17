Xml 1 file
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">


    <EditText
        android:id="@+id/et_no"
        android:layout_width="286dp"
        android:layout_height="75dp"
        android:ems="10"
        android:hint="Enter a number"
        android:textSize="30sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.239" />

    <Button
        android:id="@+id/bt_cal"
        android:layout_width="258dp"
        android:layout_height="132dp"
        android:text="Calculate Factorial"
        android:textSize="30sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.496"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.442" />
</androidx.constraintlayout.widget.ConstraintLayout>

Mainactivity file
package com.example.factorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText et_no=findViewById(R.id.et_no);
        Button bt_cal=findViewById(R.id.bt_cal);
        bt_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle= new Bundle();
                int usr,fact=1,i;

                usr = Integer.parseInt(et_no.getText().toString());
                for (i = 1;i <= usr;i++)
                {
                    fact= fact*i;

                }
              /*  Intent intent=new Intent(MainActivity.this,SecondActivity.class);
               intent.putExtra("key",fact);

               startActivity(intent);

               */
                bundle.putInt("key",fact);
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }

}
 xml 2 file
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="text"
        android:layout_gravity="center"
        android:textAlignment="center"
        android:textSize="30dp"
        android:id="@+id/txt_result">

    </TextView>


</LinearLayout>

Second activity file
package com.example.factorial;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView txt_result1=findViewById(R.id.txt_result);


        Intent intent=getIntent();

        Bundle bundle=intent.getExtras();
        int val=bundle.getInt("key");
        String str=String.valueOf(val);

        txt_result1.setText(str);

    }

}
