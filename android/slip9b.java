AndroidManifest.xml
<uses-permission android:name="android.permission.SEND_SMS" />
<uses-permission android:name="android.permission.RECEIVE_SMS" />


MainActivity.java
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.telephony.SmsMessage;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText phoneNumberEditText;
    private EditText messageEditText;

    private DeliveryReportReceiver deliveryReportReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get references to the UI elements
        phoneNumberEditText = findViewById(R.id.phone_number_edit_text);
        messageEditText = findViewById(R.id.message_edit_text);
        Button sendButton = findViewById(R.id.send_button);

        // Register the delivery report receiver
        deliveryReportReceiver = new DeliveryReportReceiver();
        registerReceiver(deliveryReportReceiver, new IntentFilter("DELIVERED_SMS"));

        // Set a click listener for the send button
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the phone number and message from the UI
                String phoneNumber = phoneNumberEditText.getText().toString();
                String message = messageEditText.getText().toString();

                // Create the SMS manager and send the message
                SmsManager smsManager = SmsManager.getDefault();
                Intent deliveryIntent = new Intent("DELIVERED_SMS");
                PendingIntent deliveryPendingIntent = PendingIntent.getBroadcast(MainActivity.this, 0, deliveryIntent, PendingIntent.FLAG_UPDATE_CURRENT);
                smsManager.sendTextMessage(phoneNumber, null, message, null, deliveryPendingIntent);

                // Display a toast message indicating that the message has been sent
                Toast.makeText(MainActivity.this, "Message sent", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Unregister the delivery report receiver
        unregisterReceiver(deliveryReportReceiver);
    }

    private class DeliveryReportReceiver extends android.content.BroadcastReceiver {
        @Override
        public void onReceive(android.content.Context context, Intent intent) {
            switch (getResultCode()) {
                case RESULT_OK:
                    // Display a toast message indicating that the message has been delivered
                    Toast.makeText(context, "Message delivered", Toast.LENGTH_SHORT).show();
                    break;
                case RESULT_CANCELED:
                    // Display a toast message indicating that the message could not be delivered
                    Toast.makeText(context, "Message delivery failed", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }
}