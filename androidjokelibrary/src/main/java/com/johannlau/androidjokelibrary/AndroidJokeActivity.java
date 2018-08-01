package com.johannlau.androidjokelibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class AndroidJokeActivity extends AppCompatActivity {

    private TextView joke_text_view;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_joke_main_activity);

        joke_text_view = findViewById(R.id.joke_text_view);

        Intent intent = getIntent();

        String joke = "";
        String jokeIntent = getString(R.string.intent_extra);

        if(intent.hasExtra(jokeIntent)) {
            joke = intent.getStringExtra(jokeIntent);
        }

        joke_text_view.setText(joke);
    }
}

