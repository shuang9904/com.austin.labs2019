package com.austin.lab2;
public class Book {
    private String title;
    private int numPages;
    private String isbn;
    private double price;

// accessor and mutator methods

    // accessor method
    public String getTitle() {
        return title;
    }

    //mutator method
    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
}
