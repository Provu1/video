package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;

    String videoUrl = "https://videocdn.bodybuilding.com/video/mp4/62000/62792m.mp4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView= findViewById(R.id.vv);

      //  videoView.setVideoURI();

        Uri uri = Uri.parse(videoUrl);

        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);




        // mediaController.setMediaPlayer(videoView);

       // videoView.setMediaController(mediaController);

        videoView.start();






    }
}