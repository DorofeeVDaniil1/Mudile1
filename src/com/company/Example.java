package com.company;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        System.out.println(n*(a*100+b)/100+" "+n*(a*100+b)%100);


    }

}