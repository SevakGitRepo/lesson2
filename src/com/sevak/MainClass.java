package com.sevak;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        //Create an array and fill it with 2 number.
        int []array1 = {2};
        System.out.println("Create an array and fill it with 2 number. \n"+ Arrays.toString(array1));
        System.out.println("****************************");
        //Create an array and fill it with numbers from 1:1000.
        int []array2=new int[1000];
        for (int i = 0; i < array2.length; i++) {
            array2[i]=i+1;
        }
        System.out.println("Create an array and fill it with numbers from 1:1000.");
        System.out.println(Arrays.toString(array2));
        System.out.println("****************************");
        //Create an array and fill it with odd numbers from -20:20
        int [] array3 = new int[20];
        int odd = -19;
        for (int i = 0; i <array3.length; i++) {
            array3[i] = odd;
            odd +=2;
        }
        System.out.println("Create an array and fill it with odd numbers from -20:20");
        System.out.println(Arrays.toString(array3));
        System.out.println("****************************");

        //Create an array and fill it. Print all elements which can be divided by 5.
        System.out.println("Create an array and fill it. Print all elements which can be divided by 5.");
        int[]array4 = new int[100];
        Random ran = new Random();
        for (int i = 0; i < array4.length; i++) {
            array4[i]= ran.nextInt(100);
            if(array4[i]%5==0)
                System.out.print(array4[i]+" ");
        }
        System.out.println("\n****************************");
        //Create an array and fill it. Print all elements which are between 24.12 and 467.23.
        double[]array5 = new double[100];
        System.out.println("Create an array and fill it. Print all elements which are between 24.12 and 467.23.");
        for (int i = 0; i < array5.length; i++) {
            array5[i]= ran.nextDouble()*1000;
              if(array5[i]>=24.12&&array5[i]<=467.23)
                System.out.print(array5[i]+" ");
        }
        System.out.println("\n****************************");
        //Create an array and fill it. Print count of elements which can be divided by 2.
        int[]array6 = new int[100];
        int count = 0;
        for (int i = 0; i < array6.length; i++) {
            array6[i]= ran.nextInt(100);
            if(array6[i]%2==0)
                count++;
        }
        System.out.println("Create an array and fill it. Print count of elements which can be divided by 2.");
        System.out.println("Count = "+count);
        System.out.println("****************************");

        /*Given an integer, 0< N < 21 , print its first 10 multiples.
          Each multiple  N x i (where 0<i<11) should be printed on a
          new line in the form: N x i = result.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number between 1-20");
        try {
            int number = scanner.nextInt();
            if(number <= 0 || number >= 21) {System.out.println("Number is incorrect");}
            else {
                for (int i = 0; i < 11; i++) {
                    System.out.printf("%d x %d = " + number * i + "\n", number, i);
                }
            }
        }catch ( InputMismatchException e){
            System.out.println("Number is incorrect");
        }

    }
}
