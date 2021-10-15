package com.pb.kovtuh.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1, operand2;
        long answer;
        double answer1;
        String sign; // + - * /

        Scanner in = new Scanner(System.in);

        System.out.println("Введите целочисленый аргумент 1 в диапазоне от -2147483648 до +2147483647");
        operand1 = in.nextInt();
        System.out.println("Введите целочисленый аргумент 2 в диапазоне от -2147483648 до +2147483647");
        operand2 = in.nextInt();
        System.out.println("Введите арефметический знак +,-,*,/ ");
        sign = in.next();

        System.out.println("a = " + operand1 + ", b = " + operand2 + " operant = " + sign);
        // if (sign.equals("+")) { // for +
        switch (sign) {
            case "+": // for +
                answer = operand1+operand2;
                System.out.println(operand1 +  sign +  operand2 +" = " + answer);
                break;
            case "-": // for -
                answer = operand1-operand2;
                System.out.println(operand1 +  sign +  operand2 +" = " + answer);
                break;
            case "*": // for *
                answer = operand1*operand2;
                System.out.println(operand1 +  sign +  operand2 +" = " + answer);
                break;
            case "/": // for *
                if (operand2 == 0) {
                    System.out.println("Деление на ноль");
                } else {
                    double operand1d = operand1;
                    answer1 = operand1d/operand2;
                    System.out.println(operand1 + sign + operand2 + " = " + answer1);
                    break;
                }
        }
        // else {
        //    answer = operand1-operand2;
        //    System.out.println("answer = " + answer); // " = " Integer.parseInt(operand1) + Integer.parseInt(operand2));
    }
}