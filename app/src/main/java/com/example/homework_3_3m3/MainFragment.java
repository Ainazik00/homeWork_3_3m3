package com.example.homework_3_3m3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    private RecyclerView rvBook;
    ArrayList<String> bookList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        loadData();
        initAdapter();
    }

    private void initAdapter() {
        BookAdapter adapter = new BookAdapter(bookList);
        rvBook.setAdapter(adapter);
    }

    private void loadData() {
        bookList.add("Кровь, пот и пиксели. Обратная сторона индустрии видеоигр");
        bookList.add("Чистый код");
        bookList.add("Законы победителей");
        bookList.add("Магия утра");
        bookList.add("Сила воли");
        bookList.add("Эссенциализм");
        bookList.add("Выйди из зоны комфорта");
        bookList.add("Почему никто не рассказал мне это в 20 ?");
        bookList.add("Поток");
        bookList.add("Наперегонки со счастьем");
        bookList.add("Богатый папа,бедный папа");
        bookList.add("7 навыков высокоэффективных людей");
        bookList.add("Одна привычка в неделю");
        bookList.add("Самый богатый человек в Вавилоне");
        bookList.add("Мечтать не вредно");
        bookList.add("Подсознание может все");
        bookList.add("К черту все! Берись и делай!");
        bookList.add("Как привести дела в порядок");
    }

    private void initView() {
        rvBook = requireActivity().findViewById(R.id.rv_book);
    }
}