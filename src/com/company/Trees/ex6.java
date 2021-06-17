package com.company.Trees;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(),b= in.nextInt(),c= in.nextInt();
        int count=0;
        if(a%2==0){
            count++;

        }
         if(b%2==0){
            count++;
        }
        if (c%2==0){
            count++;
        }



        if (count>=2){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }



    }
}