activity_main.xml

<?xml version="1.0" encoding="utf-8"?>  
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"  
    xmlns:app="http://schemas.android.com/apk/res-auto"  
    xmlns:tools="http://schemas.android.com/tools"  
    android:layout_width="match_parent"  
    android:layout_height="match_parent"  
    tools:context="example.javatpoint.com.datepicker.MainActivity">  
  
    <TextView  
        android:id="@+id/textView1"  
        android:layout_width="wrap_content"  
        android:layout_height="wrap_content"  
        android:layout_above="@+id/button1"  
        android:layout_alignParentLeft="true"  
        android:layout_alignParentStart="true"  
        android:layout_marginBottom="102dp"  
        android:layout_marginLeft="30dp"  
        android:layout_marginStart="30dp"  
        android:text="" />  
  
    <Button  
        android:id="@+id/button1"  
        android:layout_width="wrap_content"  
        android:layout_height="wrap_content"  
        android:layout_alignParentBottom="true"  
        android:layout_centerHorizontal="true"  
        android:layout_marginBottom="20dp"  
        android:text="Change Date" />  
  
    <DatePicker  
        android:id="@+id/datePicker"  
        android:layout_width="wrap_content"  
        android:layout_height="wrap_content"  
        android:layout_above="@+id/textView1"  
        android:layout_centerHorizontal="true"  
        android:layout_marginBottom="36dp" />  
  
</RelativeLayout>  

MainActivity.java

package example.javatpoint.com.datepicker;  
  
import android.support.v7.app.AppCompatActivity;  
import android.os.Bundle;  
import android.view.View;  
import android.widget.Button;  
import android.widget.DatePicker;  
import android.widget.TextView;  
  
public class MainActivity extends AppCompatActivity {  
    DatePicker picker;  
    Button displayDate;  
    TextView textview1;  
    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_main);  
  
        textview1=(TextView)findViewById(R.id.textView1);  
        picker=(DatePicker)findViewById(R.id.datePicker);  
        displayDate=(Button)findViewById(R.id.button1);  
  
        textview1.setText("Current Date: "+getCurrentDate());  
  
        displayDate.setOnClickListener(new View.OnClickListener(){  
            @Override  
            public void onClick(View view) {  
  
                textview1.setText("Change Date: "+getCurrentDate());  
            }  
  
        });  
  
    }  
    public String getCurrentDate(){  
        StringBuilder builder=new StringBuilder();;  
        builder.append((picker.getMonth() + 1)+"/");//month is 0 based  
        builder.append(picker.getDayOfMonth()+"/");  
        builder.append(picker.getYear());  
        return builder.toString();  
    }  
}  