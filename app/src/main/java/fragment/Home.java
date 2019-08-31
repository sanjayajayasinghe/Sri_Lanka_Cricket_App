package fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.srilankacricketappv1.R;

import java.util.ArrayList;

import ScoreList.NewsListAdapter;
import ScoreList.NewsListAdapter.NewsItem;
import ScoreList.ScoreListAdapter;
import ScoreList.ScoreListAdapter.ScoreItem;


public class Home extends Fragment {


    private ArrayList<ScoreItem> scoreList = new ArrayList<>();
    private ArrayList<NewsItem> newsList = new ArrayList<>();
    private RecyclerView recyclerView;
    private RecyclerView recyclerViewNews;
    private CardView youtube1;
    private CardView youtube2;
    private CardView youtube3;
    private CardView youtube4;




    public Home() {
        Log.d("ABC", "Home: ");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerViewNews = view.findViewById(R.id.recyclerViewNews);
        youtube1 = view.findViewById(R.id.card1);
        youtube2 = view.findViewById(R.id.card2);
        youtube3 = view.findViewById(R.id.card3);
        youtube4 = view.findViewById(R.id.card4);
        setOnClickListners();
        addDetails();
        initRecyclerView();

        return view;
    }


    private void setOnClickListners(){

        youtube1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=7Xz9Xv1CRnA&t=5s"));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setPackage("com.google.android.youtube");
                startActivity(intent);
            }
        });

        youtube2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=7Xz9Xv1CRnA&t=5s"));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setPackage("com.google.android.youtube");
                startActivity(intent);
            }
        });

        youtube3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=7Xz9Xv1CRnA&t=5s"));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setPackage("com.google.android.youtube");
                startActivity(intent);
            }
        });

        youtube4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=7Xz9Xv1CRnA&t=5s"));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setPackage("com.google.android.youtube");
                startActivity(intent);
            }
        });
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private void initRecyclerView() {

        ScoreListAdapter adapter = new ScoreListAdapter(scoreList, this.getContext());
        recyclerView.setAdapter(adapter);

        NewsListAdapter adapterNews = new NewsListAdapter(newsList,this.getContext());
        recyclerViewNews.setAdapter(adapterNews);

        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        RecyclerView.LayoutManager linearLayoutManagerNews = new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false);
        recyclerViewNews.setLayoutManager(linearLayoutManagerNews);
    }

    private void addDetails() {

        scoreList.add(new ScoreItem("1001","PAK Vs IND",PAK, "PAK", "120/3", IND, "IND", "253", true));
        scoreList.add(new ScoreItem("1002","SL Vs ENG",SL, "SL", "250", ENG, "ENG", "253", false));
        scoreList.add(new ScoreItem("1003","NZ Vs WI",NZ, "NZ", "222/2", WI, "WI", "253", true));
        scoreList.add(new ScoreItem("1004","AUS Vs PAK",AUS, "AUS", "0/2", PAK, "PAK", "253", false));
        scoreList.add(new ScoreItem("1005","NZ vs SL",NZ, "NZ", "145/0", SL, "SL", "253", true));

        newsList.add(new NewsItem("001","Jason Holder steps up to change","A drive on the up, to the left of cover point. That shot, by Ajinkya Rahane off Shannon Gabriel, came in the 57th over of India's innings on Friday.","https://a3.espncdn.com/combiner/i?img=%2Fi%2Fcricket%2Fcricinfo%2F1199103_1296x729.jpg&w=920&h=518&scale=crop&cquality=40&location=origin&format=jpg"));
        newsList.add(new NewsItem("002","Isuru Udana to replace David Willey","Sri Lanka allrounder Isuru Udana has replaced David Willey as Paarl Rocks' international marquee player for the second edition of the Mzansi Super League","https://a.espncdn.com/combiner/i?img=%2Fi%2Fcricket%2Fcricinfo%2F1186406_1296x729.jpg&w=920&h=518&scale=crop&cquality=40&location=origin&format=jpg"));
        newsList.add(new NewsItem("003","Jason Holder steps up to change","A drive on the up, to the left of cover point. That shot, by Ajinkya Rahane off Shannon Gabriel, came in the 57th over of India's innings on Friday.","https://a3.espncdn.com/combiner/i?img=%2Fi%2Fcricket%2Fcricinfo%2F1199103_1296x729.jpg&w=920&h=518&scale=crop&cquality=40&location=origin&format=jpg"));
        newsList.add(new NewsItem("004","Isuru Udana to replace David Willey","Sri Lanka allrounder Isuru Udana has replaced David Willey as Paarl Rocks' international marquee player for the second edition of the Mzansi Super League","https://a.espncdn.com/combiner/i?img=%2Fi%2Fcricket%2Fcricinfo%2F1186406_1296x729.jpg&w=920&h=518&scale=crop&cquality=40&location=origin&format=jpg"));
        newsList.add(new NewsItem("005","Jason Holder steps up to change","A drive on the up, to the left of cover point. That shot, by Ajinkya Rahane off Shannon Gabriel, came in the 57th over of India's innings on Friday.","https://a3.espncdn.com/combiner/i?img=%2Fi%2Fcricket%2Fcricinfo%2F1199103_1296x729.jpg&w=920&h=518&scale=crop&cquality=40&location=origin&format=jpg"));
        newsList.add(new NewsItem("006","Isuru Udana to replace David Willey","Sri Lanka allrounder Isuru Udana has replaced David Willey as Paarl Rocks' international marquee player for the second edition of the Mzansi Super League","https://a.espncdn.com/combiner/i?img=%2Fi%2Fcricket%2Fcricinfo%2F1186406_1296x729.jpg&w=920&h=518&scale=crop&cquality=40&location=origin&format=jpg"));

    }



    private static final String SL = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Flag_of_Sri_Lanka.svg/1920px-Flag_of_Sri_Lanka.svg.png";
    private static final String IND = "https://upload.wikimedia.org/wikipedia/en/thumb/4/41/Flag_of_India.svg/383px-Flag_of_India.svg.png";
    private static final String NZ = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/Silver_fern_flag.svg/1200px-Silver_fern_flag.svg.png";
    private static final String AUS = "https://upload.wikimedia.org/wikipedia/en/thumb/b/b9/Flag_of_Australia.svg/800px-Flag_of_Australia.svg.png";
    private static final String WI = "https://upload.wikimedia.org/wikipedia/en/6/65/West_indies_cricket_board_flag.png";
    private static final String ENG = "https://upload.wikimedia.org/wikipedia/en/thumb/b/be/Flag_of_England.svg/1280px-Flag_of_England.svg.png";
    private static final String PAK = "https://4.bp.blogspot.com/-onFMF0ssNek/WFZWMm5kG6I/AAAAAAAAAkc/tDOuQ9TC5zMz4H6NJrFixdwjWrlE29dpACLcB/s1600/Logo%2Band%2Bcolours%2BPakistan%2527s%2Bcricket%2Bteam%2527s.jpg";

}
