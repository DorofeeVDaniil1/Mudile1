package com.company.Trees;

import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        if (a==-b){
            System.out.println(true);
        }
        else if (a==-c){
            System.out.println(true);
        }
        else if (a==-d){
            System.out.println(true);
        }
        else if (b==-c){
            System.out.println(true);
        }
        else if (b==-d){
            System.out.println(true);
        }
        else if (c==-d){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }


    }

}
