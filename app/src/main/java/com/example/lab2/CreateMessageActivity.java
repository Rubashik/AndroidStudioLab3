package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toolbar;

public class CreateMessageActivity extends AppCompatActivity {

    final String TAG = "States";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_create_message);

        EditText messageView = (EditText) findViewById(R.id.editText);

        if(savedInstanceState != null){
            messageView.setText("message");
        }
    }

    public void onSendMessage(View view) {
        EditText messageView = (EditText) findViewById(R.id.editText);
        String messageText = messageView.getText().toString();

        Intent intent = new Intent(CreateMessageActivity.this, ReceiveMessageActivity.class);
        intent.setType("text/plain");
        intent.putExtra("message", messageText);

        startActivity(intent);
    }

    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        EditText messageView = (EditText) findViewById(R.id.editText);
        String messageText = messageView.getText().toString();
        savedInstanceState.putString("message", messageText);
    }

    protected void onRestart(){
        super.onRestart();
        Log.d(TAG,"CreateMessageActivity: onRestart()");
    }

    protected void onStart(){
        super.onStart();
        Log.d(TAG,"CreateMessageActivity: onStart()");
    }

    protected void onResume(){
        super.onResume();
        Log.d(TAG,"CreateMessageActivity: onResume()");
    }

    protected void onPause(){
        super.onPause();
        Log.d(TAG,"CreateMessageActivity: onPause()");
    }

    protected void onStop(){
        super.onStop();
        Log.d(TAG,"CreateMessageActivity: onStop()");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"CreateMessageActivity: onDestroy()");
    }
}