package com.pb.kovtuh.hw10;

import com.pb.kovtuh.hw10.NumBox;

import java.lang.reflect.Array;

class Main{
    public static void main(String[] args) {

        //  NumBox<Float>

        //  NumBox<Integer>
        Integer[] intArray = {1, 2, 3, 4, 5};
        NumBox<Integer> iout = new NumBox<>(intArray);
        System.out.println("Среднее значения для Integer " + iout.average());
    }
}
