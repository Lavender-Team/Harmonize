package kr.ac.chungbuk.harmonize.ui.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;

import kr.ac.chungbuk.harmonize.R;

public class GenderAgeSurveyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_gender_age_survey);
    }
}