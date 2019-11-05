package com.appsinventiv.tiktokclone;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.danikula.videocache.CacheListener;
import com.danikula.videocache.HttpProxyCacheServer;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<VideoModel> arrayLists = new ArrayList<>();
    CustomViewPager viewpager;
    SliderAdapter sliderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        viewpager = findViewById(R.id.viewpager);
        arrayLists.clear();
        arrayLists.add(new VideoModel("https://firebasestorage.googleapis.com/v0/b/umefirebaseproject-a95c9.appspot.com/o/Videos%2F3fe105e6a7c98073?alt=media&token=8197570a-53f7-4ad1-95f8-626fe445d0f7"));
        arrayLists.add(new VideoModel("https://firebasestorage.googleapis.com/v0/b/umefirebaseproject-a95c9.appspot.com/o/Videos%2F3fdf6ee6700e9b1c?alt=media&token=0fc7c301-ff9e-48cd-ad63-58e695a6302f"));
        arrayLists.add(new VideoModel("https://firebasestorage.googleapis.com/v0/b/umefirebaseproject-a95c9.appspot.com/o/Videos%2F3febdc579d2cb3cb?alt=media&token=e4032b9c-64c8-4802-875f-459539928b2a"));
        arrayLists.add(new VideoModel("https://firebasestorage.googleapis.com/v0/b/umefirebaseproject-a95c9.appspot.com/o/Videos%2F3fe536ebc6c0d4b7?alt=media&token=cef99e27-4cfd-4868-9a71-a614e4d7be87"));
        arrayLists.add(new VideoModel("https://firebasestorage.googleapis.com/v0/b/umefirebaseproject-a95c9.appspot.com/o/Videos%2F3fedd099d7a2c27d?alt=media&token=d732d47f-58ea-4850-a697-2201920479c2"));
        arrayLists.add(new VideoModel("https://res.cloudinary.com/kartiksaraf/video/upload/v1564516308/github_MediaSliderView/demo_videos/video1_jetay3.mp4"));
        arrayLists.add(new VideoModel("https://res.cloudinary.com/kartiksaraf/video/upload/v1564516308/github_MediaSliderView/demo_videos/video2_sn3sek.mp4"));
        arrayLists.add(new VideoModel("https://res.cloudinary.com/kartiksaraf/video/upload/v1564516308/github_MediaSliderView/demo_videos/video3_jcrsb3.mp4"));
        arrayLists.add(new VideoModel("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"));
        arrayLists.add(new VideoModel("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4"));
        arrayLists.add(new VideoModel("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerBlazes.mp4"));
//        for (int i = 0; i < arrayLists.size(); i++) {
//            try{
//                String abc = arrayLists.get(i).getVideoUrl();
//                cashe(abc);
//            }catch (Exception e){
//
//            }
//            HttpProxyCacheServer proxy = ApplicationClass.getProxy(MainActivity.this);
//            proxy.registerCacheListener(MainActivity.this, arrayLists.get(i).getVideoUrl());
//            String proxyUrl = proxy.getProxyUrl(arrayLists.get(i).getVideoUrl());
//            arrayLists.get(i).setProxyUrl(proxyUrl);
//
//        }
        sliderAdapter = new SliderAdapter(getSupportFragmentManager(), this);

        viewpager.setAdapter(sliderAdapter);

        sliderAdapter.notifyDataSetChanged();


    }
//    public void cashe(String url1) {
//        try {
//            HttpProxyCacheServer proxy = ApplicationClass.getProxy(MainActivity.this);
//            URL url = new URL(proxy.getProxyUrl(url1));
//            InputStream inputStream = url.openStream();
//            int bufferSize = 1024;
//            byte[] buffer = new byte[bufferSize];
//            int length = 0;
//            while ((length = inputStream.read(buffer)) != -1) {
////Since we just need to kick start the prefetching, dont need to do anything here
////  or we can use ByteArrayOutputStream to write down the data to disk
//            }
//            inputStream.close();
//
//        } catch (Exception e) {
//
//        }
//    }
//    @Override
//    public void onCacheAvailable(File cacheFile, String url, int percentsAvailable) {
//    }
}
