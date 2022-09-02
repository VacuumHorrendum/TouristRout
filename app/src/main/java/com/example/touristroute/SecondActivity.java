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

    int theatreOneCount = 0;
    int theatreTwoCount = 0;
    int theatreThreeCount = 0;
    int theatreFourthCount = 0;
    int theatreFifthCount = 0;
    int theatreSixthCount = 0;
    int theatreSeventhCount = 0;
    int theatreEigthsCount = 0;
    int theatreNineCount = 0;




    public void onClickOne(View view) {
        ImageView imageView = findViewById(R.id.imageView3);
        imageView.setImageResource(R.drawable.one);


        ImageView theatreOne = findViewById(R.id.imageView5);
        ImageView theatreTwo = findViewById(R.id.imageView7);
        ImageView theatreThree = findViewById(R.id.imageView8);
        ImageView theatreFourth = findViewById(R.id.imageView9);
        ImageView theatreFifth = findViewById(R.id.imageView10);
        ImageView theatreSixth = findViewById(R.id.imageView11);
        ImageView theatreSeventh = findViewById(R.id.imageView12);
        ImageView theatreEights = findViewById(R.id.imageView13);
        ImageView theatreNine = findViewById(R.id.imageView14);

            theatreOne.setVisibility(View.VISIBLE);

            theatreTwo.setVisibility(View.INVISIBLE);
            theatreThree.setVisibility(View.INVISIBLE);
            theatreFourth.setVisibility(View.INVISIBLE);
            theatreFifth.setVisibility(View.INVISIBLE);
            theatreSixth.setVisibility(View.INVISIBLE);
            theatreSeventh.setVisibility(View.INVISIBLE);
            theatreEights.setVisibility(View.INVISIBLE);
            theatreNine.setVisibility(View.INVISIBLE);


        TextView textView = findViewById(R.id.textView);
        textView.setText("Мариинский театр. Театр оперы и балета в Санкт-Петербурге, один из ведущих музыкальных театров России и мира.");
    }
    public void onClickTwo(View view) {
        ImageView imageView = findViewById(R.id.imageView3);
        imageView.setImageResource(R.drawable.two);

        ImageView theatreOne = findViewById(R.id.imageView5);
        ImageView theatreTwo = findViewById(R.id.imageView7);
        ImageView theatreThree = findViewById(R.id.imageView8);
        ImageView theatreFourth = findViewById(R.id.imageView9);
        ImageView theatreFifth = findViewById(R.id.imageView10);
        ImageView theatreSixth = findViewById(R.id.imageView11);
        ImageView theatreSeventh = findViewById(R.id.imageView12);
        ImageView theatreEights = findViewById(R.id.imageView13);
        ImageView theatreNine = findViewById(R.id.imageView14);

        theatreOne.setVisibility(View.INVISIBLE);

        theatreTwo.setVisibility(View.VISIBLE);
        theatreThree.setVisibility(View.INVISIBLE);
        theatreFourth.setVisibility(View.INVISIBLE);
        theatreFifth.setVisibility(View.INVISIBLE);
        theatreSixth.setVisibility(View.INVISIBLE);
        theatreSeventh.setVisibility(View.INVISIBLE);
        theatreEights.setVisibility(View.INVISIBLE);
        theatreNine.setVisibility(View.INVISIBLE);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Юсуповский дворец на Мойке. Бывший дворец в Санкт-Петербурге, памятник истории и культуры федерального значения.");
    }
    public void onClickThree(View view) {
        ImageView imageView = findViewById(R.id.imageView3);
        imageView.setImageResource(R.drawable.three);

        ImageView theatreOne = findViewById(R.id.imageView5);
        ImageView theatreTwo = findViewById(R.id.imageView7);
        ImageView theatreThree = findViewById(R.id.imageView8);
        ImageView theatreFourth = findViewById(R.id.imageView9);
        ImageView theatreFifth = findViewById(R.id.imageView10);
        ImageView theatreSixth = findViewById(R.id.imageView11);
        ImageView theatreSeventh = findViewById(R.id.imageView12);
        ImageView theatreEights = findViewById(R.id.imageView13);
        ImageView theatreNine = findViewById(R.id.imageView14);

        theatreOne.setVisibility(View.INVISIBLE);

        theatreTwo.setVisibility(View.INVISIBLE);
        theatreThree.setVisibility(View.VISIBLE);
        theatreFourth.setVisibility(View.INVISIBLE);
        theatreFifth.setVisibility(View.INVISIBLE);
        theatreSixth.setVisibility(View.INVISIBLE);
        theatreSeventh.setVisibility(View.INVISIBLE);
        theatreEights.setVisibility(View.INVISIBLE);
        theatreNine.setVisibility(View.INVISIBLE);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Исаакиевский собор. Крупнейший храм в Санкт-Петербурге. Расположен на Исаакиевской площади.");
    }
    public void onClickFour(View view) {
        ImageView imageView = findViewById(R.id.imageView3);
        imageView.setImageResource(R.drawable.four);

        ImageView theatreOne = findViewById(R.id.imageView5);
        ImageView theatreTwo = findViewById(R.id.imageView7);
        ImageView theatreThree = findViewById(R.id.imageView8);
        ImageView theatreFourth = findViewById(R.id.imageView9);
        ImageView theatreFifth = findViewById(R.id.imageView10);
        ImageView theatreSixth = findViewById(R.id.imageView11);
        ImageView theatreSeventh = findViewById(R.id.imageView12);
        ImageView theatreEights = findViewById(R.id.imageView13);
        ImageView theatreNine = findViewById(R.id.imageView14);

        theatreOne.setVisibility(View.INVISIBLE);

        theatreTwo.setVisibility(View.INVISIBLE);
        theatreThree.setVisibility(View.INVISIBLE);
        theatreFourth.setVisibility(View.VISIBLE);
        theatreFifth.setVisibility(View.INVISIBLE);
        theatreSixth.setVisibility(View.INVISIBLE);
        theatreSeventh.setVisibility(View.INVISIBLE);
        theatreEights.setVisibility(View.INVISIBLE);
        theatreNine.setVisibility(View.INVISIBLE);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Медный всадник. Памятник Петру I на Сенатской площади в Санкт-Петербурге работы скульптора Фальконе.");
    }
    public void onClickFive(View view) {
        ImageView imageView = findViewById(R.id.imageView3);
        imageView.setImageResource(R.drawable.five);

        ImageView theatreOne = findViewById(R.id.imageView5);
        ImageView theatreTwo = findViewById(R.id.imageView7);
        ImageView theatreThree = findViewById(R.id.imageView8);
        ImageView theatreFourth = findViewById(R.id.imageView9);
        ImageView theatreFifth = findViewById(R.id.imageView10);
        ImageView theatreSixth = findViewById(R.id.imageView11);
        ImageView theatreSeventh = findViewById(R.id.imageView12);
        ImageView theatreEights = findViewById(R.id.imageView13);
        ImageView theatreNine = findViewById(R.id.imageView14);

        theatreOne.setVisibility(View.INVISIBLE);

        theatreTwo.setVisibility(View.INVISIBLE);
        theatreThree.setVisibility(View.INVISIBLE);
        theatreFourth.setVisibility(View.INVISIBLE);
        theatreFifth.setVisibility(View.VISIBLE);
        theatreSixth.setVisibility(View.INVISIBLE);
        theatreSeventh.setVisibility(View.INVISIBLE);
        theatreEights.setVisibility(View.INVISIBLE);
        theatreNine.setVisibility(View.INVISIBLE);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Кунсткамера. Первый музей в России, учреждённый императором Петром I в Санкт-Петербурге.");
    }
    public void onClickSix(View view) {
        ImageView imageView = findViewById(R.id.imageView3);
        imageView.setImageResource(R.drawable.six);

        ImageView theatreOne = findViewById(R.id.imageView5);
        ImageView theatreTwo = findViewById(R.id.imageView7);
        ImageView theatreThree = findViewById(R.id.imageView8);
        ImageView theatreFourth = findViewById(R.id.imageView9);
        ImageView theatreFifth = findViewById(R.id.imageView10);
        ImageView theatreSixth = findViewById(R.id.imageView11);
        ImageView theatreSeventh = findViewById(R.id.imageView12);
        ImageView theatreEights = findViewById(R.id.imageView13);
        ImageView theatreNine = findViewById(R.id.imageView14);

        theatreOne.setVisibility(View.INVISIBLE);

        theatreTwo.setVisibility(View.INVISIBLE);
        theatreThree.setVisibility(View.INVISIBLE);
        theatreFourth.setVisibility(View.INVISIBLE);
        theatreFifth.setVisibility(View.INVISIBLE);
        theatreSixth.setVisibility(View.VISIBLE);
        theatreSeventh.setVisibility(View.INVISIBLE);
        theatreEights.setVisibility(View.INVISIBLE);
        theatreNine.setVisibility(View.INVISIBLE);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Эрмитаж. Музей изобразительного и прикладного искусства, расположенный в городе Санкт-Петербурге Российской Федерации.");
    }
    public void onClickSeven(View view) {
        ImageView imageView = findViewById(R.id.imageView3);
        imageView.setImageResource(R.drawable.seven);

        ImageView theatreOne = findViewById(R.id.imageView5);
        ImageView theatreTwo = findViewById(R.id.imageView7);
        ImageView theatreThree = findViewById(R.id.imageView8);
        ImageView theatreFourth = findViewById(R.id.imageView9);
        ImageView theatreFifth = findViewById(R.id.imageView10);
        ImageView theatreSixth = findViewById(R.id.imageView11);
        ImageView theatreSeventh = findViewById(R.id.imageView12);
        ImageView theatreEights = findViewById(R.id.imageView13);
        ImageView theatreNine = findViewById(R.id.imageView14);

        theatreOne.setVisibility(View.INVISIBLE);

        theatreTwo.setVisibility(View.INVISIBLE);
        theatreThree.setVisibility(View.INVISIBLE);
        theatreFourth.setVisibility(View.INVISIBLE);
        theatreFifth.setVisibility(View.INVISIBLE);
        theatreSixth.setVisibility(View.INVISIBLE);
        theatreSeventh.setVisibility(View.VISIBLE);
        theatreEights.setVisibility(View.INVISIBLE);
        theatreNine.setVisibility(View.INVISIBLE);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Спас на Крови. Православный мемориальный храм во имя Воскресения Христова сооружён в память Александра II.");
    }
    public void onClickEight(View view) {
        ImageView imageView = findViewById(R.id.imageView3);
        imageView.setImageResource(R.drawable.eight);

        ImageView theatreOne = findViewById(R.id.imageView5);
        ImageView theatreTwo = findViewById(R.id.imageView7);
        ImageView theatreThree = findViewById(R.id.imageView8);
        ImageView theatreFourth = findViewById(R.id.imageView9);
        ImageView theatreFifth = findViewById(R.id.imageView10);
        ImageView theatreSixth = findViewById(R.id.imageView11);
        ImageView theatreSeventh = findViewById(R.id.imageView12);
        ImageView theatreEights = findViewById(R.id.imageView13);
        ImageView theatreNine = findViewById(R.id.imageView14);

        theatreOne.setVisibility(View.INVISIBLE);

        theatreTwo.setVisibility(View.INVISIBLE);
        theatreThree.setVisibility(View.INVISIBLE);
        theatreFourth.setVisibility(View.INVISIBLE);
        theatreFifth.setVisibility(View.INVISIBLE);
        theatreSixth.setVisibility(View.INVISIBLE);
        theatreSeventh.setVisibility(View.INVISIBLE);
        theatreEights.setVisibility(View.VISIBLE);
        theatreNine.setVisibility(View.INVISIBLE);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Михайловский дворец. Дворец великого князя Михаила Павловича, четвёртого сына Павла I и Марии Фёдоровны.");
    }
    public void onClickNine(View view) {
        ImageView imageView = findViewById(R.id.imageView3);
        imageView.setImageResource(R.drawable.nine);

        ImageView theatreOne = findViewById(R.id.imageView5);
        ImageView theatreTwo = findViewById(R.id.imageView7);
        ImageView theatreThree = findViewById(R.id.imageView8);
        ImageView theatreFourth = findViewById(R.id.imageView9);
        ImageView theatreFifth = findViewById(R.id.imageView10);
        ImageView theatreSixth = findViewById(R.id.imageView11);
        ImageView theatreSeventh = findViewById(R.id.imageView12);
        ImageView theatreEights = findViewById(R.id.imageView13);
        ImageView theatreNine = findViewById(R.id.imageView14);

        theatreOne.setVisibility(View.INVISIBLE);

        theatreTwo.setVisibility(View.INVISIBLE);
        theatreThree.setVisibility(View.INVISIBLE);
        theatreFourth.setVisibility(View.INVISIBLE);
        theatreFifth.setVisibility(View.INVISIBLE);
        theatreSixth.setVisibility(View.INVISIBLE);
        theatreSeventh.setVisibility(View.INVISIBLE);
        theatreEights.setVisibility(View.INVISIBLE);
        theatreNine.setVisibility(View.VISIBLE);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Михайловский замок. Бывший императорский дворец в центре Санкт-Петербурга по адресу Садовая ул., № 2.");
    }

}
