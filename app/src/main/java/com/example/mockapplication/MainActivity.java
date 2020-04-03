package com.example.mockapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openAcademics(View view) {
        Intent intent = new Intent(this, openAcademics.class);
        startActivity(intent);
    }

    public void Health(View view) {
        Intent intent = new Intent(this, Health.class);
        startActivity(intent);
    }
    public void Schedule(View view) {
        Intent intent = new Intent(this, Schedule.class);
        startActivity(intent);
    }
}
