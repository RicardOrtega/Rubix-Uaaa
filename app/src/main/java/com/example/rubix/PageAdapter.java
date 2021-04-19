package com.example.rubix;

import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    private int numbofTabs;

    public PageAdapter(FragmentManager fm,int numbofTabs) {
        super(fm);
        this.numbofTabs=numbofTabs;

    }


    @Override
    public Fragment getItem(int position) {


        switch (position){
            case 0:
                return new tab1();
            case 1:
                return new tab2();

            case 2:
                return new tab3();

            default:
                return null;


        }

    }

    @Override
    public int getCount() {

        return numbofTabs;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;


    }
}
