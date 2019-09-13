package fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;
import com.example.srilankacricketappv1.R;

import java.util.ArrayList;
import java.util.List;

import LatestNewsList.NewsAdapter;
import LatestNewsList.NewsChild;
import LatestNewsList.NewsCreator;
import LatestNewsList.NewsParent;


public class LatestNews extends Fragment {

    RecyclerView recyclerView;

    public LatestNews() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_latest_news, container, false);
        recyclerView = view.findViewById(R.id.newsRecyclerView);
        initRecyclerView();
        return view;
    }

    private void initRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        NewsAdapter adapter = new NewsAdapter(getActivity(), initData());
        adapter.setParentClickableViewAnimationDefaultDuration();
        adapter.setParentAndIconExpandOnClick(true);
        recyclerView.setAdapter(adapter);
    }

    private List<ParentObject> initData() {
        NewsCreator newsCreator = NewsCreator.get(getActivity());
        List<NewsParent> news = newsCreator.getAll();
        List<ParentObject> parentObjects = new ArrayList<>();
        for(NewsParent newsParent : news){
            List<Object> childList = new ArrayList<>();
            childList.add(new NewsChild(newsParent.getTitle(),newsParent.getDetails(),newsParent.getPicUrl()));
            newsParent.setChildObjectList(childList);
            parentObjects.add(newsParent);
        }
        return parentObjects;
    }


}
