package com.pb.kovtuh.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class CapitalLetter {
    static void capital (String str1) {
        char [] s1Array =str1.toCharArray();
        s1Array[0] = Character.toUpperCase(s1Array[0]);
        for (int i = 0; i < (s1Array.length - 1); i++){
            if (s1Array[i] == ' '){
                s1Array[i+1] = Character.toUpperCase(s1Array[i+1]);
            }
        }
        System.out.println(s1Array);
    }

    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
       // System.out.println(s1);

        //char [] s1Array =s1.toCharArray();
        //s1Array[0] = Character.toUpperCase(s1Array[0]);
        //for (int i = 0; i < (s1Array.length - 1); i++){
        //    if (s1Array[i] == ' '){
        //        s1Array[i+1] = Character.toUpperCase(s1Array[i+1]);
        //    }
        //}
        //System.out.println(s1Array);

        capital(s1);
    }
}
