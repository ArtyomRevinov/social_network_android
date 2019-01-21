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
import com.example.socialnetwork.adapters.MessageRecyclerViewAdapter;
import com.example.socialnetwork.entity.Message;

import java.util.ArrayList;
import java.util.List;

public class MessagesFragment extends Fragment {

    View view;

    private List<Message> messageList;

    public MessagesFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.messages_fragment, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.chat_recyclerview);
        MessageRecyclerViewAdapter recyclerAdapter = new MessageRecyclerViewAdapter(getContext(), messageList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerAdapter);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        messageList = new ArrayList<>();
        messageList.add(new Message("Jessey Pinkman", "yo, wasap", R.drawable.ic_person));
        messageList.add(new Message("Walter White", "I'm not in danger, I am the danger", R.drawable.ic_person));
        messageList.add(new Message("Gale Boticer", "you have not chatted yet", R.drawable.ic_person));
        messageList.add(new Message("Gustavo Fring", "you have not chatted yet", R.drawable.ic_person));
        messageList.add(new Message("Hank Shreider", "you have not chatted yet", R.drawable.ic_person));
        messageList.add(new Message("Skyler White", "you have not chatted yet", R.drawable.ic_person));
        messageList.add(new Message("Jane Margolis", "you have not chatted yet", R.drawable.ic_person));
        messageList.add(new Message("Tuco Salamanca", "you have not chatted yet", R.drawable.ic_person));

    }
}
