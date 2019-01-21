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
import com.example.socialnetwork.adapters.ContactRecyclerViewAdapter;
import com.example.socialnetwork.entity.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactsFragment extends Fragment {

    View view;

    private List<Contact> contacts;

    public ContactsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.contacts_fragment, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.contacts_recyclerview);

        ContactRecyclerViewAdapter recyclerViewAdapter =
                new ContactRecyclerViewAdapter(getContext(), contacts);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        contacts = new ArrayList<>();
        contacts.add(new Contact("Jessey Pinkman", R.drawable.ic_person));
        contacts.add(new Contact("Walter White", R.drawable.ic_person));
        contacts.add(new Contact("Gustavo Fring", R.drawable.ic_person));
        contacts.add(new Contact("Skyler White", R.drawable.ic_person));
        contacts.add(new Contact("Saul Goodman", R.drawable.ic_person));
        contacts.add(new Contact("Ted Beneke", R.drawable.ic_person));
        contacts.add(new Contact("Hank Shreider", R.drawable.ic_person));
    }
}
