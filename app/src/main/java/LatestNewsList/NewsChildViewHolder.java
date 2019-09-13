package LatestNewsList;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;
import com.example.srilankacricketappv1.R;

public class NewsChildViewHolder extends ChildViewHolder {

    public TextView option1;
    public TextView option2;
    public ImageView image1;

    public NewsChildViewHolder(View itemView) {
        super(itemView);
        option1 = itemView.findViewById(R.id.option1);
        option2 = itemView.findViewById(R.id.option2);
        image1 = itemView.findViewById(R.id.image1);
    }
}
