package fragment;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.srilankacricketappv1.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

import org.w3c.dom.Text;

import java.util.List;


public class ContactFragment extends Fragment implements OnMapReadyCallback {


    TextView email;
    TextView contactNumber;
    TextView web;
    MapFragment mapFragment;

    public ContactFragment() {
        // Required empty public

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact, container, false);
        email = view.findViewById(R.id.email);
        contactNumber = view.findViewById(R.id.contactNumber);
        web = view.findViewById(R.id.web);
//        mapFragment = view.findViewById(R.id.map);
        addClickListners();


        return view;
    }

    private void addClickListners() {
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                String[] recipients = {email.getText().toString()};
                intent.putExtra(Intent.EXTRA_EMAIL, recipients);
                intent.putExtra(Intent.EXTRA_SUBJECT, "Subject text here...");
                intent.putExtra(Intent.EXTRA_TEXT, "Body of the content here...");
                intent.putExtra(Intent.EXTRA_CC, "mailcc@gmail.com");
                intent.setType("text/html");
                intent.setPackage("com.google.android.gm");
                startActivity(Intent.createChooser(intent, "Send mail"));
            }
        });

        contactNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + contactNumber.getText()));
                startActivity(intent);
            }
        });

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url =web.getText().toString();
                if (!url.startsWith("http://") && !url.startsWith("https://")) {
                    url = "http://" + url;
                }
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(browserIntent);
            }
        });
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

    }
}
