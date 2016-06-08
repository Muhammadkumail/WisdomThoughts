package net.mk786110.wisdomthoughts.Datasource;

import net.mk786110.wisdomthoughts.Model.Hadith;

import java.util.ArrayList;

/**
 * Created by developer on 6/8/16.
 */
public class PersianBaKhodaBudanDatasource {

    ArrayList<Hadith> hadithArrayList = new ArrayList<>();

    public ArrayList<Hadith> getHadithArrayList() {
        Hadith hadith1 = new Hadith();

        hadith1.setHadith("انسان به همان كسى واگذار مى شود كه به او اميد بسته است و اگر انسان جز به خدااميد نبندد به غير خدا واگذار نمى شود");
        hadith1.setHaith_refrence("كنزالعمّال، ح ۵۹۰۹");
        hadith1.setImam_name("پیامبر اکرم (ص)");
        hadith1.setLikes("2");
        hadithArrayList.add(hadith1);

        Hadith hadith2 = new Hadith();

        hadith2.setHadith("بپرهيز از خلف وعده كه آن موجب نفرت خدا و مردم از تو مى شود");
        hadith2.setHaith_refrence("نهج البلاغه، از نامه ۵۳");
        hadith2.setImam_name("امام علی (ع)");
        hadith2.setLikes("5");
        hadithArrayList.add(hadith2);

        Hadith hadith3 = new Hadith();

        hadith3.setHadith("بپرهيز از خلف وعده كه آن موجب نفرت خدا و مردم از تو مى شود");
        hadith3.setHaith_refrence("نهج البلاغه، از نامه ۵۳");
        hadith3.setImam_name("امام علی (ع)");
        hadith3.setLikes("89");
        hadithArrayList.add(hadith3);

        Hadith hadith4 = new Hadith();

        hadith4.setHadith("بپرهيز از خلف وعده كه آن موجب نفرت خدا و مردم از تو مى شود");
        hadith4.setHaith_refrence("نهج البلاغه، از نامه ۵۳");
        hadith4.setImam_name("امام علی (ع)");
        hadith4.setLikes("89");
        hadithArrayList.add(hadith4);


        Hadith hadith5 = new Hadith();

        hadith5.setHadith("بپرهيز از خلف وعده كه آن موجب نفرت خدا و مردم از تو مى شود");
        hadith5.setHaith_refrence("نهج البلاغه، از نامه ۵۳");
        hadith5.setImam_name("امام علی (ع)");
        hadith5.setLikes("89");
        hadithArrayList.add(hadith5);

        Hadith hadith6 = new Hadith();

        hadith6.setHadith("بپرهيز از خلف وعده كه آن موجب نفرت خدا و مردم از تو مى شود");
        hadith6.setHaith_refrence("نهج البلاغه، از نامه ۵۳");
        hadith6.setImam_name("امام علی (ع)");
        hadith6.setLikes("89");
        hadithArrayList.add(hadith6);

        return hadithArrayList;


    }
}
