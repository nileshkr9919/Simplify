package com.example.simplify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String operand1 = "";
    String operand2 = "";
    float result;
    boolean addition, subtraction, multiplication, division, percentage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.color.mystyle));
    }

    public void operation(View view) {
        TextView expression = (TextView) findViewById(R.id.expression);
        TextView answer = (TextView) findViewById(R.id.answer);
        switch (view.getId()) {
            case R.id.one:
                expression.setText(expression.getText() + "1");
                set("1");
                break;
            case R.id.two:
                expression.setText(expression.getText() + "2");
                set("2");
                break;
            case R.id.three:
                expression.setText(expression.getText() + "3");
                set("3");
                break;
            case R.id.four:
                expression.setText(expression.getText() + "4");
                set("4");
                break;
            case R.id.five:
                expression.setText(expression.getText() + "5");
                set("5");
                break;
            case R.id.six:
                expression.setText(expression.getText() + "6");
                set("6");
                break;
            case R.id.seven:
                expression.setText(expression.getText() + "7");
                set("7");
                break;
            case R.id.eight:
                expression.setText(expression.getText() + "8");
                set("8");
                break;
            case R.id.nine:
                expression.setText(expression.getText() + "9");
                set("9");
                break;
            case R.id.zeroOnce:
                expression.setText(expression.getText() + "0");
                set("0");
                break;
            case R.id.zeroTwice:
                expression.setText(expression.getText() + "00");
                set("00");
                break;
            case R.id.point:
                expression.setText(expression.getText() + ".");
                set(".");
                break;
            case R.id.clear_text:
                expression.setText(null);
                answer.setText(null);
                operand2 = "";
                operand1 = "";
                result = 0;
                break;
            case R.id.percentage:
                expression.setText(expression.getText() + " % ");
                set("%");
                percentage = true;
                break;
            case R.id.divide:
                expression.setText(expression.getText() + " / ");
                set("/");
                division = true;
                break;
            case R.id.multiply:
                expression.setText(expression.getText() + " * ");
                set("*");
                multiplication = true;
                break;
            case R.id.add:
                expression.setText(expression.getText() + " + ");
                set("+");
                addition = true;
                break;
            case R.id.subtract:
                expression.setText(expression.getText() + "-");
                set("-");
                subtraction = true;
                break;
            case R.id.equals:
                answer.setText(String.valueOf(result));
                operand1 = String.valueOf(result);
                operand2 = "";
                break;
        }
    }

    private void set(String input) {
        if (!(input == "+" || input == "-" || input == "*" || input == "/" || input == "%")) {
            if (addition || subtraction || multiplication || division || percentage)
                operand2 += input;
            else
                operand1 += input;
        }
        else {
            if (operand2 != "") {
                switch (input) {
                    case "+":
                        add();
                        break;
                    case "-":
                        subtract();
                        break;
                    case "*":
                        multiply();
                        break;
                    case "/":
                        divide();
                        ;
                        break;
                    case "%":
                        percent();
                        break;
                }
            }
        }
    }

    public void add() {
        result = Float.parseFloat(operand1) + Float.parseFloat(operand2);
        addition = false;
    }

    public void subtract() {
        result = Float.parseFloat(operand1) - Float.parseFloat(operand2);
        subtraction = false;
    }

    public void multiply() {
        result = Float.parseFloat(operand1) * Float.parseFloat(operand2);
        multiplication = false;
    }

    public void divide() {
        result = Float.parseFloat(operand1) / Float.parseFloat(operand2);
        division = false;
    }

    public void percent() {
        result = (Float.parseFloat(operand1) / 100) * Float.parseFloat(operand2);
        percentage = false;
    }
}