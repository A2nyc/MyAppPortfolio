package com.example.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user touches the button */
    public void spotifyStreamer(View view) {

        Toast.makeText(MainActivity.this, "This button will launch my Spotify Streamer APP!", Toast.LENGTH_SHORT).show();
    }

    public void scoresApp(View view) {

        Toast.makeText(MainActivity.this, "This button will launch my Scores APP!", Toast.LENGTH_SHORT).show();
    }

    public void libraryApp(View view) {

        Toast.makeText(MainActivity.this, "This button will launch my Library APP!", Toast.LENGTH_SHORT).show();
    }

    public void buildBigger(View view) {

        Toast.makeText(MainActivity.this, "This button will launch my Build it Bigger APP!", Toast.LENGTH_SHORT).show();
    }

    public void xyzReader(View view) {

        Toast.makeText(MainActivity.this, "This button will launch my XYZ Reader APP!", Toast.LENGTH_SHORT).show();
    }

    public void capStone(View view) {

        Toast.makeText(MainActivity.this, "This button will launch my Capstone APP!", Toast.LENGTH_SHORT).show();
    }
}
