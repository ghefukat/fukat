Xml file
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:orientation="vertical">

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/bt_show"
        android:text="show dialog"
        android:layout_marginTop="50sp"
        android:layout_gravity="center">
    </Button>

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/txtdate"
        android:textSize="30sp"
        android:layout_marginTop="50sp"
        android:layout_gravity="bottom">

    </TextView>

</LinearLayout>


Mainactivity file
package android;


import android.app.DatePickerDialog;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtdate=findViewById(R.id.txtdate);
        Button bt_show=findViewById(R.id.bt_show);

        bt_show.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View view) {
                final Calendar calendar= Calendar.getInstance();
                int date=calendar.get(Calendar.DATE);
                int month=calendar.get(Calendar.MONTH);
                int year=calendar.get(Calendar.YEAR);
                DatePickerDialog pickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int date) {
                        txtdate.setText("Selected date is : "+date+"-"+month+"-"+year);

                    }
                },year,month,date);
                pickerDialog.show();


                txtdate.setText("Selected date is :"+txtdate.getText());



            }
        });

    }
}