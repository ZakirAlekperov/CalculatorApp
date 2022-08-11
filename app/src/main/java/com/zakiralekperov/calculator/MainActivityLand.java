package com.zakiralekperov.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MainActivityLand extends AppCompatActivity implements View.OnClickListener {

    private static final String SAVED_RESULT = "Main_Activity.SAVED_RESULT";

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
    Button buttonTanHyperbolic;

    Button buttonRandom;

    TextView resultTextView;
    TextView radianStatus;

    MainActivityEngine engine;

    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Window w = getWindow();
//        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION); //Скрыываем нижнюю панель

        MainActivity mainActivity = new MainActivity();

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

        buttonSinHyperbolic = (Button) findViewById(R.id.buttonSinHyperbolic);
        buttonCosHyperbolic = (Button) findViewById(R.id.buttonCosHiperbolic);
        buttonTanHyperbolic = (Button) findViewById(R.id.buttonTanHiperbolic);

        buttonRandom  =(Button) findViewById(R.id.buttonRandom);

        if(savedInstanceState != null){
            result = savedInstanceState.getString(SAVED_RESULT);
        }
    }

    @Override
    public void onClick(View view) {

        if(view == buttonClear){
           onClickButtonClear();
           return;
        }
        if(view == buttonSign){
            onClickButtonSign();
            return;
        }
        if(view == buttonPercent){
            result= engine.onClickButtonPercent(resultTextView.getText().toString());
            resultTextView.setText(result);
            return;
        }
        if(view == buttonOne){
            updateResultField(buttonOne.getText().toString());
            return;
        }
        if(view == buttonTwo){
            updateResultField(buttonTwo.getText().toString());
            return;
        }
        if(view == buttonThree){
            updateResultField(buttonThree.getText().toString());
            return;
        }
        if(view == buttonFour){
            updateResultField(buttonFour.getText().toString());
            return;
        }
        if(view == buttonFive){
            updateResultField(buttonFive.getText().toString());
            return;
        }
        if(view == buttonSix){
            updateResultField(buttonSix.getText().toString());
            return;
        }
        if(view == buttonSeven){
            updateResultField(buttonSeven.getText().toString());
            return;
        }
        if(view == buttonEight){
            updateResultField(buttonEight.getText().toString());
            return;
        }
        if(view == buttonNine){
            updateResultField(buttonNine.getText().toString());
            return;
        }
        if(view == buttonZero){
            updateResultField(buttonZero.getText().toString());
            return;
        }
        if(view == buttonDivision){
            engine.onClickButtonDivision();
            return;
        }
        if(view == buttonMultiplication){
            engine.onClickButtonMultiplication();
            return;
        }
        if(view == buttonMinus){
            engine.onCLickButtonMinus();
            return;
        }
        if(view == buttonPlus){
            engine.onClickButtonPlus();
            return;
        }
        if(view == buttonDecimalPlace){
            updateResultField(buttonDecimalPlace.getText().toString());
            return;
        }
        if(view == buttonEquals){
            engine.onClickButtonEquals();
            return;
        }
        if(view == buttonOpeningParenthesis){
            updateResultField(buttonOpeningParenthesis.getText().toString());
            return;
        }
        if(view == buttonClosedParenthesis){
            updateResultField(buttonClosedParenthesis.getText().toString());
        }
        if(view == buttonMemoryClear){
            engine.onClickButtonMemoryClear();
            return;
        }
        if(view == buttonMemoryPlus){
            engine.onClickButtonMemoryPlus();
            return;
        }
        if(view == buttonMemoryMinus){
            engine.onClickButtonMemoryMinus();
            return;
        }
        if(view == buttonMemoryRead){
            engine.onClickButtonMemoryRead();
            return;
        }
        if(view == buttonBinary){
            engine.onClickButtonBinary();
            return;
        }
        if(view == buttonSquare){
            engine.onClickButtonSquare();
            return;
        }
        if(view == buttonCubic){
            engine.onClickButtonCubic();
            return;
        }
        if(view == buttonPower){
            engine.onClickButtonPower();
            return;
        }
        if(view == buttonExponent){
            engine.onClickButtonExponent();
            return;
        }
        if(view == buttonPowerTen){
            engine.onClickButtonPowerTen();
            return;
        }
        if(view == buttonInverseValue){
            engine.onClickButtonInverseValue();
            return;
        }
        if(view == buttonSqrt){
            engine.onClickButtonSqrt();
            return;
        }
        if(view == buttonCubeRoot){
            engine.onClickButtonCubeRoot();
            return;
        }
        if(view == buttonRoot){
            engine.onClickButtonRoot();
            return;
        }
        if(view == buttonLn){
            engine.onClickButtonLn();
            return;
        }
        if(view == buttonLg){
            engine.onClickButtonLg();
            return;
        }
        if(view == buttonFactorial){
            engine.onClickButtonFactorial();
            return;
        }
        if(view == buttonSin){
            engine.onClickButtonSin();
            return;
        }
        if(view == buttonCos){
            engine.onClickButtonCos();
        }
        if(view == buttonTan){
            engine.onClickButtonTan();
            return;
        }
        if(view == buttonE){
            engine.onClickButtonE();
            return;
        }
        if(view == buttonPI){
            engine.onClickButtonPI();
            return;
        }
        if(view == buttonEE){
            engine.onClickButtonEE();
            return;
        }
        if(view == buttonRadian){
            engine.onClickButtonRadian();
            return;
        }
        if (view == buttonSinHyperbolic){
           engine.onClickButtonSinHyperbolic();
        }
        if(view == buttonCosHyperbolic){
            engine.onClickButtonCosHyperbolic();
            return;
        }
        if(view == buttonTanHyperbolic){
            engine.onClickButtonTanHyperbolic();
            return;
        }
        engine.onClickButtonRandom();
    }
    private void updateResultField(String value){
        result = resultTextView.getText().toString() + value;
        resultTextView.setText(result);
    }

    @Override
    protected void onDestroy() {
        MainActivityEngine.result = resultTextView.getText().toString();
        super.onDestroy();
    }

    //Очищает поле результата
    private void onClickButtonClear(){
        result ="";
        resultTextView.setText(result);
    }
    //Меняет знак числа
    private void onClickButtonSign() {
        result = resultTextView.getText().toString();

        if(!result.startsWith("-")){
            result = "-"+result;
            resultTextView.setText(result);
            return;
        }
        result = result.replace("-", "");
        resultTextView.setText(result);
        return;
    }
}
