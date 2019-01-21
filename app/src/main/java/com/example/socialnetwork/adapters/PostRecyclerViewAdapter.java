package com.example.socialnetwork.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.socialnetwork.R;
import com.example.socialnetwork.entity.Post;

import java.util.List;


public class PostRecyclerViewAdapter extends
        RecyclerView.Adapter<PostRecyclerViewAdapter.PostViewHolder> {

    private Context mContext;
    private List<Post> postList;

    public PostRecyclerViewAdapter(Context mContext, List<Post> postList) {
        this.mContext = mContext;
        this.postList = postList;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view;
        view = LayoutInflater.from(mContext)
                .inflate(R.layout.post_card, viewGroup, false);

        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder postViewHolder, int i) {

        postViewHolder.postText.setText(postList.get(i).getPostBody());
        postViewHolder.postImg.setImageResource(postList.get(i).getPhoto());

    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    static  class PostViewHolder extends RecyclerView.ViewHolder{

        private TextView postText;
        private ImageView postImg;

         PostViewHolder(@NonNull View itemView) {
            super(itemView);

            postText = itemView.findViewById(R.id.post_text);
            postImg = itemView.findViewById(R.id.post_img);
        }
    }
}
