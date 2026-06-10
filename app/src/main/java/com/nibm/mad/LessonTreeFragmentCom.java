package com.nibm.mad;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.nibm.mad.fragmentCom.AFragment;
import com.nibm.mad.fragmentCom.BFragment;
import com.nibm.mad.fragments.HomeFragment;

public class LessonTreeFragmentCom extends AppCompatActivity  implements AFragment.OnMessageSendListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lesson_tree_fragment_com);

        getSupportActionBar().hide();

        AFragment aFragment =
                new AFragment();
        BFragment bFragment =
                new BFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(
                        R.id.fragmentLay1,
                        aFragment
                )
                .commit();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(
                        R.id.fragmentLay2,
                        bFragment
                )
                .commit();

    }

    @Override
    public void sendMessage(String message) {
        BFragment fragmentB =
                (BFragment)getSupportFragmentManager()
                        .findFragmentById(R.id.fragmentLay2);

        fragmentB.updateText(message);
    }
}