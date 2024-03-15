package com.example.pyatlinaev;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private static final String TAG =  "PyatlinaEV";
    public MainActivity() {
        super(R.layout.activity_main);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            Bundle bundle = new Bundle();
            bundle.putInt("some_int", 0);
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container_view, MainFragment.class, bundle)
                    .commit();
        }

        // TextView myTextView = findViewById(R.id.myTextConstraint);
        // myTextView.setText(getString(R.string.constraintText1));
        /*Button myButton = findViewById(R.id.myButton3);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("goodness", "Решили поддержать");
                mStartForResult.launch(intent);
            }
        };
        myButton.setOnClickListener(listener);*/

    }

    /*private final ActivityResultLauncher<Intent> mStartForResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    String data2 = result.getData().getStringExtra("goodness");
                    Log.i(TAG, data2);
                }
            });*/

    @Override
    protected void onStart() {
        super.onStart();
    }
    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    public void myButtonClick(View view) {
        Log.i(TAG, "Кнопка была нажата");
    }

    public void onClick(View view) {

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String data2 = data.getStringExtra("goodness");
        Log.i(TAG, data2);
    }
}

