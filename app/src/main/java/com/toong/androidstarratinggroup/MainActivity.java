package com.toong.androidstarratinggroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RatingStarGroup ratingStarGroup = (RatingStarGroup) findViewById(R.id.rating_star_group);
        ratingStarGroup.setProgress(10,20,30,40,50);
        ratingStarGroup.setValue(50,40,30,20,10);
    }
}
