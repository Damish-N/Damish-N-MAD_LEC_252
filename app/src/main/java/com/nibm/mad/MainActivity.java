package com.nibm.mad;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.nibm.asyncTasks.AsyncTaskExample;
import com.nibm.mad.recyclerView.RecyclerViewExm;

public class MainActivity extends AppCompatActivity {
    Button btnLesson1, btnLesson2, btnLesson3, btnLesson3_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLesson1 = findViewById(R.id.btnLesson1);
        btnLesson2 = findViewById(R.id.btnLesson2);
        btnLesson3 = findViewById(R.id.btnLesson3);
        btnLesson3_1 = findViewById(R.id.btnLesson3_1);


        btnLesson1.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, LessonOne.class)));

        btnLesson2.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, LessonTwo.class)));

        btnLesson3.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, LessonThree.class)));

        btnLesson3_1.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, AsyncTaskExample.class)));



    }

//    @Override
//    protected void onStart() {
//        super.onStart();
////        Log.d("Lifecycle", "onStart");
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.d("Lifecycle", "onResume");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.d("Lifecycle", "onPause");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.d("Lifecycle", "onStop");
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Log.d("Lifecycle", "onRestart");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.d("Lifecycle", "onDestroy");
//    }
}