package fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.srilankacricketappv1.R;


public class FaceBookFragment extends Fragment {

    private WebView webView;

    public FaceBookFragment() {

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_face_book, container, false);
        webView = view.findViewById(R.id.facebookWeb);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.facebook.com/srilankacricket/");
        return view;
    }

}
