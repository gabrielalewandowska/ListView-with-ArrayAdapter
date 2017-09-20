package com.example.user.booksarraylisthomework;

import java.util.ArrayList;

/**
 * Created by user on 20/09/2017.
 */

public class BookList {
    ArrayList<Book> list;

    public BookList() {
        this.list = new ArrayList<>();
        list.add(new Book(1, "1984", "George Orwell"));
        list.add(new Book(2, "Brave New World", "Aldous Huxley"));
        list.add(new Book(3, "The Strange Death of Europe", "Douglas Murray"));
        list.add(new Book(4, "Candide", "Voltaire"));
        list.add(new Book(5, "Master and Margarita", "Mikhail Bulgakov"));
        list.add(new Book(6, "Faust", "Johann Wolfgang von Geothe"));
        list.add(new Book(7, "Wuthering Heights", "Emily Bronte"));
        list.add(new Book(8, "Anna Karenina", "Leo Tolstoy"));
        list.add(new Book(9, "Buddenbrooks", "Thomas Mann"));
        list.add(new Book(10, "April Witch", "Majgull Axelsson"));
        list.add(new Book(11, "Ferdydurke", "Witold Gombrowicz"));
        list.add(new Book(12, "The Street of Crocodiles", "Bruno Schulz"));
        list.add(new Book(13, "Emma", "Jane Austen"));
        list.add(new Book(14, "Vanity Fair", "William Makepeace Thackeray"));
        list.add(new Book(15, "Life and Fate", "Vassily Grossman"));
    }

    public ArrayList<Book> getList(){
        return new ArrayList<Book>(list);
    }
}
