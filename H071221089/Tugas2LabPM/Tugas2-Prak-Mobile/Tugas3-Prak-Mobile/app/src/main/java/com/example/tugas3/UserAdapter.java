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

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

private final ArrayList<User> users;

    public UserAdapter(ArrayList<User> users) {
        this.users = users;
    }

    @NonNull
    @Override
    public UserAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.ViewHolder holder, int position) {
        User user = users.get(position);

        holder.tvUsername.setText(user.getUsername());
        holder.tvCaption.setText(user.getCaption());
        holder.ivProfile.setImageResource(user.getProfile());
        holder.ivPost.setImageResource(user.getPost());
        holder.profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), SgActivity.class);
                intent.putExtra(SgActivity.SG_DATA, user);
                holder.itemView.getContext().startActivity(intent);
            }
        });
        holder.tvUsername.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), ProfileActivity.class);
                intent.putExtra(ProfileActivity.SG_DATA, user);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return users.size();
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
