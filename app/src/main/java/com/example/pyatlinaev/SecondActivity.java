package com.example.pyatlinaev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/*public class SecondActivity extends AppCompatActivity {
    private static final String TAG =  "PyatlinaEV";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle arguments = getIntent().getExtras();
        if (arguments != null) {
            String name = arguments.get("goodness").toString();
            Log.i(TAG, name);
        }

        Button myButton = findViewById(R.id.Button1);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                intent.putExtra("goodness", "Вернулись из \"Поддержать\" ");
                setResult(1, intent);
                finish();
            }
        };
        myButton.setOnClickListener(listener);

    }
}*/