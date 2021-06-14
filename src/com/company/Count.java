package com.company;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        int a = in.nextInt(), b = in.nextInt();//Обьединение обьявления с вводом
        int c = a + b;
        System.out.println(c);
        System.out.println("Сумма: " + (a + b));//Можно вывсети таким образом

    }

    public static class Test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
//            int x = 1000 * 1000;
//            System.out.println(x * x);
            int z = in.nextInt(), y = in.nextInt();
            System.out.println("Деление: " + z / y + " Обратно деление: " + y / z
                    + "Деление с остатком: " + z % y + " " + y % z + " Умнлжение: " + z * y);


        }
    }
    public static class IncrDcr{
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int x= in.nextInt();
            System.out.println(x);
            x++;
            System.out.println(x);
            x+=12;
            System.out.println(x);
            x-=15;
            System.out.println(x);
            x--;
            System.out.println(x+"-");
            x/=2;
            System.out.println(x+"/");
            x*=50;
            System.out.println(x+"*");
            x%=20;
            System.out.println(x+"%");

        }


    }

}

