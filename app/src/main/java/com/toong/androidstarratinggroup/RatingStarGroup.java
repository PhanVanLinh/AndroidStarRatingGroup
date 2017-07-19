package com.toong.androidstarratinggroup;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

/**
 * Created by PhanVanLinh on 19/07/2017.
 * phanvanlinh.94vn@gmail.com
 */

public class RatingStarGroup extends LinearLayout {
    private ProgressBar pbFiveStar;
    private ProgressBar pbFourStar;
    private ProgressBar pbThreeStar;
    private ProgressBar pbTwoStar;
    private ProgressBar pbOneStar;

    private TextView tvFiveStar;
    private TextView tvFourStar;
    private TextView tvThreeStar;
    private TextView tvTwoStar;
    private TextView tvOneStar;

    public RatingStarGroup(Context context) {
        this(context, null);
    }

    public RatingStarGroup(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RatingStarGroup(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.layout_star_group, this, true);
        pbFiveStar = (ProgressBar) findViewById(R.id.five_star_progress);
        pbFourStar = (ProgressBar) findViewById(R.id.four_star_progress);
        pbThreeStar = (ProgressBar) findViewById(R.id.three_star_progress);
        pbTwoStar = (ProgressBar) findViewById(R.id.two_star_progress);
        pbOneStar = (ProgressBar) findViewById(R.id.one_star_progress);

        tvFiveStar = (TextView) findViewById(R.id.five_star_value);
        tvFourStar = (TextView) findViewById(R.id.four_star_value);
        tvThreeStar = (TextView) findViewById(R.id.three_star_value);
        tvTwoStar = (TextView) findViewById(R.id.two_star_value);
        tvOneStar = (TextView) findViewById(R.id.one_star_value);
    }

    public void setProgress(int... progresses) {
        pbFiveStar.setProgress(progresses[0]);
        pbFourStar.setProgress(progresses[1]);
        pbThreeStar.setProgress(progresses[2]);
        pbTwoStar.setProgress(progresses[3]);
        pbOneStar.setProgress(progresses[4]);
    }

    public void setValue(int... values) {
        tvFiveStar.setText(""+values[0]);
        tvFourStar.setText(""+values[1]);
        tvThreeStar.setText(""+values[2]);
        tvTwoStar.setText(""+values[3]);
        tvOneStar.setText(""+values[4]);
    }
}
