package com.pb.kovtuh.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Введите 10 целых чисел:");
        // set user array
        for (int i=0; i<10;i++){
            Scanner in = new Scanner(System.in);
            array [i] = in.nextInt();
        }
        // out on screen array
        int sum = 0;
        int positive = 0;
        for (int i=0; i<10;i++) {
            System.out.print(array[i]+"; ");
            sum = sum+array[i];
            if (0<array[i]){
                positive=positive+array[i];
            }
        }
        System.out.println();
        System.out.println("Сумма всех чисел массива = "+sum);
        System.out.println("Сумма всех положительных чисел массива = "+positive);
        // bubble sort

        int x;
        for (int i=0; i< array.length;i++){
            for(int j= array.length-1; j> i; j--){
                if (array[j-1] > array[j]){
                    x=array[j-1];
                    array[j-1]=array[j];
                    array[j]=x;
                }
            }
            //System.out.println(Arrays.toString(array));
        }
        System.out.println("Отсортированный массив по методу Bubble");
        System.out.println(Arrays.toString(array));
    }

}
