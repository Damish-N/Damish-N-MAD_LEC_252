package com.nibm.mad;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.nibm.mad.layouts.ConstraintLayoutActivity;
import com.nibm.mad.layouts.FrameLayoutActivity;
import com.nibm.mad.layouts.LinearLayoutActivity;
import com.nibm.mad.layouts.RelativeLayoutActivity;

public class LessonTwo extends AppCompatActivity {

    Button btnLinear, btnConstraint, btnFrame, btnRelative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_two);

        btnLinear = findViewById(R.id.btnLinearLayout);
        btnConstraint = findViewById(R.id.btnConstrainLayout);
        btnFrame = findViewById(R.id.btnFrameLayout);
        btnRelative = findViewById(R.id.btnRelativeLayout);

        btnLinear.setOnClickListener(v ->
                startActivity(new Intent(this, LinearLayoutActivity.class)));

        btnConstraint.setOnClickListener(v ->
                startActivity(new Intent(this, ConstraintLayoutActivity.class)));

        btnFrame.setOnClickListener(v ->
                startActivity(new Intent(this, FrameLayoutActivity.class)));

        btnRelative.setOnClickListener(v ->
                startActivity(new Intent(this, RelativeLayoutActivity.class)));
    }
}