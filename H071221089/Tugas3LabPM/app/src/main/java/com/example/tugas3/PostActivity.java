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

public class PostActivity extends AppCompatActivity {

    private ImageView profile, post;
    private TextView username, caption;

    User userpost;

    public static final String SG_DATA = "data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_post);

        profile = findViewById(R.id.profile);
        username = findViewById(R.id.username);
        post = findViewById(R.id.post);
        caption = findViewById(R.id.caption);

        userpost = getIntent().getParcelableExtra(SG_DATA);
        profile.setImageResource(userpost.getProfile());
        username.setText(userpost.getUsername());
        post.setImageResource(userpost.getPost());
        caption.setText(userpost.getCaption());

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PostActivity.this, SgActivity.class);
                intent.putExtra(SgActivity.SG_DATA, userpost);
                startActivity(intent);
            }
        });

        username.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PostActivity.this, ProfileActivity.class);
                intent.putExtra(ProfileActivity.SG_DATA, userpost);
                startActivity(intent);
            }
        });

    }
}