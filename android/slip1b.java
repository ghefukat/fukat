XML FILE
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
tools:context=".MainActivity">
<Button
android:id="@+id/button"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="show progress dialog"
android:layout_gravity="center"
android:layout_marginStart="50dp"/>
</LinearLayout>
JAVA FILE
package com.example.slip12;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
Button button;
mytask mytask;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
button=(Button) findViewById(R.id.button);
button.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
mytask = new mytask();
mytask.execute();
}
});
}
class mytask extends AsyncTask<Void,Integer,Void>{
ProgressDialog manish;
boolean running;
@Override
protected Void doInBackground(Void... Voids){
try {
while (manish.getProgress() <= manish .getMax())
{
Thread.sleep(300);
manish.incrementProgressBy(1);
if(manish.getProgress()==manish.getMax())
{
manish.dismiss();
}
}
}catch(Exception e){
e.printStackTrace();
}
return null;
}
@Override
protected void onPreExecute() {
super.onPreExecute();
running = true;
manish=new ProgressDialog(MainActivity.this);
manish.setMax(100);
manish.setMessage("loading....................");
manish.setTitle("Progressdialog Box Example");
manish.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
manish.show();
}
@Override
protected void onPostExecute(Void unused) {
super.onPostExecute(unused);
manish.dismiss();
}
@Override
protected void onProgressUpdate(Integer... values) {
super.onProgressUpdate(values);
manish.setMessage(String.valueOf(values));
}
}
}