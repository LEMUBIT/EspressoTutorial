package com.lemuel.lemubit.espressotutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText editTextA;
    EditText editTextB;
    Button copyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextA = findViewById(R.id.textA);
        editTextB = findViewById(R.id.textB);
        copyBtn = findViewById(R.id.copyBtn);

        copyBtn.setOnClickListener(
                (view -> {
                    if (!TextUtils.isEmpty(editTextA.getText().toString())) {
                        editTextB.setText(editTextA.getText().toString());
                    }
                })
        );

    }

}
