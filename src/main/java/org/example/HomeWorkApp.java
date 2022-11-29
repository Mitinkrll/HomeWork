package org.example;

public class HomeWorkApp {
    public static void main(String[] args) {
        checkSumSign();
        printLine();
        positiveIntCheck();
        leapYearCheck();

    }

    public static void checkSumSign() {
        int a = 4;
        int b = 6;
        if (Integer.sum(a, b) > 0){
            System.out.println("Сумма положительная");
        }else
        System.out.println("Сумма положительная");

    }
    public static void printLine(){
        byte lineNumber = 10;
        String text = "Строка выведенна ";
        for (int i = 0; i <= lineNumber; i++) {
            System.out.println(text + i + " раз");
        }

    }
    public static void positiveIntCheck(){
       byte value = 0;
       boolean checkValue = false;
       if (value > 0){
            checkValue = true;
           System.out.println(checkValue);
       }System.out.println(checkValue);
    }
    public static void leapYearCheck() {
        short year = 2022;
        boolean leap;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            leap = true;
        } else {
            leap = false;
        }
        System.out.println(year + " Высокостный? = " + leap);
    }
}


