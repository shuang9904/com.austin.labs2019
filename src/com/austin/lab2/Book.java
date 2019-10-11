package com.austin.lab2;

public class Book {
    String ISBM , title;
    double price;
    int pageNum;

    Book(String title , double price , String ISBM , int pageNum  ){
      this.title = title;
      this.price = price;
      this.ISBM = ISBM;
      this.pageNum = pageNum;
    }
    public String toString(){
        return title + price + ISBM + pageNum;
    }
    static void accessor(){


    }
    static void mutator(){

    }


    public static void main(String[] args) {



    }
}
