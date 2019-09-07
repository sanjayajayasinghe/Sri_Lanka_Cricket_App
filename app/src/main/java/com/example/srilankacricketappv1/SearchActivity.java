package com.example.srilankacricketappv1;

import android.app.SearchManager;
import android.content.Intent;
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
        handleIntent(getIntent());

    }

    private void fillExampleList() {
        exampleList = new ArrayList<>();
        exampleList.add(new SearchExampleItem(R.drawable.ic_search_black_24dp,"WorldCup", "2019"));
        exampleList.add(new SearchExampleItem(R.drawable.ic_search_black_24dp,"WorldCup", "2011"));
    }

    private void setUpRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        adapter = new SearchExampleAdapter(exampleList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }


    @Override
    protected void onNewIntent(Intent intent) {
        setIntent(intent);
        handleIntent(intent);
    }

    private void handleIntent(Intent intent) {
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
            if(query.equals("WorldCup")){
                fillExampleList();
                setUpRecyclerView();
            }else{
                Intent splash = new Intent(SearchActivity.this, SearchNotFoundActivity.class);
                startActivity(splash);
            }


        }
    }
}
