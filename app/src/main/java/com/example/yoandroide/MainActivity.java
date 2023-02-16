package com.example.yoandroide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Binder;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Calculator calculator;
    private TextView textView;
    private String operation = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculator = new Calculator();
        textView = findViewById(R.id.textView);
    }

    public void equalButton(View view) {
        try {
            String[] s = operation.split("[\\+\\*/-]");
            calculator.calculate(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
            textView.setText(calculator.toString());
            operation = "";
            calculator.reset();
        } catch (NullPointerException | NumberFormatException e) {
            textView.setText("0");
        }
    }

    public void sumButton(View view) {
        calculator.sum();
        operation += '+';
        textView.setText(operation);
    }

    public void subButton(View view) {
        calculator.sub();
        operation += '-';
        textView.setText(operation);
    }

    public void mulButton(View view) {
        calculator.mul();
        operation += '*';
        textView.setText(operation);
    }

    public void divButton(View view) {
        calculator.div();
        operation += '/';
        textView.setText(operation);
    }

    public void zeroButton(View view) {
        operation += '0';
        textView.setText(operation);
    }

    public void oneButton(View view) {
        operation += '1';
        textView.setText(operation);
    }

    public void twoButton(View view) {
        operation += '2';
        textView.setText(operation);
    }

    public void threeButton(View view) {
        operation += '3';
        textView.setText(operation);
    }

    public void fourButton(View view) {
        operation += '4';
        textView.setText(operation);
    }

    public void fiveButton(View view) {
        operation += '5';
        textView.setText(operation);
    }

    public void sixButton(View view) {
        operation += '6';
        textView.setText(operation);
    }

    public void sevenButton(View view) {
        operation += '7';
        textView.setText(operation);
    }

    public void eightButton(View view) {
        operation += '8';
        textView.setText(operation);
    }

    public void nineButton(View view) {
        operation += '9';
        textView.setText(operation);
    }
}