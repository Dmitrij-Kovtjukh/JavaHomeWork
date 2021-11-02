package com.pb.kovtuh.hw5;

import java.util.Arrays;

public class Book {
    private String namebook;
    private String authorbook;
    private String yearout;

    public String getNamebook() {
        return namebook;
    }

    public void setNamebook(String namebook) {
       // if (namebook == null || namebook.isEmpty()){
       //     return;
        //}
        this.namebook = namebook;
    }

    public String getAuthorbook() {
        return authorbook;
    }

    public void setAuthorbook(String authorbook) {
        this.authorbook = authorbook;
    }

    public String getYearout() {
        return yearout;
    }

    public void setYearout(String yearout) {
        this.yearout = yearout;
    }

    String allbook() {
        return "Книга: " + namebook + " (" + authorbook + " "
                + yearout + " г.)";
    }
}
