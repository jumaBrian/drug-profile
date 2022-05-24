package com.brayo.drugprofile;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.brayo.drugprofile.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.submitButton.setOnClickListener(this::addDrugComposition);
    }

    public void addDrugComposition(View view) {
        binding.drugComposition.setText(String.format("Ingredients: %s",
                binding.enterComposition.getText().toString().trim()));
        binding.invalidateAll();
        binding.drugComposition.setVisibility(View.VISIBLE);

        // hide keyboard after input
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        assert inputMethodManager != null;
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}