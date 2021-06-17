package com.company.Trees;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();
//        int c= in.nextInt();
//        int d= in.nextInt();

        //Тернарная операция
        int max = (a > b ? a : b);//Поиск максимума двух чисел ( условие ? значение, если истинно : значение, если ложно)
        System.out.println(max);
        System.out.println(a>0 ? a*a*a : "Некорректное значение стороны");

        //Конструкция switch / case

        int num = 8;
        switch(num){
            case 1:
                System.out.println("число равно 1");
                break;
            case 8:
                System.out.println("число равно 8");
                num++;
                break;
            case 9:
                System.out.println("число равно 9");
                break;
            default:
                System.out.println("число не равно 1, 8, 9");
        }




    }
}
