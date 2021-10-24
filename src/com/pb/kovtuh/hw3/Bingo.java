package com.pb.kovtuh.hw3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        int minr=0;
        int maxr=100;
        // enter random number
        int x=minr+(int)(Math.random()*((maxr-minr)+1));
        //int x =11 ;
        System.out.println("Отгадайте загаданное целое число от 0 до 100");
        System.out.println("Надоело отгадывать, введите число вне диапазона от 0 до 100"+ x);
        System.out.println("Введите число:");
        // read user number
        int number;
        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        for (int c=1;;c++) {
            if (0 <= number && number <= 100 && number > x) {
                System.out.println("Ваше число Больше загаданного числа");
                number = in.nextInt();
                } else if (0 <= number && number <= 100 && number < x){
                    System.out.println("Ваше число Меньше загаданного числа");
                    number = in.nextInt();
                } else if (0 <= number && number <= 100 && number == x) {
                System.out.println("Поздравляем! Вы угадали число "+x+" c "+c+" попытки.");
                break;
            } else {
                System.out.println("Вы сдались");
                break;
            }
        }
        System.out.println("Конец игры");
    }
}
