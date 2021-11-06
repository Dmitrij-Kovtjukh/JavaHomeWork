package com.pb.kovtuh.hw6;

import static com.pb.kovtuh.hw6.Veterinarian.treatAnimal;

public class VetClinic {
    public static void main(String[] args) {


        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        animal.makeNoise();
        Dog dog =new Dog();
        dog.eat();
        dog.sleep();
        dog.makeNoise();
        Cat cat =new Cat();
        cat.eat();
        cat.sleep();
        cat.makeNoise();
        Horse horse =new Horse();
        horse.eat();
        horse.sleep();
        horse.makeNoise();


        Animal[] count = new Animal[] {dog, cat, horse };
        System.out.println("----------------------");
        for (Animal c: count) {
            treatAnimal(c);
            }
        }

        //public static void treatAnimal(Animal animal) {
        //System.out.println(animal);
    }

class Veterinarian {
    public static void treatAnimal(Animal animal) {
        System.out.println(animal);
    }
}