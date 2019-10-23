package com.austin.lab2;
public class Library {
    public static void main(String[] args) {
        Book bk1 = new Book();
        bk1.setTitle("The adventures of Harry Hamster");

        System.out.println("Book :" + bk1.getTitle());

        bk1.setNumPages(400);

        System.out.println("Number of Pages :" + bk1.getNumPages());

        Book bk2;

        bk2= new Book();
        bk2.setTitle("Hello");

        System.out.println()


    }
}

