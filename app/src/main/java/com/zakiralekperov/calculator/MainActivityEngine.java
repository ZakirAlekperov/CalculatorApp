package com.zakiralekperov.calculator;

public class MainActivityEngine {

    static String result;
    //Вычислить процент от числа
    public String onClickButtonPercent(String value){
        double value_double =  convert(value);
        value_double = value_double / 100;
        return  String.valueOf(value_double);
    }
    //Деление
    public void onClickButtonDivision(){

    }
    //Умножение
    public void onClickButtonMultiplication(){

    }
    //
    public void onCLickButtonMinus(){}
    //
    public void onClickButtonPlus(){}
    //
    public void onClickButtonEquals(){}
    //
    public void onClickButtonMemoryClear(){}
    //
    public void onClickButtonMemoryPlus(){}
    //
    public void onClickButtonMemoryMinus(){}
    //
    public void onClickButtonMemoryRead(){}
    //
    public void onClickButtonBinary(){

    }
    //
    public void onClickButtonSquare(){}
    //
    public void onClickButtonCubic(){

    }
    //
    public void onClickButtonPower(){}
    //
    public void onClickButtonExponent(){}
    //
    public void onClickButtonPowerTen(){}
    //
    public void onClickButtonInverseValue(){}
    //
    public void onClickButtonSqrt(){}
    //
    public void onClickButtonCubeRoot(){}
    //
    public void onClickButtonRoot(){}
    //
    public void onClickButtonLn(){}
    //
    public void onClickButtonLg(){}
    //
    public void onClickButtonFactorial(){}
    //
    public void onClickButtonSin(){}
    //
    public void onClickButtonCos(){}
    //
    public void onClickButtonTan(){}
    //
    public void onClickButtonE(){}
    //
    public void onClickButtonPI(){}
    //
    public void onClickButtonEE(){}
    //
    public void onClickButtonRadian(){}
    //
    public void onClickButtonSinHyperbolic(){}
    //
    public void onClickButtonCosHyperbolic(){}
    //
    public void onClickButtonTanHyperbolic(){}
    //
    public void onClickButtonRandom(){}

    private double convert(String str){
        return Double.parseDouble(str);
    }








}
