package com.nibm.mad.fragmentCom;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.nibm.mad.R;

public class AFragment extends Fragment {

    OnMessageSendListener listener;

    public AFragment() {
        // Required empty public constructor
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        listener = (OnMessageSendListener) context;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    public void onViewCreated(@NonNull View view,
                              Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        Button btnSend = view.findViewById(R.id.btnA);

//        btnSend.setOnClickListener(v -> {
//            listener.sendMessage("Hello from Fragment A");
//        });

        btnSend.setOnClickListener(v -> {

            BFragment fragmentB =
                    (BFragment)getParentFragmentManager()
                            .findFragmentById(R.id.fragmentLay2);

            fragmentB.updateText(
                    "Hello from Fragment A");
        });
    }

    public interface OnMessageSendListener {
        void sendMessage(String message);
    }
}