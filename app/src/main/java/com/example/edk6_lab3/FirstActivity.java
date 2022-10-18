package com.example.edk6_lab3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


    }

    public void onNext(View v) {
        // Создание второго окна
        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);

        // Запуск второго окна
        startActivity(intent);
    }

    // МЕТОД ДЛЯ КНОПКИ ВЫХОДА
    public void onExit(View v) {
        finishAffinity();
        System.exit(0);
    }
}
