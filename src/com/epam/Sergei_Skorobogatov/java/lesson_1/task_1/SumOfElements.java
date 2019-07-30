package com.epam.Sergei_Skorobogatov.java.lesson_1.task_1;

public class SumOfElements{ //Скоробогатов Сергей, Задание 1, вариант 2

    public static void main(String args[]) {

        SumOfElements app = new SumOfElements();
        app.startApplication();
    }
    public void startApplication(){
        int summa = 0;

        //Создание массива от -10 до 10
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=i-10;
            System.out.println(numbers[i]);
        }
        System.out.println();

        //Сумма всех значений, стоящих на четных позициях
        for (int i = 0; i < numbers.length; i = i + 2){
            summa = summa + numbers[i];
        }
        System.out.println("Сумма четных позиций:" + summa);
    }
}
