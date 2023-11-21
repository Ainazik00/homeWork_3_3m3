package com.example.homework_3_3m3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BookViewHolder extends RecyclerView.ViewHolder {
    private TextView bookName;
    public BookViewHolder(@NonNull View itemView) {
        super(itemView);
        bookName = itemView.findViewById(R.id.book_name);
    }
    public void bind (String name) {
        bookName.setText(name);
    }
}
