package com.example.android_tutorial_02;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "ccsl";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }

    @Override
    protected void onRestoreInstanceState(Bundle RestoreInstanceState) {
        super.onRestoreInstanceState(RestoreInstanceState);
        Log.i(TAG, "onRestoreInstanceState");
    }

    @Override
    protected void onSaveInstanceState(Bundle SavesInstanceState) {
        super.onSaveInstanceState(SavesInstanceState);
        Log.i(TAG, "onSaveInstanceState");
    }


}