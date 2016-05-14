package net.mk786110.wisdomthoughts;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Typeface myTypeFace=Typeface.createFromAsset(getAssets(),"funRaiser.ttf");
        TextView textView=(TextView)findViewById(R.id.home_actionBar_textView);
        textView.setTypeface(myTypeFace);
    }
}
