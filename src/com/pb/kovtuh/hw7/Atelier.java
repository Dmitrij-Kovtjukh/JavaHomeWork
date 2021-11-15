package com.pb.kovtuh.hw7;

import java.util.Arrays;

import static com.pb.kovtuh.hw7.Size.*;

public class Atelier {
    public static void main(String[] args) {
        for (Size elsize: Size.values()){
        System.out.print(elsize+", ");
        }
        System.out.println();
        for (Size elsize: Size.values()){
            System.out.println(elsize +" - " + elsize.getDescription()+", евро размер="+elsize.geteuroSize());
        }


        Tie tie = new Tie("Галстук");
        tie.setSize(XS);
        tie.setCost(144);
        tie.setColor("коричневый");

        Skirt skirt = new Skirt("Юбка");
        skirt.setSize(XXS);
        skirt.setCost(350);
        skirt.setColor("красная");

        Tshirt tshirt = new Tshirt("Футболка");
        tshirt.setSize(L);
        tshirt.setCost(99);
        tshirt.setColor("синий");

        Pants pants = new Pants("штаны");
        pants.setSize(M);
        pants.setCost(220);
        pants.setColor("черный");

        tie.dressMan();
        skirt.dressWomen();

        System.out.println("________________________________");
        Clothes[] clothes = new Clothes[] {tie,skirt,tshirt,pants};
        for (Clothes n: clothes){
            if (n instanceof ManClothes){
               n.dressMan();
            }


        }
        System.out.println("********************************");
        for (Clothes n: clothes) {
            if (n instanceof WomenClothes) {
                n.dressWomen();
            }
        }

    //    public static void dressMan(Clothes[] clothes){
    //        for (Clothes n: clothes){
    //            if (n instanceof ManClothes) {
    //                n.dressMan();
    //            }
    //        }
        // public static void dressWomen(Clothes[] clothes){}

    }
      //  System.out.println(Arrays.toString(dressMan));

}
