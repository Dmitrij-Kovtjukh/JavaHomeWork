package com.pb.kovtuh.hw5;


public class Library {


    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        book1.setNamebook("Приключения");
        book2.setNamebook("Словарь");
        book3.setNamebook("Энцикопедия");
        book1.setAuthorbook("Иванов И.И.");
        book2.setAuthorbook("Сидоров А.В.");
        book3.setAuthorbook("Гусев К.В.");
        book1.setYearout("2000");
        book2.setYearout("1980");
        book3.setYearout("2010");

        Reader reader1 = new Reader();
        Reader reader2 = new Reader();
        Reader reader3 = new Reader();

        reader1.setFio("Петров И.И.");
        reader2.setFio("Сидоров А.Н.");
        reader3.setFio("Пирожков А.Г.");
        reader1.setIdticket("254");
        reader2.setIdticket("2");
        reader3.setIdticket("64");
        reader1.setFaculty("Исторический");
        reader2.setFaculty("Технический");
        reader3.setFaculty("Филологический");
        reader1.setBday("12.03.1975");
        reader2.setBday("28.10.2021");
        reader3.setBday("25.01.1982");
        reader1.setPhone("+380442512236");
        reader2.setPhone("+746512351658");
        reader3.setPhone("+380675314478");

        //System.out.println(" книг : "+ book1.getNamebook() +"  " +book3.getNamebook());
        System.out.println("Вывод всех книг:");
        System.out.println(book1.allbook());
        System.out.println(book2.allbook());
        System.out.println(book3.allbook());
        System.out.println("Вывод всех читателей:");
        System.out.println(reader1.getFio());
        System.out.println(reader2.getFio());
        System.out.println(reader3.getFio());
        
        reader1.takeBook(3);

    }
}