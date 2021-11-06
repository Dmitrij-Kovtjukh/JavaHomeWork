package com.pb.kovtuh.hw6;

public class Animal {

    public String  food;
    public String location;


    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void eat(){
        System.out.println("Животное ест");
    }
    public void sleep(){
        System.out.println("Животное спит");
    }
    public void makeNoise(){
        System.out.println("Животное шумит");
    }
}
