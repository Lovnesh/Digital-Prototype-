package com.example.mockapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Health extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);
    }

    public void openAcademics(View view) {
        Intent intent = new Intent(this, openAcademics.class);
        startActivity(intent);
    }

    public void Schedule(View view) {
        Intent intent = new Intent(this, Schedule.class);
        startActivity(intent);
    }

    public void main(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
