package fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.srilankacricketappv1.R;

import androidx.fragment.app.Fragment;

public class VideoGalleryFragment  extends Fragment {
    public VideoGalleryFragment() {
        // Required empty public constructor
    }




    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_videogallery, container, false);
    }

}
