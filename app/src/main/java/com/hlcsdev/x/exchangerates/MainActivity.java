package com.hlcsdev.x.exchangerates;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.DatePicker;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    DatePicker datePicker;
    String date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // Календарь
        datePicker = (DatePicker) findViewById(R.id.datePicker);

        Calendar today = Calendar.getInstance();

        // Установка даты
        datePicker.init(today.get(Calendar.YEAR), today.get(Calendar.MONTH), today.get(Calendar.DAY_OF_MONTH), null);
    }

    // Кнопка
    public void buttonClick(View view) {

        // Получение даты
        int dayOfMonth = datePicker.getDayOfMonth();
        int monthOfYear = datePicker.getMonth();
        int year = datePicker.getYear();

        String day;
        if (dayOfMonth < 10) day = "0" + dayOfMonth;
        else day = String.valueOf(dayOfMonth);

        monthOfYear++;
        String month;
        if (monthOfYear < 10) month = "0" + monthOfYear;
        else month = String.valueOf(monthOfYear);

        date = day + "/" + month + "/" + year; // Выбранная дата

        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("date", date);
        startActivity(intent);
    }


}
