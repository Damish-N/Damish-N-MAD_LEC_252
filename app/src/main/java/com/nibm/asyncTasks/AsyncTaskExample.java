package com.nibm.asyncTasks;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.nibm.mad.R;

public class AsyncTaskExample extends AppCompatActivity {

    Button btnStart;
    ProgressBar progressBar;
    TextView txtStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_async_task);

        btnStart = findViewById(R.id.btnStart);
        progressBar = findViewById(R.id.progressBar);
        txtStatus = findViewById(R.id.txtStatus);

        btnStart.setOnClickListener(v -> {
            new DownloadTask(btnStart,progressBar,txtStatus).execute();
        });

    }
}