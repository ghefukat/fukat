xml 1 file
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/listViewD"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:orientation="vertical">

    <Button
        android:id="@+id/btn"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Show context menu"
        android:textSize="30sp">

    </Button>


</LinearLayout>

Main activity file
package com.example.slip17_q2_contextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=findViewById(R.id.btn);
        registerForContextMenu(btn);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu,menu);

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.action1)
        {
            Toast.makeText(this, "You selected "+item, Toast.LENGTH_SHORT).show();
        }
        else if (item.getItemId()==R.id.action2)
        {
            Toast.makeText(this, "You selected "+item, Toast.LENGTH_SHORT).show();
        }
        else if (item.getItemId()==R.id.action3)
        {
            Toast.makeText(this, "You selected "+item, Toast.LENGTH_SHORT).show();
        }
        else if (item.getItemId()==R.id.switch1)
        {
            Toast.makeText(this, "You selected "+item, Toast.LENGTH_SHORT).show();
        }
        else if (item.getItemId()==R.id.search1)
        {
            Toast.makeText(this, "You selected"+item, Toast.LENGTH_SHORT).show();
        }

        return super.onContextItemSelected(item);
    }

}

menu/menu.xml file
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item
        android:title="Item1"
        android:id="@+id/action1">

    </item>
    <item
        android:title="Item2"
        android:id="@+id/action2">

    </item>
    <item
        android:title="Item3"
        android:id="@+id/action3">

    </item>
    <item
        android:title="Switch"
        android:id="@+id/switch1">

    </item>
    <item
        android:title="Search"
        android:id="@+id/search1">

    </item>

</menu>