package com.example.observerschosen.GUI.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.observerschosen.GUI.Items.AdapterItems.ChatMessageItem;
import com.example.observerschosen.R;

import java.util.LinkedList;

public class ChatMessageAdapter extends RecyclerView.Adapter<ChatMessageAdapter.ChatMessageViewHolder>{

    private final LinkedList<ChatMessageItem> mLocationList;
    private final LayoutInflater mInflater;

    class ChatMessageViewHolder extends RecyclerView.ViewHolder {
        public TextView AnotherPlayerName;
        public TextView AnotherPlayerChatMessage;
        public TextView PlayerChatMessage;
        private final Context context;
        final ChatMessageAdapter mAdapter;


        public ChatMessageViewHolder(View itemView, ChatMessageAdapter adapter) {
            super(itemView);
            context= itemView.getContext();
            AnotherPlayerChatMessage = itemView.findViewById(R.id.MessageFromAnother);
            AnotherPlayerName = itemView.findViewById(R.id.messageSender);
            PlayerChatMessage = itemView.findViewById(R.id.PlayerMessage);
            this.mAdapter = adapter;
        }
    }

    public ChatMessageAdapter(Context context, LinkedList<ChatMessageItem> projectList) {
        mInflater = LayoutInflater.from(context);
        this.mLocationList = projectList;
    }

    @Override
    public ChatMessageAdapter.ChatMessageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(
                R.layout.item_chatmessage, parent, false);
        return new ChatMessageAdapter.ChatMessageViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(ChatMessageAdapter.ChatMessageViewHolder holder, int position) {
        ChatMessageItem current = mLocationList.get(position);
        String PlayerName = "Player"; //TODO: retrieve from mainviewModel;
        if (current.getSenderName().equals(PlayerName)){
            holder.AnotherPlayerName.setVisibility(View.GONE);
            holder.AnotherPlayerChatMessage.setVisibility(View.GONE);
            holder.PlayerChatMessage.setVisibility(View.VISIBLE);
            holder.PlayerChatMessage.setText(current.getMessage());
        }else{
            holder.AnotherPlayerName.setVisibility(View.VISIBLE);
            holder.AnotherPlayerName.setText(current.getSenderName());
            holder.AnotherPlayerChatMessage.setVisibility(View.VISIBLE);
            holder.AnotherPlayerChatMessage.setText(current.getMessage());
            holder.PlayerChatMessage.setVisibility(View.GONE);
        }




    }


    @Override
    public int getItemCount() {
        return mLocationList.size();
    }







}
