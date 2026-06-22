package com.nibm.asyncTasks;

import android.os.AsyncTask;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class DownloadTask extends AsyncTask<Void,Integer,String> {
    Button btnStart;
    ProgressBar progressBar;
    TextView txtStatus;

    public DownloadTask(Button btnStart, ProgressBar progressBar, TextView txtStatus) {
        this.btnStart = btnStart;
        this.progressBar = progressBar;
        this.txtStatus = txtStatus;
    }

    @Override
    protected void onPreExecute() {
        txtStatus.setText("Starting...");
        progressBar.setProgress(0);
    }

    @Override
    protected String doInBackground(Void... voids) {

        for (int i = 1; i <= 100; i++) {

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            publishProgress(i);
        }

        return "Download Complete!";
    }

    @Override
    protected void onProgressUpdate(Integer... values) {

        progressBar.setProgress(values[0]);
        txtStatus.setText("Loading " + values[0] + "%");
    }

    @Override
    protected void onPostExecute(String result) {

        txtStatus.setText(result);
    }

}
