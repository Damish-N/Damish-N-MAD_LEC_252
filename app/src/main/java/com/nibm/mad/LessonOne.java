package com.nibm.mad;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LessonOne extends AppCompatActivity {


    Button btnDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one);

        btnDemo = findViewById(R.id.demo);

        btnDemo.setOnClickListener(v ->
                Toast.makeText(this,
                        "Button Clicked!",
                        Toast.LENGTH_SHORT).show());
    }
}