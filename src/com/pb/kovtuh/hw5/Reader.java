package com.pb.kovtuh.hw5;

public class Reader {
    private String fio;
    private String idticket;
    private String faculty;
    private String bday;
    private String phone;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getIdticket() {
        return idticket;
    }

    public void setIdticket(String idticket) {
        this.idticket = idticket;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBday() {
        return bday;
    }

    public void setBday(String bday) {
        this.bday = bday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void takeBook(Integer n) {
        System.out.println("Петров И.И. взял " + n + " книг") ;
    }
    public void takeBook(String... namebook) {
        System.out.println("Петров И.И. взял книги:") ;
        for (String number : namebook){
            System.out.println(namebook);
        }
    }
}

