package com.pb.kovtuh.hw8;

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
    public void signUp() throws WrongLoginException, WrongPasswordException {
        System.out.println("Придумайте и введите login от 5 до 20 символов из букв и цифыр:");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String logintemp = null;
        String confirmPassword;
        String password = null;
        try {
            String str1 = str.replaceAll("[a-zA-Z0-9]", "");

            boolean l = str.length() >= 5 && str.length() <= 20 && str1.length() == 0;
            if (!l) {
                throw new WrongLoginException();
            }
            logintemp = str;
            System.out.println("Введен login");
        } catch (WrongLoginException e) {
            System.out.println("Вводимый login не соответствует требованиям WrongLoginException");
            e.printStackTrace();
            return;
        }

        System.out.println("Придумайте и введите password от 5 символов из букв, цифыр и подчеркивания:");
        str = in.nextLine();
        String str1 = str.replaceAll("[a-zA-Z_0-9]", "");
        boolean l = str.length() >= 5 && str1.length() == 0;
        try {
            if (!l) {
                throw new WrongPasswordException();
            }
            System.out.println("Введен password");
            password = str;

        }catch (WrongPasswordException e){
                System.out.println("Вводимый password не соответствует требованиям WrongPasswordException");
                e.printStackTrace();
                return;
        }

        System.out.println("Введите повторно password:");
        confirmPassword = in.nextLine();
        if (confirmPassword.equals(password)) {
            setPassword(password);
        }
        else {
            System.out.println("Вводимый password не совпадает с веденным password," +
                    " не соответствует требованиям (WrongPasswordException). Ввод окончен.");
            return;
        }
        setLogin(logintemp);
    }

        // method signIn
        public void signIn () throws WrongLoginException{
            System.out.println("Для авторизации на сайте введите login");
            Scanner in = new Scanner(System.in);
            String str;
            String password = null;
            str = in.nextLine();
            try {
                if (!getLogin().equals(str)) {
                    throw new WrongLoginException(str);
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }

            System.out.println("Введите password:");
            str = in.nextLine();
            try {
                if (!getPassword().equals(str)) {
                    throw new WrongPasswordException(str);
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
            System.out.println("Выполнен вход пользователя login: " + getLogin());
        }

        public class WrongLoginException extends Exception {
            private String login;

            public WrongLoginException(String login) {
                this.login = login;
                System.out.println("Вводимый login: "+login+" не соответствует требованиям");
            }

            public WrongLoginException() {
                System.out.println("Вводимый login не соответствует требованиям");
            }
        }

        public class WrongPasswordException extends Exception {
            private String password;

            public WrongPasswordException(String password) {
                this.password = password;
                System.out.println("Вводимый password: "+password+" не соответствует требованиям");
            }

            public WrongPasswordException() {
                System.out.println("Вводимый password не соответствует требованиям");
        }
        }

        public static class OnlineShop {

            public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
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
