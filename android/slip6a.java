xml file
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">


    <EditText
        android:id="@+id/editTextTextPersonName"
        android:layout_width="131dp"
        android:layout_height="48dp"
        android:ems="10"
        android:inputType="textPersonName"
        android:text="Enter No 1 :"
        android:textAppearance="@style/TextAppearance.AppCompat.Large"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.057"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.073" />

    <EditText
        android:id="@+id/editTextTextPersonName2"
        android:layout_width="129dp"
        android:layout_height="44dp"
        android:ems="10"
        android:inputType="textPersonName"
        android:text="Enter No 2 :"
        android:textAppearance="@style/TextAppearance.AppCompat.Large"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.063"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.237" />

    <EditText
        android:id="@+id/etNum1"
        android:layout_width="158dp"
        android:layout_height="48dp"
        android:ems="10"
        android:inputType="textPersonName"
        android:textAppearance="@style/TextAppearance.AppCompat.Large"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.747"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.072" />

    <EditText
        android:id="@+id/etNum2"
        android:layout_width="158dp"
        android:layout_height="48dp"
        android:ems="10"
        android:inputType="textPersonName"
        android:textAppearance="@style/TextAppearance.AppCompat.Large"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.747"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.237" />

    <TextView
        android:id="@+id/tvResult"
        android:layout_width="315dp"
        android:layout_height="71dp"
        android:textAppearance="@style/TextAppearance.AppCompat.Large"
        android:textSize="35dp"
        android:textStyle="italic"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.443"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.424" />

    <Button
        android:id="@+id/btnAdd"
        android:layout_width="115dp"
        android:layout_height="74dp"
        android:onClick="Addition"
        android:text="Add"
        android:textAppearance="@style/TextAppearance.AppCompat.Large"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.25"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.654" />

    <Button
        android:id="@+id/btnSub"
        android:layout_width="115dp"
        android:layout_height="74dp"
        android:onClick="Subtraction"
        android:text="Sub"
        android:textAppearance="@style/TextAppearance.AppCompat.Large"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.716"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.655" />

    <Button
        android:id="@+id/btnMul"
        android:layout_width="115dp"
        android:layout_height="74dp"
        android:onClick="Multiplication"
        android:text="Mul"
        android:textAppearance="@style/TextAppearance.AppCompat.Large"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.25"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.848" />

    <Button
        android:id="@+id/btDiv"
        android:layout_width="115dp"
        android:layout_height="74dp"
        android:onClick="Division"
        android:text="Div"
        android:textAppearance="@style/TextAppearance.AppCompat.Large"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.716"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.85" />
</androidx.constraintlayout.widget.ConstraintLayout>

Main activity file
package com.example.operators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvResult;
    EditText etNum1,etNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tvResult);
        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
    }

    public void Addition(View v){
        float n1,n2,result;

        n1 = Float.parseFloat(etNum1.getText().toString());
        n2 = Float.parseFloat(etNum2.getText().toString());

        result = n1 + n2;

        tvResult.setText(String.format("Addition: %s", result));
    }
    public void Subtraction(View v){
        float n1,n2,result;

        n1 = Float.parseFloat(etNum1.getText().toString());
        n2 = Float.parseFloat(etNum2.getText().toString());

        result = n1 - n2;

        tvResult.setText(String.format("Subtraction: %s", result));
    }
    public void Multiplication(View v){
        float n1,n2,result;

        n1 = Float.parseFloat(etNum1.getText().toString());
        n2 = Float.parseFloat(etNum2.getText().toString());

        result = n1 * n2;

        tvResult.setText(String.format("Multiplication: %s", result));
    }
    public void Division(View v){
        float n1,n2,result;

        n1 = Float.parseFloat(etNum1.getText().toString());
        n2 = Float.parseFloat(etNum2.getText().toString());

        result = n1 / n2;

        tvResult.setText(String.format("Division: %s", result));
    }
}