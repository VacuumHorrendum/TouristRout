package com.example.touristroute;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void onClickOne(View view) {
        ImageView imageView = findViewById(R.id.imageView3);
        imageView.setImageResource(R.drawable.one);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Мариинский театр. Театр оперы и балета в Санкт-Петербурге, один из ведущих музыкальных театров России и мира.");
    }
    public void onClickTwo(View view) {
        ImageView imageView = findViewById(R.id.imageView3);
        imageView.setImageResource(R.drawable.two);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Юсуповский дворец на Мойке. Бывший дворец в Санкт-Петербурге, памятник истории и культуры федерального значения.");
    }
    public void onClickThree(View view) {
        ImageView imageView = findViewById(R.id.imageView3);
        imageView.setImageResource(R.drawable.three);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Исаакиевский собор. Крупнейший храм в Санкт-Петербурге. Расположен на Исаакиевской площади.");
    }
    public void onClickFour(View view) {
        ImageView imageView = findViewById(R.id.imageView3);
        imageView.setImageResource(R.drawable.four);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Медный всадник. Памятник Петру I на Сенатской площади в Санкт-Петербурге работы скульптора Фальконе.");
    }
    public void onClickFive(View view) {
        ImageView imageView = findViewById(R.id.imageView3);
        imageView.setImageResource(R.drawable.five);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Кунсткамера. Первый музей в России, учреждённый императором Петром I в Санкт-Петербурге.");
    }
    public void onClickSix(View view) {
        ImageView imageView = findViewById(R.id.imageView3);
        imageView.setImageResource(R.drawable.six);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Эрмитаж. Музей изобразительного и прикладного искусства, расположенный в городе Санкт-Петербурге Российской Федерации.");
    }
    public void onClickSeven(View view) {
        ImageView imageView = findViewById(R.id.imageView3);
        imageView.setImageResource(R.drawable.seven);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Спас на Крови. Православный мемориальный храм во имя Воскресения Христова сооружён в память Александра II.");
    }
    public void onClickEight(View view) {
        ImageView imageView = findViewById(R.id.imageView3);
        imageView.setImageResource(R.drawable.eight);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Михайловский дворец. Дворец великого князя Михаила Павловича, четвёртого сына Павла I и Марии Фёдоровны.");
    }
    public void onClickNine(View view) {
        ImageView imageView = findViewById(R.id.imageView3);
        imageView.setImageResource(R.drawable.nine);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Михайловский замок. Бывший императорский дворец в центре Санкт-Петербурга по адресу Садовая ул., № 2.");
    }

}
