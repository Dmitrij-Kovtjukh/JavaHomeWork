package com.pb.kovtuh.hw7;

public class Pants extends Clothes implements ManClothes,WomenClothes{


   public Pants(String name) {
       super(name);
   }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одевает "+ name+" "+ size +" - " + size.getDescription()+", евро размер="+size.geteuroSize()+" стоимостью "+cost+" "+color+" цвета;");
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина одевает "+ name+" "+ size +" - " + size.getDescription()+", евро размер="+size.geteuroSize()+" стоимостью "+cost+" "+color+" цвета;");
    }
}
