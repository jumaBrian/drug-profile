package com.brayo.drugprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText enterDrugComposition;
    private TextView drugComposition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterDrugComposition = findViewById(R.id.enter_composition);
        drugComposition = findViewById(R.id.drug_composition);

    }

    public void addDrugComposition(View view) {
        drugComposition.setText(String.format("Ingredients: %s", enterDrugComposition.getText().toString().trim()));
        drugComposition.setVisibility(View.VISIBLE);
    }
}