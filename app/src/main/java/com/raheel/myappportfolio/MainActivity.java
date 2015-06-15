package com.raheel.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View view){
        String message = "This button will lauch my ";
        switch(view.getId()) {
            case R.id.spotify_streamer:
                message += "Spotify Streamer app.";
                break;
            case R.id.scores_app:
                message += "Scores app.";
                break;
            case R.id.library_app:
                message += "Library app.";
                break;
            case R.id.build_it_bigger:
                message += "Build It Bigger app.";
                break;
            case R.id.xyz_reader:
                message += "XYZ Reader app.";
                break;
            case R.id.capstone_my_own_app:
                message += "my Capstone app.";
                break;

        }
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }


}
