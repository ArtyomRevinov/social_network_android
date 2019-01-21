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
import com.example.socialnetwork.entity.Message;

import java.util.List;

public class MessageRecyclerViewAdapter extends
        RecyclerView.Adapter<MessageRecyclerViewAdapter.MessageViewHolder> {

    private Context mContext;
    private List<Message> messageList;

    public MessageRecyclerViewAdapter(Context mContext, List<Message> messageList) {
        this.mContext = mContext;
        this.messageList = messageList;
    }

    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view;
        view = LayoutInflater.from(mContext)
                .inflate(R.layout.chat_card, viewGroup, false);

        return new MessageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder messageViewHolder, int i) {

        messageViewHolder.name.setText(messageList.get(i).getName());
        messageViewHolder.message.setText(messageList.get(i).getMessage());
        messageViewHolder.img.setImageResource(messageList.get(i).getPhoto());
    }

    @Override
    public int getItemCount() {
        return messageList.size();
    }

     static class MessageViewHolder extends RecyclerView.ViewHolder{

        private TextView name;
        private TextView message;
        private ImageView img;

         MessageViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.message_contactname);
            message = itemView.findViewById(R.id.latest_message);
            img = itemView.findViewById(R.id.img_contact);
        }
    }


}
