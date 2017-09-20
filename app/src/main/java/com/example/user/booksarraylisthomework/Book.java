package com.example.user.booksarraylisthomework;

/**
 * Created by user on 20/09/2017.
 */

public class Book {
    int ranking;
    String title;
    String author;

    public Book(int ranking, String title, String author) {
        this.ranking = ranking;
        this.title = title;
        this.author = author;
    }

    public int getRanking() {
        return ranking;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
