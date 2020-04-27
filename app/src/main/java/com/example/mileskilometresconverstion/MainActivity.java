package com.example.mileskilometresconverstion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnMiles = findViewById(R.id.miles);

        btnMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText kmText = findViewById(R.id.kmeditText);
                EditText milesText = findViewById(R.id.MileseditText);
                Double vMiles = Double.valueOf(milesText.getText().toString());
                Double vKm = vMiles/0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                kmText.setText(formatVal.format(vKm));
            }
        });
        Button btnKm = findViewById(R.id.km);
        btnKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText kmText = findViewById(R.id.kmeditText);
                EditText milesText = findViewById(R.id.MileseditText);
                Double vKm = Double.valueOf(kmText.getText().toString());
                Double vMiles  = vKm*0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                milesText.setText(formatVal.format(vMiles));
            }
        });
    }
}
