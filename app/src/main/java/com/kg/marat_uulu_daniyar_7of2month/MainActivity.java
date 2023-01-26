package com.kg.marat_uulu_daniyar_7of2month;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.net.ipsec.ike.exceptions.IkeNetworkLostException;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Integer first, second, result;
    private Boolean isOperationClicked;
    private String chosenOperation;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
    }

    @SuppressLint("NonConstantResourceId")
    public void onNumberClick(View view) {
        switch (view.getId()){
            case R.id.btn_one:
                setOrAppend("1");
                break;
            case R.id.btn_two:
                setOrAppend("2");
                break;
            case R.id.btn_three:
                setOrAppend("3");
                break;
            case R.id.btn_four:
                setOrAppend("4");
                break;
            case R.id.btn_five:
                setOrAppend("5");
                break;
            case R.id.btn_six:
                setOrAppend("6");
                break;
            case R.id.btn_seven:
                setOrAppend("7");
                break;
            case R.id.btn_eight:
                setOrAppend("8");
                break;
            case R.id.btn_nine:
                setOrAppend("9");
                break;
            case R.id.btn_zero:
                setOrAppend("0");
                break;
            case R.id.btn_clear:
                textView.setText("0");
                first = 0;
                second = 0;
                break;
        }
        isOperationClicked = false;
    }


    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    public void onOperationClick(View view) {
        switch (view.getId()){
            case R.id.btn_plus:
                first = Integer.valueOf(textView.getText().toString());
                chosenOperation = "+";
                break;
            case R.id.btn_minus:
                first = Integer.valueOf(textView.getText().toString());
                chosenOperation = "-";
                break;
            case R.id.btn_multiplication:
                first = Integer.valueOf(textView.getText().toString());
                chosenOperation = "*";
                break;
            case R.id.btn_division:
                first = Integer.valueOf(textView.getText().toString());
                chosenOperation = "/";
                break;
            case R.id.btn_equal:
                second = Integer.valueOf(textView.getText().toString());
                chosenOper(chosenOperation);
                textView.setText(result.toString());
                first = 0;
                second = 0;
                break;
        }
        isOperationClicked = true;
    }
    public void setOrAppend(String num) {
        if (textView.getText().toString().equals("0") || isOperationClicked) {
            textView.setText(num);
        } else {
            textView.append(num);
        }
    }
    public void chosenOper(String oper){
        switch (oper){
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                result = first / second;
                break;
        }
    }
}