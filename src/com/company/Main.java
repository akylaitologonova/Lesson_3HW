package com.company;

import java.util.Arrays;

public class Main {

    public static void main (String[] args) {

        String[] names = new String[3];
        names[0] = "Adil";
        names[1] = "Eliza";
        names[2] = "Edil";
        System.err.println (Arrays.toString(names));

        String[] names3 = new String[names.length+1];
        String name4="Adil, Eliza, Edil!";
        int in=0;
        for (String n:names) {
            names3[in]=n; in++;
        }
        names3[in] = name4;
        System.out.println(Arrays.toString(names3));
        names = names3;


        for (int i = 0; i < names.length; i++) {
            switch (i) {
                case 0 -> System.err.println(names[0] + " Good Morning!");
                case 1 -> System.err.println(names[1] + " Good Afternoon!");
                case 2 -> System.err.println(names[2] + " Good Evening!");
                case 3 -> System.err.println(names[3] + " Hi!");
            }

        }


    }

}