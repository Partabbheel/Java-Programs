package com.Comparable.Book;

import org.jetbrains.annotations.NotNull;

public class Book implements Comparable<Book> {
    private String BookName;
    private String AuthorName;

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookName='" + BookName + '\'' +
                ", AuthorName='" + AuthorName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return (this.getBookName().compareTo(o.getBookName()));
    }
}


