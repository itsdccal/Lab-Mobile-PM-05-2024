package com.example.tugas3;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_users;
    private RecyclerView rv_story;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        rv_users = findViewById(R.id.rv_users);
        rv_story = findViewById(R.id.rv_story);

        rv_users.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rv_users.setHasFixedSize(true);
        rv_story.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rv_story.setHasFixedSize(true);

        UserAdapter userAdapter = new UserAdapter(DataSource.users);
        StoryAdapter storyAdapter = new StoryAdapter(DataSource.users);

        rv_users.setAdapter(userAdapter);
        rv_story.setAdapter(storyAdapter);


    }
}