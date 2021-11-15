package com.pb.kovtuh.hw7;

public class Skirt extends Clothes implements WomenClothes{
     public Skirt(String name) {
             super(name);
     }

    @Override
    public void dressWomen() {
        System.out.println("Женщина одевает "+ name+" "+ size +" - " + size.getDescription()+", евро размер="+size.geteuroSize()+" стоимостью "+cost+" "+color+" цвета;");
    }
}
