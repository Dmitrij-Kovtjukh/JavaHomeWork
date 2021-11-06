package com.pb.kovtuh.hw6;

import java.util.Objects;

public class Dog extends Animal {
     private String food = "мясо";
     private String location = "будке";
     private String unique = " защищает";

    public void makeNoise(){
        System.out.println("Собака лает");
    }

    public void eat(){
        System.out.println("Собака ест "+food);
    }
    public void sleep(){
        System.out.println("Собака спит в "+location + unique);
    }


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

    @Override
    public String toString() {
        return "Dog{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", unique='" + unique + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(food, dog.food) && Objects.equals(location, dog.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(food, location);
    }

}
