package com.example.pulkit.messenger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button send;
    EditText num,text;
    String number, message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        send = (Button) findViewById(R.id.send);
        text = (EditText) findViewById(R.id.text);
        num = (EditText) findViewById(R.id.num);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number = num.getText().toString();
                message = text.getText().toString();
                SmsManager sms = SmsManager.getDefault();
                sms.sendTextMessage(number,null,message,null,null);
            }
        });

    }
}
