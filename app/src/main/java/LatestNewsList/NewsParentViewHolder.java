package LatestNewsList;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;
import com.bumptech.glide.Glide;
import com.example.srilankacricketappv1.R;

public class NewsParentViewHolder extends ParentViewHolder {

    public TextView textView;
    public ImageView newsImage;


    public NewsParentViewHolder(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.newsTitle);
        newsImage = itemView.findViewById(R.id.newsimage);
    }
}
