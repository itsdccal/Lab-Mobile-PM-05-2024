package com.example.tugas3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SgActivity extends AppCompatActivity {
    private TextView username;
    private ImageView profile;
    private LinearLayout sg;

    User usersg;

    public static final String SG_DATA = "data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sg);

        username = findViewById(R.id.username);
        profile = findViewById(R.id.profile);
        sg = findViewById(R.id.storygram);

        usersg = getIntent().getParcelableExtra(SG_DATA);
        username.setText(usersg.getUsername());
        profile.setImageResource(usersg.getProfile());
        sg.setBackgroundResource(usersg.getSg());

        username.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SgActivity.this, ProfileActivity.class);
                intent.putExtra(ProfileActivity.SG_DATA, usersg);
                startActivity(intent);  
            }
        });


    }
}