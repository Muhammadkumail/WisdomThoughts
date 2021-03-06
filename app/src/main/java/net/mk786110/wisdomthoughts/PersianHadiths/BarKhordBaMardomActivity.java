package net.mk786110.wisdomthoughts.PersianHadiths;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import net.mk786110.wisdomthoughts.Adaptor.PersainAdaptor;
import net.mk786110.wisdomthoughts.Datasource.PersianBaKhodaBudanDatasource;
import net.mk786110.wisdomthoughts.Model.Hadith;
import net.mk786110.wisdomthoughts.R;
import net.mk786110.wisdomthoughts.WisdomThoughts.ShowHadithActivity;

import java.util.ArrayList;

public class BarKhordBaMardomActivity extends AppCompatActivity {

    ListView mHadithLIstView;
    PersianBaKhodaBudanDatasource mPersianBaKhodaBudanDatasource;
    PersainAdaptor mpersainAdaptor;
    ArrayList<Hadith> mHadithArrayList;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_detail);


        mHadithLIstView = (ListView) findViewById(R.id.detail_hadith_listView);

        mPersianBaKhodaBudanDatasource = new PersianBaKhodaBudanDatasource();

        mHadithArrayList = mPersianBaKhodaBudanDatasource.getHadithArrayList();

        mpersainAdaptor = new PersainAdaptor(context, R.layout.activity_row, mHadithArrayList);

        mHadithLIstView.setAdapter(mpersainAdaptor);

        mHadithLIstView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Hadith _mHadith = mHadithArrayList.get(position);
                ShowHadithActivity.mHadith = _mHadith;
                Toast.makeText(context, _mHadith.getImam_name(), Toast.LENGTH_SHORT).show();
                startActivity(new Intent(context, ShowHadithActivity.class));

            }
        });


    }
}
