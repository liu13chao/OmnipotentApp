package com.bagen.omnipotentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.widget.TextView;

import com.bagen.omnipotentapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'omnipotentapp' library on application startup.
    static {
        System.loadLibrary("omnipotentapp");
    }

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Example of a call to a native method
        TextView tv = binding.sampleText;
        tv.setText(stringFromJNI());

    }

    /**
     * A native method that is implemented by the 'omnipotentapp' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}