package com.example.studentdb;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        SQLiteDatabase db = getBaseContext().openOrCreateDatabase("student.db", MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS students (id INTEGER, name TEXT, address TEXT, phone TEXT)");
    }
}
