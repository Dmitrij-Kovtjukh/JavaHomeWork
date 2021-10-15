package com.pb.kovtuh.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число в диапазоне от -2147483648 до +2147483647");
        number = in.nextInt();

        if (0 <= number && number <= 14) { // [0 - 14]
            System.out.println("Ваше число в диапазоне [0-14]");
        }
        else if (15 <= number && number <= 35) { // [15 - 35]
            System.out.println("Ваше число в диапазоне [15-35]");
        }
        else if (36 <= number && number <= 50) { // [36 - 50]
            System.out.println("Ваше число в диапазоне [36-50]");
        }
        else if (50 <= number && number <= 100) { // [50 - 100]
            System.out.println("Ваше число в диапазоне [50-100]");
        }
        else {
            System.out.println("Введенное число не попадает ни в один из имеющихся промежутков");
        }
    }
}