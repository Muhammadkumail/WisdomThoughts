package net.mk786110.wisdomthoughts;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import net.mk786110.wisdomthoughts.PersianHadiths.BarKhordBaMardomActivity;

public class PersianActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_persian);


    }


    public void onClickBarKhordBaMardom(View view) {
        Toast.makeText(PersianActivity.this, "there", Toast.LENGTH_SHORT).show();
        Intent mintent = new Intent(PersianActivity.this, BarKhordBaMardomActivity.class);
        startActivity(mintent);
    }
}
