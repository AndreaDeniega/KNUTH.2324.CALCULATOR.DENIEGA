package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    EditText input1, input2, out;
    Button btnPress, btnClear, btnSubtract, btnDivide, btnMultiply;
    TextView result;

    @Override
    @SuppressLint("MissingInflatedID")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.txtResult);
        input1 = findViewById(R.id.txtinput1);
        input2 = findViewById(R.id.txtinput2);
        btnPress = findViewById(R.id.btnResult);
        btnClear = findViewById(R.id.btnClear);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnDivide = findViewById(R.id.btnDivide);
        btnMultiply = findViewById(R.id.btnMultiply);

        btnPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int results = Integer.parseInt(String.valueOf(input2.getText())) + Integer.parseInt(String.valueOf(input1.getText()));
                result.setText(String.valueOf(results));

            }
        });
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int results = Integer.parseInt(String.valueOf(input2.getText())) - Integer.parseInt(String.valueOf(input1.getText()));
                result.setText(String.valueOf(results));

            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int results = Integer.parseInt(String.valueOf(input2.getText())) / Integer.parseInt(String.valueOf(input1.getText()));
                result.setText(String.valueOf(results));

            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int results = Integer.parseInt(String.valueOf(input2.getText())) * Integer.parseInt(String.valueOf(input1.getText()));
                result.setText(String.valueOf(results));

            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(" ");

            }
        });
    }
}
