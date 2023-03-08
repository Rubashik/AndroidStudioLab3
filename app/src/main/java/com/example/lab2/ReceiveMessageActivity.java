package com.example.lab2;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReceiveMessageActivity extends AppCompatActivity {

    final String TAG = "States";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_receive_message);

        TextView message = (TextView) findViewById(R.id.message);

        Bundle extras = getIntent().getExtras();

        if( extras != null){
            String msg = extras.getString("message");
            message.setText(msg);
        }
    }
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG,"ReceiveMessageActivity: onRestart()");
    }

    protected void onStart(){
        super.onStart();
        Log.d(TAG,"ReceiveMessageActivity: onStart()");
    }

    protected void onResume(){
        super.onResume();
        Log.d(TAG,"ReceiveMessageActivity: onResume()");
    }

    protected void onPause(){
        super.onPause();
        Log.d(TAG,"ReceiveMessageActivity: onPause()");
    }

    protected void onStop(){
        super.onStop();
        Log.d(TAG,"ReceiveMessageActivity: onStop()");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"ReceiveMessageActivity: onDestroy()");
    }
}
