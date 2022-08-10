package com.zakiralekperov.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.button.MaterialButtonToggleGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonClear;
    Button buttonSign;
    Button buttonPercent;

    Button buttonOne;
    Button buttonTwo;
    Button buttonThree;
    Button buttonFour;
    Button buttonFive;
    Button buttonSix;
    Button buttonSeven;
    Button buttonEight;
    Button buttonNine;
    Button buttonZero;

    Button buttonDivision;
    Button buttonMultiplication;
    Button buttonMinus;
    Button buttonPlus;

    Button buttonDecimalPlace;

    Button buttonEquals;

    Button buttonOpeningParenthesis;
    Button buttonClosedParenthesis;

    Button buttonMemoryClear;
    Button buttonMemoryPlus;
    Button buttonMemoryMinus;
    Button buttonMemoryRead;

    Button buttonBinary;

    Button buttonSquare;
    Button buttonCubic;
    Button buttonPower;
    Button buttonExponent;
    Button buttonPowerTen;

    Button buttonInverseValue;

    Button buttonSqrt;
    Button buttonCubeRoot;
    Button buttonRoot;

    Button buttonLn;
    Button buttonLg;

    Button buttonFactorial;

    Button buttonSin;
    Button buttonCos;
    Button buttonTan;

    Button buttonE;
    Button buttonPI;

    Button buttonEE;

    Button buttonRadian;

    Button buttonSinHyperbolic;
    Button buttonCosHyperbolic;
    Button buttonTanHyperbolik;

    Button buttonRandom;

    TextView resultTextView;
    TextView radianStatus;

    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Window w = getWindow();
//        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION); //Скрыываем нижнюю панель

        resultTextView = (TextView) findViewById(R.id.resultFieldTextView);
        radianStatus = (TextView) findViewById(R.id.radianStatus);

        buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonSign = (Button) findViewById(R.id.buttonSign);
        buttonPercent = (Button) findViewById(R.id.buttonPercent);

        buttonOne = (Button) findViewById(R.id.buttonOne);
        buttonTwo = (Button) findViewById(R.id.buttonTwo);
        buttonThree = (Button) findViewById(R.id.buttonThree);
        buttonFour = (Button) findViewById(R.id.buttonFour);
        buttonFive = (Button) findViewById(R.id.buttonFive);
        buttonSix = (Button) findViewById(R.id.buttonSix);
        buttonSeven = (Button) findViewById(R.id.buttonSeven);
        buttonEight = (Button) findViewById(R.id.buttonEight);
        buttonNine = (Button) findViewById(R.id.buttonNine);
        buttonZero = (Button) findViewById(R.id.buttonZero);

        buttonDivision = (Button) findViewById(R.id.buttonDivision);
        buttonMultiplication = (Button) findViewById(R.id.buttonMultiplication);
        buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonPlus = (Button) findViewById(R.id.buttonPlus);

        buttonDecimalPlace = (Button) findViewById(R.id.buttonDecimalPlace);

        buttonEquals = (Button) findViewById(R.id.buttonEquals);

        buttonOpeningParenthesis = (Button) findViewById(R.id.buttonOpeningParenthesis);
        buttonClosedParenthesis = (Button) findViewById(R.id.buttonClosingParenthesis);

        buttonMemoryClear = (Button) findViewById(R.id.buttonMemoryClear);
        buttonMemoryPlus = (Button) findViewById(R.id.buttonMemoryPlus);
        buttonMemoryMinus = (Button) findViewById(R.id.buttonMemoryMinus);
        buttonMemoryRead = (Button) findViewById(R.id.buttonMemoryRead);

        buttonBinary = (Button) findViewById(R.id.buttonBinarySystem);

        buttonSquare = (Button) findViewById(R.id.buttonSquare);
        buttonCubic = (Button) findViewById(R.id.buttonCubic);
        buttonPower = (Button) findViewById(R.id.buttonPower);
        buttonExponent = (Button) findViewById(R.id.buttonExponent);
        buttonPowerTen = (Button) findViewById(R.id.buttonPowerTen);

        buttonInverseValue = (Button) findViewById(R.id.buttonInverseValue);

        buttonSqrt = (Button) findViewById(R.id.buttonSqrt);
        buttonCubeRoot = (Button) findViewById(R.id.buttonCubeRoot);
        buttonRoot = (Button) findViewById(R.id.buttonRoot);

        buttonLn = (Button) findViewById(R.id.buttonLn);
        buttonLg = (Button) findViewById(R.id.buttonLg);

        buttonFactorial = (Button) findViewById(R.id.buttonFactorial);

        buttonSin = (Button) findViewById(R.id.buttonSinus);
        buttonCos = (Button) findViewById(R.id.buttonCosinus);
        buttonTan = (Button) findViewById(R.id.buttonTangent);

        buttonE = (Button) findViewById(R.id.buttonE);
        buttonPI = (Button) findViewById(R.id.buttonPi);

        buttonEE = (Button) findViewById(R.id.buttonEE);

        buttonRadian = (Button) findViewById(R.id.buttonRadian);

        buttonSinHyperbolic = (Button) findViewById(R.id.buttonSinHiperbolic);
        buttonCosHyperbolic = (Button) findViewById(R.id.buttonCosHiperbolic);
        buttonTanHyperbolik = (Button) findViewById(R.id.buttonTanHiperbolic);

        buttonRandom  =(Button) findViewById(R.id.buttonRandom);
    }


    @Override
    public void onClick(View view) {
        resultTextView.setText("7");
    }
}
