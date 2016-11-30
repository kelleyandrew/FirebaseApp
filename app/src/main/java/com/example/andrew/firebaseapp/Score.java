package com.example.andrew.firebaseapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Score extends Activity implements View.OnClickListener {

    private Button buttonUpdateScore;
    private Button buttonLogout;
    private EditText editTextScore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        //Link objects to UI
        buttonUpdateScore = (Button) findViewById(R.id.buttonUpdateScore);
        buttonLogout = (Button) findViewById(R.id.buttonLogout);
        editTextScore = (EditText) findViewById(R.id.editTextScore);

        buttonUpdateScore.setOnClickListener(this);
        buttonLogout.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {

    }
}
