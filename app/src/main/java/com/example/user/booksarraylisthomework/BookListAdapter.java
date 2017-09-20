package com.example.user.booksarraylisthomework;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 20/09/2017.
 */

public class BookListAdapter extends ArrayAdapter<Book> {
    public BookListAdapter(Context context, ArrayList<Book> books){
        super(context, 0, books);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.book_item, parent, false);
        }

        Book currentBook = getItem(position);

        TextView ranking = listItemView.findViewById(R.id.ranking);
        ranking.setText(currentBook.getRanking().toString());

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentBook.getTitle());

        TextView author = (TextView) listItemView.findViewById(R.id.author);
        author.setText(currentBook.getAuthor().toString());

        listItemView.setTag(currentBook);

        return listItemView;

    }
}
