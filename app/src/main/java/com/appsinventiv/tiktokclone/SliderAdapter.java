package com.appsinventiv.tiktokclone;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/**
 * Created by AliAh on 21/02/2018.
 */

public class SliderAdapter extends FragmentPagerAdapter {
    Context context;
    LayoutInflater layoutInflater;
    int size;

    FragmentManager fm;

    @SuppressLint("WrongConstant")
    public SliderAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.fm = fm;
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        return new VideoFragment(context, position, MainActivity.arrayLists.size());
    }


    @Override
    public int getCount() {

        return MainActivity.arrayLists.size();
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
//        super.destroyItem(container, position, object);
        FragmentTransaction ft = fm.beginTransaction();
        ft.remove((Fragment) object);
        ft.commit();
    }
}
