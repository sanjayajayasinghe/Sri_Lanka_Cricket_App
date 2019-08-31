package fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.srilankacricketappv1.R;

import java.util.ArrayList;

import ScoreList.ScoreListAdapter;
import ScoreList.ScoreListAdapter.ScoreItem;


public class Home extends Fragment {


    private ArrayList<ScoreItem> scoreList = new ArrayList<>();
    private RecyclerView recyclerView;


    public Home() {
        Log.d("ABC", "Home: ");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        addDetails();
        initRecyclerView();

        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private void initRecyclerView() {

        ScoreListAdapter adapter = new ScoreListAdapter(scoreList, this.getContext());
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private void addDetails() {

        scoreList.add(new ScoreItem(PAK, "PAK", "120/3", IND, "IND", "253", true));
        scoreList.add(new ScoreItem(SL, "PAK", "120/3", ENG, "IND", "253", false));
        scoreList.add(new ScoreItem(SL, "PAK", "120/3", ENG, "IND", "253", true));
        scoreList.add(new ScoreItem(SL, "PAK", "120/3", ENG, "IND", "253", false));
        scoreList.add(new ScoreItem(SL, "PAK", "120/3", ENG, "IND", "253", true));



    }


    private static final String SL = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Flag_of_Sri_Lanka.svg/1920px-Flag_of_Sri_Lanka.svg.png";
    private static final String IND = "https://upload.wikimedia.org/wikipedia/en/thumb/4/41/Flag_of_India.svg/383px-Flag_of_India.svg.png";
    private static final String NZ = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/Silver_fern_flag.svg/1200px-Silver_fern_flag.svg.png";
    private static final String AUS = "https://upload.wikimedia.org/wikipedia/en/thumb/b/b9/Flag_of_Australia.svg/800px-Flag_of_Australia.svg.png";
    private static final String WI = "https://upload.wikimedia.org/wikipedia/en/6/65/West_indies_cricket_board_flag.png";
    private static final String ENG = "https://upload.wikimedia.org/wikipedia/en/thumb/b/be/Flag_of_England.svg/1280px-Flag_of_England.svg.png";
    private static final String PAK = "https://4.bp.blogspot.com/-onFMF0ssNek/WFZWMm5kG6I/AAAAAAAAAkc/tDOuQ9TC5zMz4H6NJrFixdwjWrlE29dpACLcB/s1600/Logo%2Band%2Bcolours%2BPakistan%2527s%2Bcricket%2Bteam%2527s.jpg";

}
