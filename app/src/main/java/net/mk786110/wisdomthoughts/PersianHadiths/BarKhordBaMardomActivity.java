package net.mk786110.wisdomthoughts.PersianHadiths;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import net.mk786110.wisdomthoughts.Adaptor.PersainAdaptor;
import net.mk786110.wisdomthoughts.Datasource.PersianDatasource;
import net.mk786110.wisdomthoughts.Model.Hadith;
import net.mk786110.wisdomthoughts.R;

import java.util.ArrayList;

public class BarKhordBaMardomActivity extends AppCompatActivity {

    ListView mHadithLIstView;
    PersianDatasource mpersianDatasource;
    PersainAdaptor mpersainAdaptor;
    ArrayList<Hadith> mHadithArrayList;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_detail);


        mHadithLIstView = (ListView) findViewById(R.id.detail_hadith_listView);

        mpersianDatasource = new PersianDatasource();

        mHadithArrayList = mpersianDatasource.getHadithArrayList();

        mpersainAdaptor = new PersainAdaptor(context, R.layout.activity_row, mHadithArrayList);

        mHadithLIstView.setAdapter(mpersainAdaptor);


    }
}
