package net.mk786110.wisdomthoughts.WisdomThoughts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import net.mk786110.wisdomthoughts.EnglishHadiths.AmbitionActivity;
import net.mk786110.wisdomthoughts.R;

public class EnglishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);

    }

    public void onClickAmbition(View view) {

        Intent mintent = new Intent(EnglishActivity.this, AmbitionActivity.class);
        startActivity(mintent);
    }
}
