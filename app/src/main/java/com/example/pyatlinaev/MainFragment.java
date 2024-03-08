package com.example.pyatlinaev;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainFragment extends Fragment {
    private static final String TAG =  "PyatlinaEV";

    public MainFragment() {
        super(R.layout.fragment_main);
    }

    public static MainFragment newInstance(String param1, String param2) {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(requireContext(), "onCreate", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onCreate");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Toast.makeText(requireContext(), "onCreateView", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onCreateView");
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Toast.makeText(requireContext(), "onViewCreated", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onViewCreated");

        TextView text = getView().findViewById(R.id.myTextConstraint2);
        getChildFragmentManager().setFragmentResultListener("rkey", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle bundle) {
                String result = bundle.getString("bkey");
                text.setText(result);
            }
        });
    }

    public void onViewStateRestored(View view, Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Toast.makeText(requireContext(), "onViewStateRestored", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onViewStateRestored");
    }

    public void onStart() {
        super.onStart();
        Toast.makeText(requireContext(), "onStart", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onStart");
    }

    public void onResume() {
        super.onResume();
        Toast.makeText(requireContext(), "onResume", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(requireContext(), "onPause", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Toast.makeText(requireContext(), "onStop", Toast.LENGTH_SHORT).show();
        Log.w(TAG, "onStop");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Toast.makeText(requireContext(), "onSaveInstanceState", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onSaveInstanceState");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Toast.makeText(requireContext(), "onDestroyView", Toast.LENGTH_SHORT).show();
        Log.w(TAG, "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(requireContext(), "onDestroy", Toast.LENGTH_SHORT).show();
        Log.w(TAG, "onDestroy");
    }

}