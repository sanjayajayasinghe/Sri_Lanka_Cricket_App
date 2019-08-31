package com.example.srilankacricketappv1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import SearchList.SearchExampleAdapter;
import SearchList.SearchExampleItem;

public class SearchActivity extends AppCompatActivity {
    private SearchExampleAdapter adapter;
    private List<SearchExampleItem> exampleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_content);
        fillExampleList();
        setUpRecyclerView();
    }

    private void fillExampleList() {
        exampleList = new ArrayList<>();
        exampleList.add(new SearchExampleItem(R.drawable.ic_search_black_24dp,"WorldCup", "2019"));
        exampleList.add(new SearchExampleItem(R.drawable.ic_search_black_24dp,"WorldCup", "2011"));
//        exampleList.add(new SearchExampleItem(R.drawable.ic_sun, "Three", "Twelve"));
//        exampleList.add(new SearchExampleItem(R.drawable.ic_android, "Four", "Thirteen"));
//        exampleList.add(new SearchExampleItem(R.drawable.ic_audio, "Five", "Fourteen"));
//        exampleList.add(new SearchExampleItem(R.drawable.ic_sun, "Six", "Fifteen"));
//        exampleList.add(new SearchExampleItem(R.drawable.ic_android, "Seven", "Sixteen"));
//        exampleList.add(new SearchExampleItem(R.drawable.ic_audio, "Eight", "Seventeen"));
//        exampleList.add(new SearchExampleItem(R.drawable.ic_sun, "Nine", "Eighteen"));
    }

    private void setUpRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        adapter = new SearchExampleAdapter(exampleList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
