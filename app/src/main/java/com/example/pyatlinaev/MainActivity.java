package com.example.pyatlinaev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG =  "PyatlinaEV";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "onCreate. Этап создания!", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Этап onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart. Приложение запущено!", Toast.LENGTH_SHORT).show();
        Log.v(TAG, "Этап onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "onResume. Вы в приложении!", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "Этап onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause. Свёртывание активности", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "Этап onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop. Остановка активности", Toast.LENGTH_SHORT).show();
        Log.w(TAG, "Этап onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "onRestart. Возобновление активности", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Этап onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy. Завершение работы", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Этап onDestroy");
    }
}

