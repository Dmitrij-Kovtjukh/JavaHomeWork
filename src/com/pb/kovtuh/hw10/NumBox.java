package com.pb.kovtuh.hw10;

public class NumBox <T extends Number> {
    private T[] number;

    public NumBox(Integer[] size){
        this.number =(T[]) new Number[size];
    }

    public T get(int index) {
        return number[index];
    }

    public void set(int index, T number) {
        this.number[index] = number;
    }

    // void add(T num) - добавляющий число в массив. В случае если массив полон - выбросить исключение.

    //  T get(int index) -  возвращающий число по индексу

    //  int length() - количесто заполненых елементов

    //  double average() - подсчет среднего арифметического среди элементов массива
    public double average() {
        double sum = 0.0;

        for (T value : number) {
            sum += value.doubleValue();
        }

        return sum / number.length;
    }

    //

}
