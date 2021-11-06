package com.pb.kovtuh.hw6;

import java.util.Objects;

public class Horse extends Animal {
    private String food = "просо";
    private String location = "поле";
    private String unique = " галопирует";

    public void makeNoise(){
        System.out.println("Конь иржет");
    }

    public void eat(){
        System.out.println("Конь ест "+food);
    }
    public void sleep(){
        System.out.println("Конь спит в "+location + unique);
    }

    @Override
    public String getFood() {
        return food;
    }

    @Override
    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    public String getUnique() {
        return unique;
    }

    public void setUnique(String unique) {
        this.unique = unique;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(food, horse.food) && Objects.equals(location, horse.location) && Objects.equals(unique, horse.unique);
    }

    @Override
    public int hashCode() {
        return Objects.hash(food, location, unique);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", unique='" + unique + '\'' +
                '}';
    }
}
