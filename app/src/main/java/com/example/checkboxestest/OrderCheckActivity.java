package com.example.checkboxestest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class OrderCheckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_check);

        ImageButton btnGoBack = findViewById(R.id.icBack);
        TextView orderCheck = findViewById(R.id.orderCheck);

        Bundle extras = getIntent().getExtras();
        String order;
        if(extras != null) {
            order = extras.getString("order");

            orderCheck.setText(order);
        }

        btnGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}