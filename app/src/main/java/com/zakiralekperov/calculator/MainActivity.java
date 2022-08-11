package com.zakiralekperov.calculator;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

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

    Engine engine = new Engine();;

    String result;
    String currentValue;
    Double resultD;
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

        resultTextView.setText(Engine.resultStr);
       // if(savedInstanceState != null){
         //       result = savedInstanceState.getString(SAVED_RESULT);
        //}
    }

    @Override
    public void onClick(View view) {
        if(view == buttonDivision){
            onClickButtonDivision();
            resultTextView.setText(result);
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
            return;
        }
        if(view == buttonEquals){
            engine.onClickButtonEquals();
            return;
        }
        engine.onClickButtonRandom();
    }



    @Override
    protected void onDestroy() {
        Engine.resultStr = resultTextView.getText().toString();
        super.onDestroy();
    }



    //Деление
    private void onClickButtonDivision(){
        result = resultTextView.getText().toString();
        buttonDivision.setBackgroundColor(Color.WHITE);
        buttonDivision.setTextColor(getResources().getColor(R.color.actionButtonColor));
    }



    private void onClickButtonEquals(){
        currentValue = resultTextView.getText().toString();

    }
    //Конвертирует значение на экране в число, возращает 0, если экран пуст
    private double getValue(){
        String str = resultTextView.getText().toString();
        if (str.equals("")){
            return 0;
        }
        if(str.contains(".") || str.contains(",")){
            return Double.parseDouble(str);
        }
        return Integer.parseInt(str);
    }
    //Выодит целое или дробное число на экран корректно
    private void updateTextField(double value){
        if(value == (int)value){
            resultTextView.setText(String.valueOf(((int) value)));
            return;
        }
        resultTextView.setText(String.valueOf(value));
    }
    //Очищает поле результата
    public void onClickButtonClear(View view){
        result ="";
        resultTextView.setText(result);
    }
    //Меняет знак числа
    public void onClickButtonSign(View view) {
        resultD = -getValue();
        updateTextField(resultD);
    }
    //Получает значение, конвертирует, вычисляет процент, выводит на экран
    public void onPercentButtonClick(View view){
        updateTextField(engine.getPercent(Math.abs(getValue())));
    }
    //Дописывает цифру с кнопки
    public void onClickNumberButton(View view){
        String value = resultTextView.getText().toString();
        Button button = (Button) view;
        if (value.equals("0")){
            resultTextView.setText(button.getText());
            return;
        }
        value += button.getText();
        resultTextView.setText(value);
    }
    //обработка ввода точки
    public void onClickDecimalPriceButton(View view){
        String value = resultTextView.getText().toString();
        if(value.equals("")){
            value="0.";
            resultTextView.setText(value);
            return;
        }
        if (!value.contains(".")){
            value +=".";
            resultTextView.setText(value);
        }
    }
    public void onClickZeroButton(View view){
        String value=resultTextView.getText().toString();
        if (value.equals("") || value.equals("0")){
            resultTextView.setText("0");
            return;
        }
        onClickNumberButton(buttonZero);
    }
}
