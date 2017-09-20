package com.example.user.booksarraylisthomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BookListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);

        BookList topMovies = new BookList();
        ArrayList<Book> list = topMovies.getList();

        BookListAdapter movieAdapter = new BookListAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(movieAdapter);
    }


}
