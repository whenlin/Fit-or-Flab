package com.example.whenlin.fitorflab;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    RelativeLayout weightBtn = (RelativeLayout) findViewById(R.id.weightBtn);    //Referring to the app buttons
    RelativeLayout yogaBtn = (RelativeLayout) findViewById(R.id.yogaBtn);
    RelativeLayout cardioBtn = (RelativeLayout) findViewById(R.id.cardioBtn);
    RelativeLayout settingsBtn = (RelativeLayout) findViewById(R.id.settingsBtn);

    TextView exerciseText;     //Title of details activity
    ImageView exerciseImg;//Image at top of details activity
    LinearLayout mainBG;      //background of details activity


    CheckBox box1 = (CheckBox) findViewById(R.id.checkBox);              //Referring to the checkboxes
    CheckBox box2 = (CheckBox) findViewById(R.id.checkBox2);
    CheckBox box3 = (CheckBox) findViewById(R.id.checkBox3);
    CheckBox box4 = (CheckBox) findViewById(R.id.checkBox4);
    CheckBox box5 = (CheckBox) findViewById(R.id.checkBox5);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

         exerciseText = (TextView) findViewById(R.id.exerciseTitle);     //Title of details activity
         exerciseImg = (ImageView) findViewById(R.id.exerciseImage);//Image at top of details activity
         mainBG = (LinearLayout) findViewById(R.id.mainBG);

        String exerciseTitle = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);
        exerciseText.setText(exerciseTitle);

        if (exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_WEIGHTS)) {
            exerciseImg.setImageDrawable(getResources().getDrawable(R.drawable.weight3x, getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#2ca5f5"));

            box1.setText("Complete set 1");
            box2.setText("Complete set 2");
            box3.setText("Complete set 3");
            box4.setText("Complete set 4");
            box5.setText("Complete set 5");

        } else if (exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_YOGA)) {
            exerciseImg.setImageDrawable(getResources().getDrawable(R.drawable.lotus3x, getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#916bcd"));

            box1.setText("Complete type 1 Yoga");
            box2.setText("Complete type 2 Yoga");
            box3.setText("Complete type 3 Yoga");
            box4.setText("Complete type 4 Yoga");
            box5.setText("Complete type 5 Yoga");

        } else if (exerciseTitle.equalsIgnoreCase(MainActivity.SETTINGS_ACTIVITY)) {
            exerciseImg.setImageDrawable(getResources().getDrawable(R.drawable.gearicon, getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#F7ae88"));

            box1.setText("Night Mode");
           // nightMode();


        } else {
            exerciseImg.setImageDrawable(getResources().getDrawable(R.drawable.heart3x, getApplicationContext().getTheme()));
            mainBG.setBackgroundColor(Color.parseColor("#52ad56"));

            box1.setText("Walk 2 miles");
            box2.setText("Run 5 miles");
            box3.setText("Sprint 200 m");
            box4.setText("Sprint 400 m");
            box5.setText("Bike 15 miles");
        }

    }

  /*  private void nightMode() {
        LinearLayout mainBG = (LinearLayout) findViewById(R.id.mainBG);      //background of details activity

        CheckBox box1 = (CheckBox) findViewById(R.id.checkBox);

        if (box1.isChecked()) {
            weightBtn.setBackgroundColor(Color.parseColor("#272f37"));
            cardioBtn.setBackgroundColor(Color.parseColor("#272f37"));
            yogaBtn.setBackgroundColor(Color.parseColor("#272f37"));
            settingsBtn.setBackgroundColor(Color.parseColor("#272f37"));
            mainBG.setBackgroundColor(Color.parseColor("#272f37"));
        } else {
            weightBtn.setBackgroundColor(Color.parseColor("#2ca5f5"));
            cardioBtn.setBackgroundColor(Color.parseColor("#52ad56"));
            yogaBtn.setBackgroundColor(Color.parseColor("#916bcd"));
            settingsBtn.setBackgroundColor(Color.parseColor("#F7ae88"));
        }
    } */

}
