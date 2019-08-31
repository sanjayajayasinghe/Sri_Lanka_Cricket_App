package ScoreList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.srilankacricketappv1.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class NewsListAdapter extends RecyclerView.Adapter<NewsListAdapter.NewsItemHolder> {

    private ArrayList<NewsItem> newsItems;
    private Context mContext;

    public NewsListAdapter(ArrayList<NewsItem> newsItems, Context mContext) {
        this.newsItems = newsItems;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public NewsItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_item,parent,false);
        return new NewsItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsItemHolder holder, final int position) {

        Glide.with(mContext).load(newsItems.get(position).getNewsImage()).asBitmap().into(holder.newsImage);

        holder.newsTitle.setText(newsItems.get(position).getTitle());
        holder.newsText.setText(newsItems.get(position).getNews());

        holder.viewMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"View more for news ID " + newsItems.get(position).getNewsID(),Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return newsItems.size();
    }

    public class NewsItemHolder extends RecyclerView.ViewHolder {

        TextView newsTitle;
        TextView newsText;
        TextView viewMore;
        ImageView newsImage;

        public NewsItemHolder(@NonNull View itemView) {
            super(itemView);
            newsText = itemView.findViewById(R.id.txtNews);
            newsTitle = itemView.findViewById(R.id.txtTitle);
            viewMore = itemView.findViewById(R.id.txtViewMore);
            newsImage = itemView.findViewById(R.id.imgNews);
        }


    }

    public static class NewsItem{
        String newsID;
        String title;
        String news;
        String newsImage;

        public NewsItem(String newsID, String title, String news, String newsImage) {
            this.newsID = newsID;
            this.title = title;
            this.news = news;
            this.newsImage = newsImage;
        }

        public String getNewsID() {
            return newsID;
        }

        public String getTitle() {
            return title;
        }

        public String getNews() {
            return news;
        }

        public String getNewsImage() {
            return newsImage;
        }
    }
}
