package com.zakiralekperov.calculator;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

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

    TextView resultTextView;
    TextView radianStatus;

    MainActivityEngine engine = new MainActivityEngine();;

    String result;
   private static final String SAVED_RESULT = "Main_Activity.SAVED_RESULT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Window w = getWindow();
//        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION); //Скрыываем нижнюю панель

        MainActivityLand mainActivityLand = new MainActivityLand();

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

        resultTextView.setText(MainActivityEngine.result);
    }

    @Override
    public void onClick(View view) {

        if(view == buttonClear){
            engine.onClickButtonClear();
            return;
        }
        if(view == buttonSign){
            engine.onClickButtonSign();
            return;
        }
        if(view == buttonPercent){
            engine.onClickButtonPercent();
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
}
