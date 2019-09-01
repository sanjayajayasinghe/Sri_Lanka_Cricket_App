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

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.bumptech.glide.Glide;
import com.example.srilankacricketappv1.R;

import java.io.ByteArrayOutputStream;


public class PollingFragment extends Fragment {

    ImageView country1;
    ImageView country2;
    Button county1Thumb;
    Button county2Thumb;
    ProgressBar progressBar;

    private static final String TAG = "Polling";

    public PollingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_polling, container, false);
        country1 = view.findViewById(R.id.country1_logo);
        country2 = view.findViewById(R.id.country2_logo);
        county1Thumb = view.findViewById(R.id.country1_thumb);
        county2Thumb = view.findViewById(R.id.country2_thumb);
        progressBar = view.findViewById(R.id.progressBar);

        Glide.with(view.getContext()).load(SL).asBitmap().into(country1);
        Glide.with(view.getContext()).load(NZ).asBitmap().into(country2);

        addClickListners();

        return view;
    }

    private void addClickListners(){

        county2Thumb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ( county2Thumb.getBackground().getConstantState()==getResources().getDrawable(R.drawable.blackthumb).getConstantState())
                {
                    county2Thumb.setBackgroundResource(R.drawable.bluethumb);
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        progressBar.setProgress(progressBar.getProgress() + 10,true);
                    }
                }else{
                    county2Thumb.setBackgroundResource(R.drawable.blackthumb);
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        progressBar.setProgress(progressBar.getProgress() - 10,true);
                    }
                }
            }
        });

        county1Thumb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if ( county1Thumb.getBackground().getConstantState()==getResources().getDrawable(R.drawable.blackthumb).getConstantState())                {
                    county1Thumb.setBackgroundResource(R.drawable.bluethumb);
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        progressBar.setProgress(progressBar.getProgress() - 10,true);
                    }
                }else{
                    county1Thumb.setBackgroundResource(R.drawable.blackthumb);
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        progressBar.setProgress(progressBar.getProgress() + 10,true);
                    }
                }


            }
        });
    }



    private static final String SL = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Flag_of_Sri_Lanka.svg/1920px-Flag_of_Sri_Lanka.svg.png";
    private static final String IND = "https://upload.wikimedia.org/wikipedia/en/thumb/4/41/Flag_of_India.svg/383px-Flag_of_India.svg.png";
    private static final String NZ = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/Silver_fern_flag.svg/1200px-Silver_fern_flag.svg.png";


}
