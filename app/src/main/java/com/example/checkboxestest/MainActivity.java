package com.example.checkboxestest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup rgMeat = (RadioGroup) findViewById(R.id.radioGroup2);


        Button btnOrder = findViewById(R.id.btnOrder);
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckBox salty = findViewById(R.id.cbSalty);
                CheckBox tomato = findViewById(R.id.cbTomato);
                CheckBox fresh = findViewById(R.id.cbFresh);
                CheckBox milk = findViewById(R.id.cbMilkSalad);
                String resultOrder = "You ordered osh palov with " +
                        ((RadioButton)findViewById(rgMeat.getCheckedRadioButtonId())).getText();
                if (salty.isChecked()) {resultOrder += ", salty salad";}
                if (tomato.isChecked()) {resultOrder += ", tomato salad";}
                if (fresh.isChecked()) {resultOrder += ", fresh salad";}
                if (milk.isChecked()) {resultOrder += ", milky salad";}

                Intent orderActivity = new Intent(getApplicationContext(),OrderCheckActivity.class);
                orderActivity.putExtra("order", resultOrder);
                startActivity(orderActivity);
            }
        });
    }
}