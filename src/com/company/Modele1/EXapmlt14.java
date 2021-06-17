package com.company.Modele1;

import java.util.Scanner;

public class EXapmlt14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        //a = (a >> b) << b;


        //Операция xor
//
//        a=a^b;
//        System.out.println(a+" "+b);
//        b=a^b;
//        System.out.println(a+" "+b);
//        a=a^b;
//        System.out.println(a+" "+b);

        //<< Сдвиг в лево умножение на  2 в степени b - 2**b
        a<<=b;
        System.out.println("Сдвиг в лево << "+a+" "+b);

        //Сдвиг в право >> деление на 2**b
        a>>=b;
        System.out.println("Сдвиг в право << "+a+" "+b);

        //Фрагмент программы на Java с примерами быстрого умножения и деления на 2 с помощью операций поразрядного сдвига:

        int i = 192;  //  00000000 00000000 00000000 11000000 (192)
        i <<= 1;      //  00000000 00000000 00000001 10000000 (384)
        i >>= 2;      //  00000000 00000000 00000000 01100000 (96)
        int j =- 192; //  11111111 11111111 11111111 01000000 (-192)
        j <<= 1;      //  11111111 11111111 11111110 10000000 (-384)
        j >>= 2;      //  11111111 11111111 11111111 10100000 (-96)








       // System.out.print(a);
    }


}
