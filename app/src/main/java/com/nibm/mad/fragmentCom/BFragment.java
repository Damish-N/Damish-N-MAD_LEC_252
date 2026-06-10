package com.nibm.mad.fragmentCom;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.nibm.mad.R;

public class BFragment extends Fragment {


    TextView txtMessage;

    public BFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    public void onViewCreated(@NonNull View view,
                              Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        txtMessage = view.findViewById(R.id.textViewFragB);
    }

    public void updateText(String message) {
        txtMessage.setText(message);
    }
}