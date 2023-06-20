package com.example.tapcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListeners();
    }

    private void initListeners() {
        Button toast_button = findViewById(R.id.toast_button);
        Button count_button = findViewById(R.id.count_button);
        TextView counter = findViewById(R.id.count_text);

        toast_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"Hello toast!", Toast.LENGTH_SHORT).show();
            }
        });

        count_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Integer count_number = Integer.parseInt(counter.getText().toString());
               count_number++;
               counter.setText(String.valueOf(count_number));
            }
        });
    }
}
