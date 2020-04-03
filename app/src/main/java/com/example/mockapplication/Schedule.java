package com.example.mockapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Schedule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
    }

    public void main(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    public void openAcademics(View view) {
        Intent intent = new Intent(this, Schedule.class);
        startActivity(intent);
    }

    public void Health(View view) {
        Intent intent = new Intent(this, Health.class);
        startActivity(intent);
    }
}
