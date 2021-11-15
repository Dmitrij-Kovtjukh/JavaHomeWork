package com.pb.kovtuh.hw7;

public abstract class Clothes {

    protected Size size;
    protected int cost;
    protected String color;
    protected final String name;

    public Clothes(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void dressMan() {
        System.out.println("Мужчина одевает "+ name+" "+ size +" - " + size.getDescription()+", евро размер="+size.geteuroSize()+" стоимостью "+cost+" "+color+" цвета;");
   }

    public void dressWomen() {
        System.out.println( "Женщина одевает "+name+" "+ size +" - " + size.getDescription()+", евро размер="+size.geteuroSize()+" стоимостью "+cost+" "+color+" цвета;");
    }
}
