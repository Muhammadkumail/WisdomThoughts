package net.mk786110.wisdomthoughts.WisdomThoughts;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import net.mk786110.wisdomthoughts.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Typeface myTypeFace=Typeface.createFromAsset(getAssets(),"funRaiser.ttf");
        TextView textView=(TextView)findViewById(R.id.home_actionBar_textView);
        textView.setTypeface(myTypeFace);
    }

    public void onClickEnglish(View view)
    {
        Intent mintent=new Intent(this,EnglishActivity.class);
        startActivity(mintent);

    }
    public void onClickPersion(View view)
    {

        Intent mintent=new Intent(this,PersianActivity.class);
        startActivity(mintent);

    }
    public void onClickUrdu(View view)
    {

        Intent mintent=new Intent(this,UrduActivity.class);
        startActivity(mintent);

    }
    public void onClickArabi(View view)
    {

        Intent mintent=new Intent(this,ArabiActivity.class);
        startActivity(mintent);
    }
}
