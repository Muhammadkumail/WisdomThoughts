package net.mk786110.wisdomthoughts.EnglishHadiths;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import net.mk786110.wisdomthoughts.Adaptor.EnglishAdaptor;
import net.mk786110.wisdomthoughts.Datasource.EnglishAmbitionDatasource;
import net.mk786110.wisdomthoughts.Model.Hadith;
import net.mk786110.wisdomthoughts.R;
import net.mk786110.wisdomthoughts.WisdomThoughts.ShowHadithActivity;

import java.util.ArrayList;

public class AmbitionActivity extends AppCompatActivity {

    ListView mHadithLIstView;
    EnglishAmbitionDatasource mEnglishAmbitionDatasource;
    EnglishAdaptor mEnglishAdaptor;
    ArrayList<Hadith> mHadithArrayList;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_detail);


        mHadithLIstView = (ListView) findViewById(R.id.detail_hadith_listView);

        mEnglishAmbitionDatasource = new EnglishAmbitionDatasource();

        mHadithArrayList = mEnglishAmbitionDatasource.getHadithArrayList();

        mEnglishAdaptor = new EnglishAdaptor(context, R.layout.activity_row, mHadithArrayList);

        mHadithLIstView.setAdapter(mEnglishAdaptor);

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
