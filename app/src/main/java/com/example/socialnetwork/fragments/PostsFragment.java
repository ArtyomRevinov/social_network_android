package com.example.socialnetwork.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socialnetwork.R;
import com.example.socialnetwork.adapters.PostRecyclerViewAdapter;
import com.example.socialnetwork.entity.Post;

import java.util.ArrayList;
import java.util.List;

public class PostsFragment extends Fragment {

    View view;

    private List<Post> postList;

    public PostsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.posts_fragment, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.posts_recyclerview);
        PostRecyclerViewAdapter recyclerViewAdapter = new PostRecyclerViewAdapter(getContext(), postList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        postList = new ArrayList<>();
        postList.add(new Post("There is something humbling about mountains. Maybe it’s their tall and grandiose appearance" +
                " or the initial intimidation when you cast your eyes on it. But ultimately, the most humbling part is the sense of " +
                "accomplishment that you get after climbing one. The feeling of achievement, appreciation for the journey, and the chance" +
                " to be outdoors. In no particular order, here’s a list of the best mountain quotes to hopefully inspire you to seize your" +
                " days and lead a life of adventure.", R.drawable.big_mountain));
        postList.add(new Post("There is something humbling about mountains. Maybe it’s their tall and grandiose appearance" +
                " or the initial intimidation when you cast your eyes on it. But ultimately, the most humbling part is the sense of " +
                "accomplishment that you get after climbing one. The feeling of achievement, appreciation for the journey, and the chance" +
                " to be outdoors. In no particular order, here’s a list of the best mountain quotes to hopefully inspire you to seize your" +
                " days and lead a life of adventure.", R.drawable.big_mountain));
        postList.add(new Post("There is something humbling about mountains. Maybe it’s their tall and grandiose appearance" +
                " or the initial intimidation when you cast your eyes on it. But ultimately, the most humbling part is the sense of " +
                "accomplishment that you get after climbing one. The feeling of achievement, appreciation for the journey, and the chance" +
                " to be outdoors. In no particular order, here’s a list of the best mountain quotes to hopefully inspire you to seize your" +
                " days and lead a life of adventure.", R.drawable.big_mountain));
    }
}
