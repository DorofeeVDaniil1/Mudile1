package com.company.Modele1;

import java.time.LocalTime;
import java.util.Scanner;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n,h,m,s;
        n = in.nextLong();
        h = (n %(3600*24)) /3600;
        m = (n % 3600) / 60;
        s = (n % 60);
        if (m<10){
            if (s<10){
                System.out.println(h+ ":0" +m+ ":0"+s);
            }
            else {
                System.out.println(h+ ":0" +m+ ":"+s);
            }

        }
        else {
            if (s<10){
                System.out.println(h+ ":" +m+ ":0"+s);
            }
            else {
                System.out.println(h+ ":" +m+ ":"+s);
            }

        }
    }
}
