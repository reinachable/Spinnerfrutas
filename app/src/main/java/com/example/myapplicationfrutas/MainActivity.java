package com.example.myapplicationfrutas;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private String[] fruits = {"Manzana", "Sandia", "Uva", "Piña", "Mango"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner fruitsSpinner = findViewById(R.id.fruitsSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, fruits);
        fruitsSpinner.setAdapter(adapter);

        fruitsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedFruit = fruits[position];
                Toast.makeText(MainActivity.this, "La fruta que seleccionaste es: " + selectedFruit, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // No se hace nada cuando no se selecciona nada en el Spinner
            }
        });
    }
}








