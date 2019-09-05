package com.example.srilankacricketappv1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.EditorInfo;
import android.widget.SearchView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

import fragment.ContactFragment;
import fragment.FaceBookFragment;
import fragment.Home;
import fragment.PollingFragment;
import fragment.SearchFragment;
import fragment.TwitterFragment;
import fragment.VideoGalleryFragment;
import fragment.WebcastFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private String TAG = MainActivity.class.getSimpleName();

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // FloatingActionButton fab = findViewById(R.id.fab);
////        fab.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
////                        .setAction("Action", null).show();
////            }
////        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Home()).commit();

        intent = getIntent();
        // gets the previously created intent
        if (intent != null) {
            if (intent.hasExtra("Facebook")) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new FaceBookFragment()).commit();

            } else if (intent.hasExtra("Twitter")) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new TwitterFragment()).commit();
            }

        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        MenuItem searchItem = menu.findItem(R.id.action_toolbarsearch);
        SearchView searchView = (SearchView) searchItem.getActionView();

        searchView.setImeOptions(EditorInfo.IME_ACTION_DONE);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Log.i(TAG, "onQueryTextSubmit: query->" + query);
                if(query.equals("WorldCup")) {
                    Intent splash = new Intent(MainActivity.this, SearchActivity.class);
                    startActivity(splash);
                }else{
                    Intent splash = new Intent(MainActivity.this, SearchNotFoundActivity.class);
                    startActivity(splash);
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                Log.i(TAG, "onQueryTextSubmit: query->" + newText);
                return false;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        } else if (id == R.id.action_toolbarsearch) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SearchFragment()).commit();
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        switch (id) {
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Home()).commit();
                break;
            case R.id.nav_latest_news:
                break;
            case R.id.nav_video_gallery:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new VideoGalleryFragment()).commit();
                break;
            case R.id.nav_Live_webcast:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new WebcastFragment()).commit();
                break;
            case R.id.nav_twitter:
                Intent splash1 = new Intent(MainActivity.this, LoadingActivity.class);
                splash1.putExtra("Twitter", "Twitter");
                startActivity(splash1);
                break;
            case R.id.nav_poling:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new PollingFragment()).commit();
                break;
            case R.id.nav_facebook:
                Intent splash = new Intent(MainActivity.this, LoadingActivity.class);
                splash.putExtra("Facebook", "Facebook");
                startActivity(splash);
                break;
            case R.id.nav_contact_us:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ContactFragment()).commit();
                break;
            case R.id.nav_share:
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "Try out our new application \n https://play.google.com/store/apps/details?id=com.app.slcradiogd&hl=en");
                sendIntent.setType("text/plain");
                startActivity(Intent.createChooser(sendIntent, getResources().getText(R.string.user_share_string)));

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
