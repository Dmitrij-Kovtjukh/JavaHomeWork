package com.pb.kovtuh.hw7;

public class Tie extends Clothes implements ManClothes{


    public Tie(String name) {
        super(name);
    }


    @Override
    public void dressMan() {
        System.out.println("Мужчина одевает "+ name+" "+ size +" - " + size.getDescription()+", евро размер="+size.geteuroSize()+" стоимостью "+cost+" "+color+" цвета;");
    }
}
