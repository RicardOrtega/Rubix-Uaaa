package com.example.rubix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Biblioteca extends AppCompatActivity {

    private TabLayout tablayout;
    private ViewPager viewPager;
    private TabItem tab1, tab2, tab3;

    public PagerAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biblioteca);

        tablayout = (TabLayout) findViewById(R.id.tablayout);
        tab1 = (TabItem) findViewById(R.id.Tab1);
        tab2 = (TabItem) findViewById(R.id.Tab2);
        tab3 = (TabItem) findViewById(R.id.Tab3);
        viewPager = findViewById(R.id.ViewPage);
        pagerAdapter = new PageAdapter(getSupportFragmentManager(), tablayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);

        tablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0) {
                    pagerAdapter.notifyDataSetChanged();
                    Button Next = findViewById(R.id.Button_Tab1);
                    View.OnClickListener btnlistener = new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent Btn = new Intent(Biblioteca.this,Scrumbler.class);
                            startActivity(Btn);
                        }

                    };
                    Next.setOnClickListener(btnlistener);
                } else if (tab.getPosition() == 1) {
                    pagerAdapter.notifyDataSetChanged();

                    Button Next = findViewById(R.id.Button_Tab2);
                    View.OnClickListener btnlistener = new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent Btn = new Intent(Biblioteca.this,Scrumbler.class);
                            startActivity(Btn);
                        }

                    };
                    Next.setOnClickListener(btnlistener);

                } else if (tab.getPosition() == 2) {
                    pagerAdapter.notifyDataSetChanged();

                    Button Next = findViewById(R.id.Button_Tab3);
                    View.OnClickListener btnlistener = new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent BTn = new Intent(Biblioteca.this,Scrumbler.class);
                            startActivity(BTn);
                        }

                    };
                    Next.setOnClickListener(btnlistener);

                }
            }


            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout));


    }




}
