package com.hqyxjy.ldf.supercalendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.mytestlibrary.view.TestView;
import com.necer.ncalendar.calendar.MonthCalendar;
import com.necer.ncalendar.calendar.NCalendar;

public class TestActivity extends AppCompatActivity {
    private TestView myView;

    /**
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        myView = findViewById(R.id.myView);
    }

    public void kong(View view) {
        myView.kongXin();
    }

    public void shi(View view) {

        myView.shiXin();
    }

    public void green(View view) {

        myView.green();
    }
}
