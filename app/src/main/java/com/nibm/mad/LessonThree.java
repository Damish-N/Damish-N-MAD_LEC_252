package com.nibm.mad;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.nibm.mad.fragments.HomeFragment;
import com.nibm.mad.fragments.ProfileFragment;

public class LessonThree extends AppCompatActivity {

    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lesson_three);

        getSupportActionBar().hide();

        button1 = findViewById(R.id.btnProfile);
        HomeFragment homeFragment =
                new HomeFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(
                        R.id.fragmentContainer,
                        homeFragment
                )
                .commit();

        button1.setOnClickListener(
                view -> {
                    ProfileFragment profileFragment =
                            new ProfileFragment();

                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(
                                    R.id.fragmentContainer,
                                    profileFragment
                            )
                            .addToBackStack("back")
                            .commit();
                }
        );

    }
}