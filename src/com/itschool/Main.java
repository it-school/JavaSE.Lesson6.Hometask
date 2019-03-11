package com.itschool;

import java.util.Arrays;
import java.util.Random;

// Реализовать методы для обмена валют
public class Main {

    public static void main(String[] args) {
        task1();
    }

    private static void task1()
    {
        System.out.println(new Exchanger().Hrn2USD(2000));
        System.out.println(new Exchanger().Hrn2USD(2000, 26.15));
        System.out.println(new Exchanger(26.1).Hrn2USD(2000));
        System.out.println(new Exchanger(26.1).Hrn2USD(2000, 26.2));

        Exchanger exchanger = new Exchanger();
        exchanger.setRate(26.4);
        System.out.println(exchanger.USD2Hrn(100));

        int [] arr = new int[10];
        arrayInput(arr);
        arrayOutput(arr);
        System.out.println(arr);
    }

    static void arrayInput(int [] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i] = new Random().nextInt()% 100;
        }
    }

    static void arrayOutput(int [] array)
    {
        System.out.println("\n----------------------------\n");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + ", ");
        }
    }

    static void arrSort(int [] array)
    {
        // Sorting
    }

}
