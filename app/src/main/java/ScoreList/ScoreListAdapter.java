package ScoreList;

import android.content.Context;
import android.util.Log;
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



import java.util.ArrayList;

public class ScoreListAdapter extends RecyclerView.Adapter<ScoreListAdapter.ScoreItemHolder> {

    private static final String TAG = "[ScoreItemRecyclerView]";
    private ArrayList<ScoreItem> scoreList;


    private Context mContext;

    public ScoreListAdapter(ArrayList<ScoreItem> scoreList, Context mContext) {
        this.scoreList = scoreList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ScoreItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Log.d(TAG, "onCreateViewHolder: called");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.score_item,parent,false);
        return new ScoreItemHolder(view);
}

    @Override
    public void onBindViewHolder(@NonNull final ScoreItemHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called");

        Glide.with(mContext).load(scoreList.get(position).getCountry1image()).asBitmap().into(holder.country1image);
        Glide.with(mContext).load(scoreList.get(position).getCountry2image()).asBitmap().into(holder.country2image);

        holder.country1name.setText(scoreList.get(position).getCountry1name());
        holder.country2name.setText(scoreList.get(position).getCountry2name());

        holder.country1score.setText(scoreList.get(position).getCountry1score());
        holder.country2score.setText(scoreList.get(position).getCountry2score());

        if(scoreList.get(position).isLive()){
            holder.liveBadge.setVisibility(View.VISIBLE);
        }else{
            holder.liveBadge.setVisibility(View.GONE);
        }

        holder.btnViewMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Click on match ID" + scoreList.get(position).getMatchID(),Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return this.scoreList.size();
    }

    public class ScoreItemHolder extends RecyclerView.ViewHolder {

        ImageView country1image;
        ImageView country2image;
        TextView country1name;
        TextView country2name;
        TextView country1score;
        TextView country2score;
        TextView liveBadge;
        TextView name;
        Button btnViewMore;

        public ScoreItemHolder(@NonNull View itemView) {
            super(itemView);
            country1image = itemView.findViewById(R.id.country1image);
            country2image = itemView.findViewById(R.id.country2image);
            country1name = itemView.findViewById(R.id.country1name);
            country2name = itemView.findViewById(R.id.country2name);
            country1score = itemView.findViewById(R.id.country1score);
            country2score= itemView.findViewById(R.id.country2score);
            liveBadge = itemView.findViewById(R.id.liveBadge);
            name = itemView.findViewById(R.id.name);
            btnViewMore = itemView.findViewById(R.id.btnViewMore);

        }
    }

    public static class ScoreItem{

        String matchID;
        String country1image;
        String country1name;
        String country1score;
        String country2image;
        String country2name;
        String country2score;
        boolean isLive;

        public ScoreItem(String matchID, String country1image, String country1name, String country1score, String country2image, String country2name, String country2score, boolean isLive) {
            this.matchID = matchID;
            this.country1image = country1image;
            this.country1name = country1name;
            this.country1score = country1score;
            this.country2image = country2image;
            this.country2name = country2name;
            this.country2score = country2score;
            this.isLive = isLive;
        }

        public String getMatchID() {
            return matchID;
        }

        public String getCountry1image() {
            return country1image;
        }

        public String getCountry1name() {
            return country1name;
        }

        public String getCountry1score() {
            return country1score;
        }

        public String getCountry2image() {
            return country2image;
        }

        public String getCountry2name() {
            return country2name;
        }

        public String getCountry2score() {
            return country2score;
        }

        public boolean isLive() {
            return isLive;
        }
    }
}
