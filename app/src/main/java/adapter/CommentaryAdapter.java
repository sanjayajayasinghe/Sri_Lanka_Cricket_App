package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.srilankacricketappv1.R;

import java.util.ArrayList;

import ScoreList.NewsListAdapter;

public class CommentaryAdapter extends RecyclerView.Adapter<CommentaryAdapter.CommentaryHolder> {

    private ArrayList<NewsListAdapter.NewsItem> newsItems;
    private Context mContext;

    public CommentaryAdapter(ArrayList<NewsListAdapter.NewsItem> newsItems, Context mContext) {
        this.newsItems = newsItems;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public CommentaryAdapter.CommentaryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.commentary_item,parent,false);
        return new CommentaryAdapter.CommentaryHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CommentaryAdapter.CommentaryHolder holder, final int position) {



        holder.newsTitle.setText(newsItems.get(position).getTitle());
        holder.newsText.setText(newsItems.get(position).getNews());



    }

    @Override
    public int getItemCount() {
        return newsItems.size();
    }

    public class CommentaryHolder extends RecyclerView.ViewHolder {

        TextView newsTitle;
        TextView newsText;
        TextView viewMore;
        ImageView newsImage;

        public CommentaryHolder(@NonNull View itemView) {
            super(itemView);
            newsText = itemView.findViewById(R.id.txtNews);
            newsTitle = itemView.findViewById(R.id.txtTitle);

        }


    }

    public static class NewsItem{
        String newsID;
        String title;
        String news;


        public NewsItem(String newsID, String title, String news, String newsImage) {
            this.newsID = newsID;
            this.title = title;
            this.news = news;

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

    }
}
