package com.example.srilankacricketappv1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import SearchList.SearchExampleAdapter;
import SearchList.SearchExampleItem;
import SearchList.SearchItemNotFoundExample;
import SearchList.SearchItemNotFoundExampleAdapter;

public class SearchNotFoundActivity extends AppCompatActivity {

    private SearchItemNotFoundExampleAdapter adapter;
    private List<SearchItemNotFoundExample> exampleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_not_found);
        fillExampleList();
        setUpRecyclerView();
    }


    private void fillExampleList() {
        exampleList=new ArrayList<>();
        exampleList.add(new SearchItemNotFoundExample(R.drawable.ic_search_black_24dp));
    }

    private void setUpRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recycler_view_result_not_found);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        adapter = new SearchItemNotFoundExampleAdapter(exampleList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
