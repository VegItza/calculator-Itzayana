package com.example.calculator_itzayana;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {


    Button deleteLast, clearOperation;
    TextView userInput, calculatorResult;

    Button oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn, zeroBtn, doubleZeroBtn;
    Button percentageBtn, divideBtn, multiplyBtn, minusBtn, plusBtn, equalsBtn, decimalPointBtn;

    String processorHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        deleteLast = findViewById(R.id.btn_clear);
        clearOperation = findViewById(R.id.btn_ClearOperation);
        userInput = findViewById(R.id.cal_userInput);
        calculatorResult = findViewById(R.id.cal_userResult);

        oneBtn = findViewById(R.id.btn_one);
        twoBtn = findViewById(R.id.btn_Two);
        threeBtn = findViewById(R.id.btn_Three);
        fourBtn = findViewById(R.id.btn_Four);
        fiveBtn = findViewById(R.id.btn_Five);
        sixBtn = findViewById(R.id.btn_Six);
        sevenBtn = findViewById(R.id.btn_Seven);
        eightBtn = findViewById(R.id.btn_Eight);
        nineBtn = findViewById(R.id.btn_Nine);
        zeroBtn = findViewById(R.id.btn_Zero);
        doubleZeroBtn = findViewById(R.id.btn_DoubleZero);
        decimalPointBtn = findViewById(R.id.btn_decimalPoint);

        percentageBtn = findViewById(R.id.btn_percentage);
        divideBtn = findViewById(R.id.btn_divide);
        multiplyBtn = findViewById(R.id.btn_multiply);
        minusBtn = findViewById(R.id.btn_Minus);
        plusBtn = findViewById(R.id.btn_Plus);
        equalsBtn = findViewById(R.id.btn_Equals);

        /**************************************************************/
        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processorHolder = userInput.getText().toString();
                userInput.setText(processorHolder + "1");
            }
        });

        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processorHolder = userInput.getText().toString();
                userInput.setText(processorHolder + "2");
            }
        });

        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processorHolder = userInput.getText().toString();
                userInput.setText(processorHolder + "3");
            }
        });

        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processorHolder = userInput.getText().toString();
                userInput.setText(processorHolder + "4");
            }
        });

        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processorHolder = userInput.getText().toString();
                userInput.setText(processorHolder + "1");
            }
        });

        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processorHolder = userInput.getText().toString();
                userInput.setText(processorHolder + "5");
            }
        });

        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processorHolder = userInput.getText().toString();
                userInput.setText(processorHolder + "6");
            }
        });

        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processorHolder = userInput.getText().toString();
                userInput.setText(processorHolder + "7");
            }
        });

        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processorHolder = userInput.getText().toString();
                userInput.setText(processorHolder + "8");
            }
        });

        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processorHolder = userInput.getText().toString();
                userInput.setText(processorHolder + "9");
            }
        });

        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processorHolder = userInput.getText().toString();
                userInput.setText(processorHolder + "0");
            }
        });

        doubleZeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processorHolder = userInput.getText().toString();
                userInput.setText(processorHolder + "00");
            }
        });


        /***************************************************************
         *           onclick event for functional buttons
         ***************************************************************/


        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processorHolder = userInput.getText().toString();
                userInput.setText(processorHolder + "X");
            }
        });

        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processorHolder = userInput.getText().toString();
                userInput.setText(processorHolder + "/");
            }
        });

        percentageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processorHolder = userInput.getText().toString();
                userInput.setText(processorHolder + "%");
            }
        });

        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processorHolder = userInput.getText().toString();
                userInput.setText(processorHolder + "-");
            }
        });

        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processorHolder = userInput.getText().toString();
                userInput.setText(processorHolder + "+");
            }
        });

        deleteLast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processorHolder = userInput.getText().toString();
                if (processorHolder.length() > 0) {
                    processorHolder = processorHolder.substring(0, processorHolder.length() - 1);
                    userInput.setText(processorHolder);
                }
            }
        });

        decimalPointBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processorHolder = userInput.getText().toString();
                userInput.setText(processorHolder + ".");
            }
        });

        clearOperation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userInput.setText("");
                calculatorResult.setText("");
            }
        });


        /***************************************************************/

        equalsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processorHolder = userInput.getText().toString();
                processorHolder = processorHolder.replaceAll("X", "*");
                processorHolder = processorHolder.replaceAll("%", "/100");
                Context context = Context.enter();
                context.setOptimizationLevel(-1);

                String result = "";

                try{
                    if(processorHolder != null && !processorHolder.equals("")) {
                        Scriptable scriptable = context.initSafeStandardObjects();
                        result = context.evaluateString(scriptable, processorHolder, "JavaScript", 1, null).toString();
                    }

                }catch (Exception exception){
                    result = "Operation not allowed";
                }

                calculatorResult.setText(result);
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);

        String userInputValue = userInput.getText().toString();
        outState.putString("userInput", userInputValue);

        String calculatorResultValue = calculatorResult.getText().toString();
        outState.putString("calculatorResult", calculatorResultValue);

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedState){
        super.onRestoreInstanceState(savedState);

        String userInputValue = savedState.getString( "userInput");
        userInput.setText(userInputValue);

        String calculatorResultValue = savedState.getString( "calculatorResult");
        calculatorResult.setText(calculatorResultValue);
    }
}
