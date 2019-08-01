package com.epam.Sergei_Skorobogatov.java.lesson_1.task_3;

import java.util.Scanner;

public class Calculator {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Calculator app = new Calculator();
        app.startApplication();
    }

    public void startApplication() {

        int num1 = getInt();
        int num2 = getInt();
        char oper = getOperation();
        int result = calc(num1,num2,oper);
        System.out.println("Результат операции: "+result);
    }

    public static int getInt(){
        System.out.println("Введите число:");
        int num;
        if(scan.hasNextInt()){
            num = scan.nextInt();
        } else {
            System.out.println("Ошибка при вводе числа. Повторите попытку");
            scan.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scan.hasNext()){
            operation = scan.next().charAt(0);
        } else {
            System.out.println("Ошибку при вводе операции. Повторите попытку.");
            scan.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Повторите ввод операции");
                result = calc(num1, num2, getOperation());//рекурсия
        }
        return result;
    }
}
