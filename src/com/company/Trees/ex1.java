package com.company.Trees;

import java.util.Scanner;

public class ex1 {
    //Отрезок от 3 до 8

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
//        if (x>=3.0 && x<=8.0){
//            System.out.println("true");
//
//        }
//        else{
//            System.out.println("false");
//        }


//        System.out.println(x>=3.0 && x<=8.0?"true":"false");
        //-3 5 , 9 15
        System.out.println(!(x>=-3.0 && x<=5.0)||!(x>=9.0 && x<=15.0)?"true":"false");


    }
}
