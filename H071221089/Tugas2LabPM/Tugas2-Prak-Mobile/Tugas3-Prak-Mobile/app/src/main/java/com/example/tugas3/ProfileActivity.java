package com.example.tugas3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProfileActivity extends AppCompatActivity {

    private ImageView profile, post;
    private TextView username, follower, following;

    User userprofile;

    public static final String SG_DATA = "data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);

        profile = findViewById(R.id.profile);
        username = findViewById(R.id.username);
        follower = findViewById(R.id.follower);
        following = findViewById(R.id.following);
        post = findViewById(R.id.post);

        userprofile = getIntent().getParcelableExtra(SG_DATA);
        profile.setImageResource(userprofile.getProfile());
        username.setText(userprofile.getUsername());
        follower.setText(userprofile.getFollower());
        following.setText(userprofile.getFollowing());
        post.setImageResource(userprofile.getPost());

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, SgActivity.class);
                intent.putExtra(SgActivity.SG_DATA, userprofile);
                startActivity(intent);
            }
        });

        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, PostActivity.class);
                intent.putExtra(PostActivity.SG_DATA, userprofile);
                startActivity(intent);
            }
        });

    }
}