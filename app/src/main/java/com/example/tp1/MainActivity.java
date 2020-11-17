package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText(getApplicationContext(), "Welcome to OnCreate methde", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0,0);
        toast.show();

        Snackbar snackbar = Snackbar
                .make(findViewById(android.R.id.content), "This is a snackbarr !!", Snackbar.LENGTH_LONG);
        snackbar.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast toast = Toast.makeText(getApplicationContext(), "Welcome to onStart methde", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP, 0,0);
        toast.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast toast = Toast.makeText(getApplicationContext(), "Welcome to onResume methde", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.LEFT, 0,0);
        toast.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast toast = Toast.makeText(getApplicationContext(), "Welcome to onPause methde", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM, 0,0);
        toast.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast toast = Toast.makeText(getApplicationContext(), "Welcome to onStop methde", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0,0);
        toast.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast toast = Toast.makeText(getApplicationContext(), "Welcome to onDestry methde", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM, 0,0);
        toast.show();
    }
}