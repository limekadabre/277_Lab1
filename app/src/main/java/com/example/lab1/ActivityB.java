package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
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
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart ------ ","MainActivity: onRestart()");
    }
    public void closeB(View view){
        ActivityB.this.finish();
    }
}