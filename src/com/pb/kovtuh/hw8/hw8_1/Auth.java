package com.pb.kovtuh.hw8.hw8_1;

import java.util.Scanner;

public class Auth {

    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // method signUp
    public void signUp() {
        System.out.println("Придумайте и введите login от 5 до 20 символов из букв и цифыр:");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        //System.out.println(str);
        String logintemp = null;
        String confirmPassword;
        String password = null;
        for (int i = 0; i < 3; i++) {
            String str1 = str.replaceAll("[a-zA-Z0-9]", "");
            //System.out.println(str1.replaceAll("\\w",""));
            // System.out.println( "  - " + str1.length());
            // System.out.println("--- " + str);
            // System.out.println("*** " + str1);
            boolean l = str.length() >= 5 && str.length() <= 20 && str1.length() == 0;
            if (l) {
                //    str.length()>=5 && str.length()<=20 && str1.length() == 0){
                logintemp = str;
                System.out.println("Введен login");
                i = 3;

            } else if (i < 2 && !l) {
                System.out.println("Вводимый login не соответствует требованиям (WrongLoginException), попробуйте снова:");
                str = in.nextLine();
            } else {
                System.out.println("Вводимый login не соответствует требованиям (WrongLoginException). Ввод окончен.");
                return;
            }
        }
        System.out.println("Придумайте и введите password от 5 символов из букв, цифыр и подчеркивания:");
        str = in.nextLine();
        System.out.println(str);
        for (int i = 0; i < 3; i++) {
            String str1 = str.replaceAll("[a-zA-Z_0-9]", "");
            boolean l = str.length() >= 5 && str1.length() == 0;
            if (l) {
                System.out.println("Введен password");
                i = 3;
                password=str;

            } else if (i < 2 && !l) {
                System.out.println("Вводимый password не соответствует требованиям (WrongPasswordException), попробуйте снова:");
                str = in.nextLine();
            } else {
                System.out.println("Вводимый password не соответствует требованиям (WrongPasswordException). Ввод окончен.");
                return;
            }
            System.out.println("Введите повторно password:");
           // confirmPassword = in.nextLine();
            for (i = 0; i < 3; i++) {
                confirmPassword = in.nextLine();
                if (confirmPassword.equals(password)) {
                    setPassword(password);
                    i=3;
                }
                else if (i<2 && !confirmPassword.equals(password)){
                    System.out.println("Подтверждение password не совпадает с веденным password, попробуйте снова:");
                }
                else {
                    System.out.println("Вводимый password не совпадает с веденным password," +
                            " не соответствует требованиям (WrongPasswordException). Ввод окончен.");
                    return;
                }
            }
            setLogin(logintemp);
        }
    }

    // method signIn
    public void signIn() {
        System.out.println("Для автоизации на сайте введите login");
        Scanner in = new Scanner(System.in);
        String str ;
       // String logintemp = null;

        String password = null;
        for (int i = 0; i < 3; i++) {
            str = in.nextLine();
            if (getLogin().equals(str)){
                System.out.println("Введен login");
                i = 3;

            } else if (i < 2 && !getLogin().equals(str)) {
                System.out.println("Вводимый login не существует (WrongLoginException), попробуйте снова:");
                //str = in.nextLine();
            } else {
                System.out.println("Вводимый login не существует (WrongLoginException). Ввод окончен.");
                return;
            }
        }
        System.out.println("Введите password:");

      //  System.out.println(str);
        for (int i = 0; i < 3; i++) {
            str = in.nextLine();
            if (getPassword().equals(str)) {
                System.out.println("Введен password");
                i = 3;
            } else if (i < 2 && !getPassword().equals(str)) {
                System.out.println("Вводимый password не соответствует требованиям (WrongPasswordException), попробуйте снова:");
            } else {
                System.out.println("Вводимый password не соответствует требованиям (WrongPasswordException). Ввод окончен.");
                return;
            }
        }
        System.out.println("Выполнен вход пользователя login: "+getLogin());
    }

    public static class OnlineShop {

        public static void main(String[] args) {
            Auth user1 = new Auth();
            System.out.println("Регистрация пользователя");
            user1.signUp();
            System.out.println("---------------");
            System.out.println(user1.getLogin());
            System.out.println(user1.getPassword());
            System.out.println("Вход пользователя на сайт");
            user1.signIn();
        }
    }
}