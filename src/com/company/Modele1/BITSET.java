package com.company.Modele1;

import java.util.BitSet;
import java.util.Scanner;

public class BITSET {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input value: ");
        long value = scan.nextLong();
        System.out.print("Input bit number: ");
        int pos = scan.nextInt();

        BitSet bs = BitSet.valueOf(new long[]{value});
        bs.set(pos);
        System.out.println(bs.toLongArray()[0]);
    }


}

