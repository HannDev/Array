
//Looping Array dengan For Each

package com.belajar;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayAngka = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        // LOOOING STANDARD
        System.out.println("loopingStandard");
        for (int i = 0; i < 15; i++) {
            System.out.println("indeks ke " + i + "adalah " + arrayAngka[i]);
        }


        //LOPING DENGA POPERTI ARRAY
        System.out.println("looping dengan properti length");
        for (int i = 0; i < arrayAngka.length; i++) {
            System.out.println("indeks ke " + i + "adalah " + arrayAngka[i]);
        }


        //LOOPING KHUSUS COLECTIONS (ARRAY)
        System.out.println("looping for each");
            for (int angka : arrayAngka)
                System.out.println("angka pada looping ini adalah :" + angka);
        }
    }
