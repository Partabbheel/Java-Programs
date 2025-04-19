package com.Comparable.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoBook {
    public static void main(String[] args){
        List<Book> books = new ArrayList<>();

        Book book1 = new Book();
        book1.setBookName("Java");
        book1.setAuthorName("Hybert Schildt");
        books.add(book1);


        Book book2= new Book();
        book2.setBookName("Python");
        book2.setAuthorName("Eric Mattes");
        books.add(book2);


        Book book3 = new Book();
        book3.setBookName("C++");
        book3.setAuthorName("wes McKinney");
        books.add(book3);


        Book book4 = new Book();
        book4.setBookName("AI");
        book4.setAuthorName("peter Norvig");
        books.add(book4);

        Book book5 = new Book();
        book5.setBookName("DSA");
        book5.setAuthorName("lan GoodFellow");
        books.add(book5);

        System.out.println(books);
        Collections.sort(books);
        System.out.println(books);



    }


}
