package com.nibm.mad.recyclerView;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.nibm.dto.Student;
import com.nibm.mad.R;

import java.util.ArrayList;

public class RecyclerViewExm extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<Student> students;

    StudentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recycler_view_exm);

        recyclerView = findViewById(R.id.recyclerView);

        students = new ArrayList<>();

        students.add(new Student("John"));
        students.add(new Student("Mary"));
        students.add(new Student("David"));
        students.add(new Student("Alex"));
        students.add(new Student("Emma"));
        students.add(new Student("Chris"));

        adapter = new StudentAdapter(students);

        recyclerView.setLayoutManager(
                new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);
    }
}