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



    }
}
