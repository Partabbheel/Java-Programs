package com.CollectionFramework.Books;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book();
        book1.setTitle("Introduction to Algorithms");
        book1.setAuthor("Thomas H.Cormen");
        book1.setPrice(3700);

        Book book2 = new Book();
        book2.setTitle("Computer Organization and Design");
        book2.setAuthor("David A.Patterson");
        book2.setPrice(2900.15);

        Book book3 = new Book();
        book3.setTitle("Operating System");
        book3.setAuthor("Abraham Silberschatz");
        book3.setPrice(320017);

        Book book4 = new Book();
        book4.setTitle("Computer Networks");
        book4.setAuthor("Andrew S.Tanenbaum");
        book4.setPrice(2600.0);

        Book book5 = new Book();
        book5.setTitle("Database Systems");
        book5.setAuthor("Hector Garcia-Molina");
        book5.setPrice(3567.0);

        Book book6 = new Book();
        book6.setTitle("Artificial Intelligence");
        book6.setAuthor("Stuart Russell");
        book6.setPrice(3129.90);

        Book book7 = new Book();
        book7.setTitle("Algorithms and  Applications");
        book7.setAuthor("Richard Szeliski");
        book7.setPrice(2870.80);

        Book book8 = new Book();
        book8.setTitle("Machine Learning");
        book8.setAuthor("Andrew Ng");
        book8.setPrice(2550.07);


        Book book9 = new Book();
        book9.setTitle("Data Stuctures And Algorithms in python");
        book9.setAuthor("Michael T.Goodrich");
        book9.setPrice(2729);


        Book book10 = new Book();
        book10.setTitle("Cybersecurity And Cyberwar");
        book10.setAuthor("P.w. Singer and Allan Friedman");
        book10.setPrice(5600);

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);
        bookList.add(book8);
        bookList.add(book9);
        bookList.add(book10);

        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookList.get(i);
            System.out.println(book);

            System.out.println();
        }
    }
}
