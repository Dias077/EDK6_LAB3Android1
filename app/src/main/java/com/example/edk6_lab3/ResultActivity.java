package com.example.edk6_lab3;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Переменная доступа к компоненту окна с инициализацией
        EditText editText = findViewById(R.id.editText);

        // Запрет на редактирование в компоненте "editText"
        editText.setKeyListener(null);

        // Очистка данных в компоненте "editText"
        editText.setText("");

        // Добавление данных в компонент "editText"
        editText.append(String.format("%s %s \n", getString(R.string.Вы), getIntent().getStringExtra("fio")));
        editText.append(String.format("%s %s \n", getString(R.string.Ваш_пол), getIntent().getStringExtra("gender")));
        editText.append(String.format("%s %s \n", getString(R.string.Любимая_еда), getIntent().getStringExtra("food")));
        editText.append(String.format("%s %s \n", getString(R.string.Вам_нравится), getIntent().getStringExtra("exercise")));
    }

    // МЕТОД ДЛЯ КНОПКИ НАЗАД
    public void onBack(View v) {
        setResult(RESULT_OK);
        finish();
    }

    // МЕТОД ДЛЯ КНОПКИ ВЫХОДА
    public void onExit(View v) {
        finishAffinity();
        System.exit(0);
    }
}
