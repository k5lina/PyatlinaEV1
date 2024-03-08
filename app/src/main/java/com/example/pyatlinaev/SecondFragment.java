package com.example.pyatlinaev;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;

public class SecondFragment extends Fragment {

    private static final String TAG =  "PyatlinaEV";
    public SecondFragment() {
        super(R.layout.fragment_second);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        Button myButton = view.findViewById(R.id.myButtonLinear);
        EditText edText = view.findViewById(R.id.myEditText);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "Это твой новый друг " + edText.getText().toString();
                Bundle result = new Bundle();
                result.putString("bkey", text);
                getParentFragmentManager().setFragmentResult("rkey", result);
            }
        });
        return view;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Toast.makeText(requireContext(), "onViewCreated", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onViewCreated");


    }
}