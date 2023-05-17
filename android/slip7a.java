Xml 1 file
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">


    <EditText
        android:id="@+id/ed1"
        android:layout_width="305dp"
        android:layout_height="78dp"
        android:ems="10"
        android:inputType="textPersonName"
        android:hint="Enter Number 1"
        android:textSize="35sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.214" />

    <EditText
        android:id="@+id/ed2"
        android:layout_width="303dp"
        android:layout_height="76dp"
        android:ems="10"
        android:inputType="textPersonName"
        android:hint="Enter Number 2"
        android:textSize="35sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.374" />

    <Button
        android:id="@+id/btn1"
        android:layout_width="175dp"
        android:layout_height="66dp"
        android:text="RESULT"
        android:textSize="30sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.542"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.595" />


</androidx.constraintlayout.widget.ConstraintLayout>

Main activity file:
package com.example.power_average;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
        btn1=findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(ed1.getText().toString());
                int num2=Integer.parseInt(ed2.getText().toString());

                int avg=(num1 + num2)/2;

                int ans=1;

                for(int i=1;i<=num2;i++)
                    ans = ans * num1;

                Intent intent= new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("key",avg);
                intent.putExtra("lock",ans);
                startActivity(intent);
            }
        });

    }
}

second xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView"
        android:layout_width="144dp"
        android:layout_height="63dp"
        android:textAlignment="center"
        android:textSize="30sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.576"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.229" />

    <TextView
        android:id="@+id/textView4"
        android:layout_width="144dp"
        android:layout_height="63dp"
        android:textAlignment="center"
        android:textSize="30sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.576"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.411" />

    <TextView
        android:id="@+id/textView3"
        android:layout_width="118dp"
        android:layout_height="65dp"
        android:text="Average : "
        android:textSize="30sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.081"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.229" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="118dp"
        android:layout_height="65dp"
        android:text="Power : "
        android:textSize="30sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.081"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.412" />
</androidx.constraintlayout.widget.ConstraintLayout>

Second activity java file
package com.example.power_average;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView res,res2;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        res = findViewById(R.id.textView);
        res2 = findViewById(R.id.textView4);

        Intent intent = getIntent();

        int data = intent.getIntExtra("key", 0);
        int data2 = intent.getIntExtra("lock",0);

        res.setText(Integer.toString(data));
        res2.setText(Integer.toString(data2));


    }
}
