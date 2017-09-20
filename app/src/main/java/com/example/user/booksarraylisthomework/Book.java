package com.example.user.booksarraylisthomework;

/**
 * Created by user on 20/09/2017.
 */

public class Book {
    Integer ranking;
    String title;
    String author;

    public Book(Integer ranking, String title, String author) {
        this.ranking = ranking;
        this.title = title;
        this.author = author;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
