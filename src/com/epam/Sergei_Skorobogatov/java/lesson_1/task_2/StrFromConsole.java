package com.epam.Sergei_Skorobogatov.java.lesson_1.task_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StrFromConsole { //Скоробогатов Сергей, задание 2, вариант 2

    public static void main(String[] args) {

        StrFromConsole app = new StrFromConsole();
        app.startApplication();
    }

    public void startApplication() {

        int n = 0;

        //Ввод количества строк с клавиатуры
        while (true) {
            System.out.println("Введите количество строк");
            Scanner scan1 = new Scanner(System.in);
            try {
                n = scan1.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не число, повторите попытку.");
            }

        }
        String[] str = new String[n];
        Scanner scan2 = new Scanner(System.in);

        //Инициализация массива str строками
        for (int i = 0; i < str.length; i++) {
            System.out.println("Введите строку №" + (i + 1));
            str[i] = scan2.nextLine();
        }
        float average = 0;

        //Общая сумма длин строк
        for (String item : str) {
            average += (float) item.length();
        }
        //Среднее арифметическое суммы длин этих строк
        average /= str.length;

        System.out.println("Средняя длина строки = " + average + "");
        //Выводит все строки имеющие длину ниже средней)
        for (int i = 0; i < n; i++) {
            if (str[i].length() > average) {
                System.out.println("Строка большая, чем средняя длина: ");
                System.out.println(str[i] + ", ee длина = " + str[i].length());
            }
        }
    }
}