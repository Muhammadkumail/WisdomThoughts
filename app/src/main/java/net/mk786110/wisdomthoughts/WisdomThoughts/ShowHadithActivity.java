package net.mk786110.wisdomthoughts.WisdomThoughts;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import net.mk786110.wisdomthoughts.Model.Hadith;
import net.mk786110.wisdomthoughts.R;

public class ShowHadithActivity extends Activity {

    public static Hadith mHadith;

    TextView hadith;
    TextView hadith_refrence;
    TextView masoom_name;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_hadith);


        init();
        populate();
    }

    private void init() {
        context = this;
        hadith = (TextView) findViewById(R.id.show_hadith_hadith);
        hadith_refrence = (TextView) findViewById(R.id.show_hadith_hadith_refremce);
        masoom_name = (TextView) findViewById(R.id.show_hadith_masoom_name);
    }

    private void populate() {
        hadith.setText(mHadith.getHadith());
        hadith_refrence.setText(mHadith.getHaith_refrence());
        masoom_name.setText(mHadith.getImam_name());
    }

}
