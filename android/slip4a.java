xml 1
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:orientation="vertical">

    <EditText
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/txt_name"
        android:hint="Enter the name"
        android:textSize="20sp"
        android:layout_marginLeft="40dp"
        android:layout_marginRight="40dp"
        android:layout_marginTop="10dp">
    </EditText>

    <EditText
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/txt_surname"
        android:hint="Enter surname"
        android:textSize="20sp"
        android:layout_marginLeft="40dp"
        android:layout_marginRight="40dp"
        android:layout_marginTop="10dp">
    </EditText>

    <EditText
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/txt_class"
        android:hint="Enter the class"
        android:textSize="20sp"
        android:layout_marginLeft="40dp"
        android:layout_marginRight="40dp"
        android:layout_marginTop="10dp">
    </EditText>
    <EditText
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/txt_gender"
        android:hint="Enter the gender"
        android:textSize="20sp"
        android:layout_marginLeft="40dp"
        android:layout_marginRight="40dp"
        android:layout_marginTop="10dp">
    </EditText>
    <EditText
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/txt_hobbies"
        android:hint="Enter the hobbies"
        android:textSize="20sp"
        android:layout_marginLeft="40dp"
        android:layout_marginRight="40dp"
        android:layout_marginTop="10dp">
    </EditText>
    <EditText
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/txt_marks"
        android:hint="Enter the marks"
        android:textSize="20sp"
        android:layout_marginLeft="40dp"
        android:layout_marginRight="40dp"
        android:layout_marginTop="10dp">
    </EditText>
    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="submit"
        android:textSize="20sp"
        android:id="@+id/submit"
        android:layout_marginLeft="50dp"
        android:layout_marginRight="50dp">

    </Button>
</LinearLayout>

Main activity file
package com.example.slip4_q1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText txtname=findViewById(R.id.txt_name);
        EditText txtclass=findViewById(R.id.txt_class);
        EditText txtgender=findViewById(R.id.txt_gender);
        EditText txtmarks=findViewById(R.id.txt_marks);
        EditText txthobbies=findViewById(R.id.txt_hobbies);
        EditText txtsurname=findViewById(R.id.txt_surname);

        Button bt_submit=findViewById(R.id.submit);

        bt_submit.setOnClickListener(view -> {
            Intent intent1=new Intent(MainActivity.this,SecondActivity.class);
            intent1.putExtra("Name",txtname.getText().toString());
            intent1.putExtra("Surname",txtsurname.getText().toString());
            intent1.putExtra("Year",txtclass.getText().toString());
            intent1.putExtra("Gender",txtgender.getText().toString());
            intent1.putExtra("Marks",txtmarks.getText().toString());
            intent1.putExtra("Hobbies",txthobbies.getText().toString());
            Bundle bundle=new Bundle();

            startActivity(intent1);

        });


    }
}

xml 2 file
<?xml version="1.0" encoding="utf-8"?>
<TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".SecondActivity">
    <TableRow
        android:layout_marginTop="100dp"
        android:layout_marginRight="40dp"
        android:layout_marginLeft="40dp">


    <TextView
        android:id="@+id/txt1"
        android:layout_marginRight="40dp"
        android:layout_marginLeft="40dp"
        android:text=""
        android:textSize="20sp"
        android:layout_height="wrap_content"
        android:layout_width="wrap_content">

    </TextView>
    <TextView
        android:id="@+id/txt2"
        android:layout_marginRight="40dp"
        android:layout_marginLeft="40dp"
        android:text=""
        android:textSize="20sp"
        android:layout_height="wrap_content"
        android:layout_width="wrap_content">

    </TextView>
    </TableRow>
    <TableRow
        android:layout_marginTop="30dp"
        android:layout_marginRight="40dp"
        android:layout_marginLeft="40dp">

    <TextView
        android:id="@+id/txt3"
        android:layout_marginRight="40dp"
        android:layout_marginLeft="40dp"
        android:text=""
        android:textSize="20sp"
        android:layout_height="wrap_content"
        android:layout_width="wrap_content">

    </TextView>
    <TextView
        android:id="@+id/txt4"
        android:layout_marginRight="40dp"
        android:layout_marginLeft="40dp"
        android:text=""
        android:textSize="20sp"
        android:layout_height="wrap_content"
        android:layout_width="wrap_content">

    </TextView>
    </TableRow>
    <TableRow
        android:layout_marginTop="30dp"
        android:layout_marginRight="40dp"
        android:layout_marginLeft="40dp">


    <TextView
        android:id="@+id/txt5"
        android:layout_marginRight="40dp"
        android:layout_marginLeft="40dp"
        android:text=""
        android:textSize="20sp"
        android:layout_height="wrap_content"
        android:layout_width="wrap_content">

    </TextView>
    <TextView
        android:id="@+id/txt6"
        android:layout_marginRight="40dp"
        android:layout_marginLeft="40dp"
        android:text=""
        android:textSize="20sp"
        android:layout_height="wrap_content"
        android:layout_width="wrap_content">

    </TextView>
    </TableRow>


</TableLayout>

Second activity file
package com.example.slip4_q1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView txt_1 = findViewById(R.id.txt1);
        TextView txt_2 = findViewById(R.id.txt2);
        TextView txt_3 = findViewById(R.id.txt3);
        TextView txt_4 = findViewById(R.id.txt4);
        TextView txt_5 = findViewById(R.id.txt5);
        TextView txt_6 = findViewById(R.id.txt6);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            String name = bundle.getString("Name");
            String surname = bundle.getString("Surname");
            String Class = bundle.getString("Year");
            String gender = bundle.getString("Gender");
            String marks = bundle.getString("Marks");
            String hobbies = bundle.getString("Hobbies");


            txt_1.setText(name);
            txt_2.setText(surname);
            txt_3.setText(Class);
            txt_4.setText(marks);
            txt_5.setText(gender);
            txt_6.setText(hobbies);


        }

    }
}