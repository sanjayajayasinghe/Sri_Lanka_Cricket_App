package LatestNewsList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bignerdranch.expandablerecyclerview.Model.ParentObject;
import com.bumptech.glide.Glide;
import com.example.srilankacricketappv1.R;

import java.util.List;

public class NewsAdapter extends ExpandableRecyclerAdapter<NewsParentViewHolder, NewsChildViewHolder> {


    LayoutInflater inflater;

    public NewsAdapter(Context context, List<ParentObject> parentItemList) {
        super(context, parentItemList);
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public NewsParentViewHolder onCreateParentViewHolder(ViewGroup viewGroup) {
        View view = inflater.inflate(R.layout.news_parent, viewGroup, false);
        return new NewsParentViewHolder(view);
    }

    @Override
    public NewsChildViewHolder onCreateChildViewHolder(ViewGroup viewGroup) {
        View view = inflater.inflate(R.layout.news_child, viewGroup, false);
        return new NewsChildViewHolder(view);
    }

    @Override
    public void onBindParentViewHolder(NewsParentViewHolder newsParentViewHolder, int i, Object o) {
        NewsParent news = (NewsParent) o;
        newsParentViewHolder.textView.setText(news.getTitle());
        Glide.with(mContext).load(news.getPicUrl()).asBitmap().into(newsParentViewHolder.newsImage);

    }

    @Override
    public void onBindChildViewHolder(NewsChildViewHolder newsChildViewHolder, int i, Object o) {
        NewsChild news = (NewsChild) o;
        newsChildViewHolder.option1.setText(news.getOption1());
        newsChildViewHolder.option2.setText(news.getOption2());
        Glide.with(mContext).load(news.getImagePath()).asBitmap().into(newsChildViewHolder.image1);
    }
}
