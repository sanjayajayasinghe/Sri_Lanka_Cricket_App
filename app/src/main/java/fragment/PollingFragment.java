package fragment;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ScoreList.NewsListAdapter.NewsItem;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.srilankacricketappv1.R;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

import ScoreList.NewsListAdapter;
import ScoreList.ScoreListAdapter;
import adapter.CommentaryAdapter;


public class PollingFragment extends Fragment {

   // private ArrayList<ScoreItem> scoreList = new ArrayList<>();
    private ArrayList<NewsItem> newsList = new ArrayList<>();
    private RecyclerView recyclerViewNews;

    ImageView country1;
    ImageView country2;
    Button county1Thumb;
    Button county2Thumb;
    ProgressBar progressBar;
    TextView country1Precentage;
    TextView country2Precentage;

    private static final String TAG = "Polling";

    public PollingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_polling, container, false);
        country1Precentage=view.findViewById(R.id.country1Precentage);
        country2Precentage=view.findViewById(R.id.country2Precentage);
        country1 = view.findViewById(R.id.country1_logo);
        country2 = view.findViewById(R.id.country2_logo);
        county1Thumb = view.findViewById(R.id.country1_thumb);
        county2Thumb = view.findViewById(R.id.country2_thumb);
        progressBar = view.findViewById(R.id.progressBar);

        progressBar.setProgress(30);
        country1Precentage.setText(progressBar.getProgress()+"%");
        country2Precentage.setText((100-progressBar.getProgress())+"%");


        recyclerViewNews = view.findViewById(R.id.recyclerViewPolling);
        addItems();
        initRecyclerView();



        String[] arraySpinner = new String[] {
                "SL vs IND 1st ODI match", "NZ vs Eng 1st Test match", "Aus vs WI 1st T20 match"
        };
        Spinner s = (Spinner) view.findViewById(R.id.current_matches_spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                R.layout.country_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);

        //TextView description=view.findViewById(R.id.match_description_text_view);
       // description.setText("The Sri Lanka captain wanted his team to show character in the middle, and not sit back satisfied merely by good starts - with bat or ball");










        Glide.with(view.getContext()).load(SL).asBitmap().into(country1);
        Glide.with(view.getContext()).load(IND).asBitmap().into(country2);

        addClickListners();




        return view;
    }

    private void addClickListners(){

        county1Thumb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ( county1Thumb.getBackground().getConstantState()==getResources().getDrawable(R.drawable.blackthumb).getConstantState())
                {
                    county1Thumb.setBackgroundResource(R.drawable.bluethumb);
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        progressBar.setProgress(progressBar.getProgress() + 5,true);
                    }
                }else{
                    county1Thumb.setBackgroundResource(R.drawable.blackthumb);
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        progressBar.setProgress(progressBar.getProgress() - 5,true);
                    }
                }
                country1Precentage.setText(progressBar.getProgress()+"%");
                country2Precentage.setText((100-progressBar.getProgress())+"%");

            }
        });

        county2Thumb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if ( county2Thumb.getBackground().getConstantState()==getResources().getDrawable(R.drawable.blackthumb).getConstantState())                {
                    county2Thumb.setBackgroundResource(R.drawable.bluethumb);
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        progressBar.setProgress(progressBar.getProgress() - 5,true);
                    }
                }else{
                    county2Thumb.setBackgroundResource(R.drawable.blackthumb);
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        progressBar.setProgress(progressBar.getProgress() + 5,true);
                    }
                }

                    country1Precentage.setText(progressBar.getProgress()+"%");
                country2Precentage.setText((100-progressBar.getProgress())+"%");
            }
        });
    }


    private void addItems(){
        newsList.add(new NewsItem("001","overs 2.5 ","A drive on the up, to the left of cover point. That shot, by Ajinkya Rahane off Shannon Gabriel, came in the 57th over of India's innings on Friday.","https://a3.espncdn.com/combiner/i?img=%2Fi%2Fcricket%2Fcricinfo%2F1199103_1296x729.jpg&w=920&h=518&scale=crop&cquality=40&location=origin&format=jpg"));
        newsList.add(new NewsItem("002","overs 2.4","Sri Lanka allrounder Isuru Udana has replaced David Willey as Paarl Rocks' international marquee player for the second edition of the Mzansi Super League","https://a.espncdn.com/combiner/i?img=%2Fi%2Fcricket%2Fcricinfo%2F1186406_1296x729.jpg&w=920&h=518&scale=crop&cquality=40&location=origin&format=jpg"));
        newsList.add(new NewsItem("003","overs 2.3","A drive on the up, to the left of cover point. That shot, by Ajinkya Rahane off Shannon Gabriel, came in the 57th over of India's innings on Friday.","https://a3.espncdn.com/combiner/i?img=%2Fi%2Fcricket%2Fcricinfo%2F1199103_1296x729.jpg&w=920&h=518&scale=crop&cquality=40&location=origin&format=jpg"));
        newsList.add(new NewsItem("004","overs 2.2","Sri Lanka allrounder Isuru Udana has replaced David Willey as Paarl Rocks' international marquee player for the second edition of the Mzansi Super League","https://a.espncdn.com/combiner/i?img=%2Fi%2Fcricket%2Fcricinfo%2F1186406_1296x729.jpg&w=920&h=518&scale=crop&cquality=40&location=origin&format=jpg"));
        newsList.add(new NewsItem("005","overs 2.1","A drive on the up, to the left of cover point. That shot, by Ajinkya Rahane off Shannon Gabriel, came in the 57th over of India's innings on Friday.","https://a3.espncdn.com/combiner/i?img=%2Fi%2Fcricket%2Fcricinfo%2F1199103_1296x729.jpg&w=920&h=518&scale=crop&cquality=40&location=origin&format=jpg"));

    }

    private void initRecyclerView() {

        CommentaryAdapter adapterNews = new CommentaryAdapter(newsList,this.getContext());
        recyclerViewNews.setAdapter(adapterNews);

        RecyclerView.LayoutManager linearLayoutManagerNews = new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false);
        recyclerViewNews.setLayoutManager(linearLayoutManagerNews);
    }

    private static final String SL = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Flag_of_Sri_Lanka.svg/1920px-Flag_of_Sri_Lanka.svg.png";
    private static final String IND = "https://upload.wikimedia.org/wikipedia/en/thumb/4/41/Flag_of_India.svg/383px-Flag_of_India.svg.png";
    private static final String NZ = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/Silver_fern_flag.svg/1200px-Silver_fern_flag.svg.png";


}
