package com.example.simplify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean addition, subtraction, multiplication, division, percentage;
    TextView expression1;
    TextView expression2;
    TextView operator;
    TextView answer;
    int operand1, operand2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.color.mystyle));

        expression1 = (TextView)findViewById(R.id.expression1);
        expression2 = (TextView)findViewById(R.id.expression2);
        operator = (TextView)findViewById(R.id.operator);
        answer = (TextView)findViewById(R.id.answer);
    }


    public void operation(View view) {
        switch (view.getId()) {
            case R.id.one:
                if(addition||subtraction||multiplication||division||percentage)
                    expression2.setText(expression2.getText() + "1");
                else
                    expression1.setText(expression1.getText() + "1");
                break;
            case R.id.two:
                if(addition||subtraction||multiplication||division||percentage)
                    expression2.setText(expression2.getText() + "2");
                else
                    expression1.setText(expression1.getText() + "2");
                break;
            case R.id.three:
                if(addition||subtraction||multiplication||division||percentage)
                    expression2.setText(expression2.getText() + "3");
                else
                    expression1.setText(expression1.getText() + "3");
                break;
            case R.id.four:
                if(addition||subtraction||multiplication||division||percentage)
                    expression2.setText(expression2.getText() + "4");
                else
                    expression1.setText(expression1.getText() + "4");
                break;
            case R.id.five:
                if(addition||subtraction||multiplication||division||percentage)
                    expression2.setText(expression2.getText() + "5");
                else
                    expression1.setText(expression1.getText() + "5");
                break;
            case R.id.six:
                if(addition||subtraction||multiplication||division||percentage)
                    expression2.setText(expression2.getText() + "6");
                else
                    expression1.setText(expression1.getText() + "6");
                break;
            case R.id.seven:
                if(addition||subtraction||multiplication||division||percentage)
                    expression2.setText(expression2.getText() + "7");
                else
                    expression1.setText(expression1.getText() + "7");
                break;
            case R.id.eight:
                if(addition||subtraction||multiplication||division||percentage)
                    expression2.setText(expression2.getText() + "8");
                else
                    expression1.setText(expression1.getText() + "8");
                break;
            case R.id.nine:
                if(addition||subtraction||multiplication||division||percentage)
                    expression2.setText(expression2.getText() + "9");
                else
                    expression1.setText(expression1.getText() + "9");
                break;
            case R.id.zeroOnce:
                if(addition||subtraction||multiplication||division||percentage)
                    expression2.setText(expression2.getText() + "0");
                else
                    expression1.setText(expression1.getText() + "0");
                break;
            case R.id.zeroTwice:
                if(addition||subtraction||multiplication||division||percentage)
                    expression2.setText(expression2.getText() + "00");
                else
                    expression1.setText(expression1.getText() + "00");
                break;
            case R.id.point:
                if(addition||subtraction||multiplication||division||percentage)
                    expression2.setText(expression2.getText() + ".");
                else
                    expression1.setText(expression1.getText() + ".");
                break;
            case R.id.clear_text:
                    answer.setText("");
                    expression2.setText("");
                    expression1.setText("");
                    operator.setText("");
                    addition = subtraction = multiplication = division = percentage = false;
                break;
            case R.id.percentage:
                operator.setVisibility(View.VISIBLE);
                expression2.setVisibility(View.VISIBLE);
                percentage = true;
                operator.setText("%");

                break;
            case R.id.divide:
                operator.setVisibility(View.VISIBLE);
                expression2.setVisibility(View.VISIBLE);
                division = true;
                operator.setText("/");
                break;
            case R.id.multiply:
                operator.setVisibility(View.VISIBLE);
                expression2.setVisibility(View.VISIBLE);
                multiplication = true;
                operator.setText("x");
                break;
            case R.id.add:
                operator.setVisibility(View.VISIBLE);
                expression2.setVisibility(View.VISIBLE);
                addition = true;
                operator.setText("+");
                break;
            case R.id.subtract:
                operator.setVisibility(View.VISIBLE);
                expression2.setVisibility(View.VISIBLE);
                subtraction = true;
                operator.setText("-");
                break;
            case R.id.equals:
                operand1 = Integer.parseInt(String.valueOf(expression1.getText()));
                operand2 = Integer.parseInt(String.valueOf(expression2.getText()));
                if(addition==true)
                    answer.setText(String.valueOf(operand1 + operand2));
                if(subtraction==true)
                    answer.setText(String.valueOf(operand1 - operand2));
                if(multiplication==true)
                    answer.setText(String.valueOf(operand1 * operand2));
                if(division==true)
                    answer.setText(String.valueOf(operand1 / operand2));
                if(percentage==true)
                    answer.setText(String.valueOf(operand1 % operand2));
                addition = subtraction = multiplication = division = percentage = false;
                break;
        }
    }

}