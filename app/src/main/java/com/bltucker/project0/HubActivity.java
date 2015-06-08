package com.bltucker.project0;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class HubActivity extends Activity {

    @InjectView(R.id.spotify_streamer)
    Button spotifyButton;

    @InjectView(R.id.scores_app)
    Button scoresButton;

    @InjectView(R.id.library_app)
    Button libraryButton;

    @InjectView(R.id.build_it_bigger)
    Button buildItBiggerButton;

    @InjectView(R.id.bacon_reader)
    Button baconReaderButton;

    @InjectView(R.id.capstone)
    Button capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hub);
        ButterKnife.inject(this);
        setupButtonListeners();
    }


    private void setupButtonListeners() {

        spotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToastMessage(getString(R.string.launch_spotify));
            }
        });

        scoresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToastMessage(getString(R.string.launch_scores));
            }
        });

        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToastMessage(getString(R.string.launch_library));
            }
        });

        buildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToastMessage(getString(R.string.launch_build_it_bigger));
            }
        });

        baconReaderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToastMessage(getString(R.string.launch_bacon_reader));
            }
        });

        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayToastMessage(getString(R.string.launch_capstone));
            }
        });
    }


    private void displayToastMessage(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}
