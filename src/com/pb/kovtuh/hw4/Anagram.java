package com.pb.kovtuh.hw4;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

    static String function(String s){
        String str = s.toUpperCase();
        str = str.replaceAll("[^A-ZА-Я]","");
        char[] s1Array = str.toCharArray();
        Arrays.sort(s1Array);
        String sortedS1 = new String(s1Array);
        return  sortedS1;
        //System.out.println(sortedS1);
    }

    public static void main(String[] args) {
        System.out.println("Введите первую строку :");
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        System.out.println("Введите вторую строку :");
        String s2 = in.nextLine();

       // s1 = s1.toUpperCase();
       // s1 = s1.replaceAll("[^A-ZА-Я]","");
        //char[] s1Array = s1.toCharArray();
        //Arrays.sort(s1Array);
        //String sortedS1 = new String(s1Array);
        //System.out.println(function(s1));

        //System.out.println(function(s2));
        if (function(s1).equals(function(s2))){
            System.out.println("Анограмма");
        }
        else {
            System.out.println("Не являеться Анограммой");
        }

    }
}
