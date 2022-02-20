package com.example.lab1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Initialize the Count for the Thread Counter
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart ------ ","MainActivity: onStart()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume ------ ","MainActivity: onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause ------ ","MainActivity: onPause()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop ------ ","MainActivity: onStop()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy ------ ","MainActivity: onDestroy()");
    }
    private void incrementCount() {
        count += 1;
        TextView Counter = (TextView)findViewById(R.id.textView2);
        Counter.setText("Thread Counter: ".concat(String.valueOf(count)));
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        incrementCount();
        Log.e("onRestart ------ ","MainActivity: onRestart()");
    }

    //To start Activity B
    public void startActivityB(View view){
        Intent intent = new Intent(MainActivity.this, ActivityB.class);
        startActivity(intent);
    }

    //Code for Dialog box
    public void openDialogBox(View view) {
        AlertDialog.Builder dialogbox = new AlertDialog.Builder(MainActivity.this);
        dialogbox.setMessage("Simple dialog");

        dialogbox.setNeutralButton(
                "Close",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                }
        );
        AlertDialog alert = dialogbox.create();
        alert.show();
    }

    // Close App
    public void closeApp(View view){
        MainActivity.this.finish();
    }
}