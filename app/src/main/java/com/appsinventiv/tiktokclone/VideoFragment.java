package com.appsinventiv.tiktokclone;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.widget.VideoView;

import com.danikula.videocache.HttpProxyCacheServer;

public class VideoFragment extends Fragment {
    Context context;
    int position;
    VideoView videoView;
    private boolean isVisible;

    MediaPlayer mediaPlayer;
    ProgressBar progress;

    public VideoFragment() {
    }

    @SuppressLint("ValidFragment")
    public VideoFragment(Context context, int position, int size) {
        this.context = context;
        this.position = position;

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.video_fragment, null);

        progress = rootView.findViewById(R.id.progress);
        videoView = rootView.findViewById(R.id.videoView);
        videoView.setVideoPath(MainActivity.arrayLists.get(position).getVideoUrl());
//        videoView.start();
        progress.setVisibility(View.VISIBLE);
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mediaPlayer = mp;
//                mediaPlayer.start();
                videoView.start();
                progress.setVisibility(View.GONE);
            }
        });


        return rootView;

    }


    @Override
    public void onResume() {
        super.onResume();


    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;

    }
}
