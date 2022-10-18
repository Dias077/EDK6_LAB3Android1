package com.example.edk6_lab3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class SecondActivity extends AppCompatActivity {


    // Локальные переменные для доступа к компонентам окна
    private EditText editText;
    private CheckBox checkBox;
    private RadioGroup radioGroup;
    private RadioButton selectRadioButton;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Инициализация переменных доступа к компонентам окна
        editText =   findViewById(R.id.editText);
        checkBox =   findViewById(R.id.checkBox);
        radioGroup = findViewById(R.id.radioGroup);

        spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.arrays, R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    // МЕТОД ДЛЯ КНОПКИ "ИТОГО"
    public void onNext(View v) {
        // Создание второго окна
        Intent intent = new Intent(SecondActivity.this, ResultActivity.class);

        selectRadioButton = findViewById(radioGroup.getCheckedRadioButtonId());

        // Подготовка параметров для второго окна
        intent.putExtra("fio", editText.getText().toString());
        intent.putExtra("gender", checkBox.isChecked() ? getString(R.string.Мужчина) : getString(R.string.Женщина));
        intent.putExtra("food", selectRadioButton.getText());
        intent.putExtra("exercise", spinner.getSelectedItem().toString());

        // Запуск второго окна
        startActivity(intent);
    }

    public void onBack(View v) {
        setResult(RESULT_OK);
        finish();
    }
}