package com.pb.kovtuh.hw6;

public class Cat extends Animal {
    private String food = "рыбу";
    private String location = "доме";
    private String unique = ", расслабляет";

    public void makeNoise(){
        System.out.println("Кошка мяукает");
    }

    public void eat(){
        System.out.println("Кошка ест "+food);
    }
    public void sleep(){
        System.out.println("Кошка спит в "+location + unique);
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
    public String toString() {
        return "Cat{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", unique='" + unique + '\'' +
                '}';
    }
}
