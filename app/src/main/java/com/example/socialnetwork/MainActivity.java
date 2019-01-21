package com.example.socialnetwork;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import com.example.socialnetwork.adapters.ViewPagerAdapter;
import com.example.socialnetwork.fragments.MessagesFragment;
import com.example.socialnetwork.fragments.ContactsFragment;
import com.example.socialnetwork.fragments.PostsFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.tab_layout);
        ViewPager viewPager = findViewById(R.id.view_pager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new MessagesFragment(),
                getApplicationContext().getString(R.string.messages_category));
        adapter.addFragment(new PostsFragment(),
                getApplicationContext().getString(R.string.posts_category));
        adapter.addFragment(new ContactsFragment(),
                getApplicationContext().getString(R.string.contacts_category));

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_chat_bubble);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_list);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_community);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);
    }
}
