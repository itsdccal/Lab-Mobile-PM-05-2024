package com.example.tugas3;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.ViewHolder> {

    private final ArrayList<User> story;

    public StoryAdapter(ArrayList<User> story) {
        this.story = story;
    }

    @NonNull
    @Override
    public StoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_story, parent, false);
        return new StoryAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryAdapter.ViewHolder holder, int position) {
        User currentstory = story.get(position);

        holder.ivProfile.setImageResource(currentstory.getProfile());
        holder.tvUsername.setText(currentstory.getUsername());
        holder.profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), SgActivity.class);
                intent.putExtra(SgActivity.SG_DATA, currentstory);
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return story.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvUsername, tvCaption;
        ImageView ivProfile, ivPost, profile;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvUsername = itemView.findViewById(R.id.username);
            tvCaption = itemView.findViewById(R.id.caption);
            ivProfile = itemView.findViewById(R.id.profile);
            ivPost = itemView.findViewById(R.id.post);
            profile = itemView.findViewById(R.id.profile);
        }
    }
}
