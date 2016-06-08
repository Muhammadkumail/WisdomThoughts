package net.mk786110.wisdomthoughts.Adaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import net.mk786110.wisdomthoughts.Model.Hadith;
import net.mk786110.wisdomthoughts.R;

import java.util.ArrayList;

/**
 * Created by developer on 6/8/16.
 */
public class PersainAdaptor extends ArrayAdapter<Hadith> {

    Context context;

    public PersainAdaptor(Context _context, int resource, ArrayList<Hadith> objects) {
        super(_context, resource, objects);
        this.context = _context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Hadith hadith = getItem(position);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.activity_row, parent, false);

        TextView mhadith = (TextView) rowView.findViewById(R.id.row_hadith_textView);
        TextView mMasoomName = (TextView) rowView.findViewById(R.id.row_imamName_textView);
        TextView mLIkes = (TextView) rowView.findViewById(R.id.row_like_textView);


        mhadith.setText(hadith.getHadith());
        mMasoomName.setText(hadith.getImam_name());
        mLIkes.setText(hadith.getLikes());


        return rowView;
    }
}
