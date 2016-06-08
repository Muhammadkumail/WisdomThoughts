package net.mk786110.wisdomthoughts.Datasource;

import net.mk786110.wisdomthoughts.Model.Hadith;

import java.util.ArrayList;

/**
 * Created by developer on 6/8/16.
 */
public class EnglishAmbitionDatasource {

    ArrayList<Hadith> hadithArrayList = new ArrayList<>();

    public ArrayList<Hadith> getHadithArrayList() {
        Hadith hadith1 = new Hadith();

        hadith1.setHadith("Allah Almighty loves the highest and the most dignified of things and hates inferior things");
        hadith1.setHaith_refrence("Kanz al-Ummal, no. ۴۳۰۲۱");
        hadith1.setImam_name("The Prophet (SAWA)");
        hadith1.setLikes("2");
        hadithArrayList.add(hadith1);

        Hadith hadith2 = new Hadith();
        hadith2.setHadith(" in a supplication, said, 'I ask You for the most fair witnessing, and the most active of worship ... and the highest ambition");
        hadith2.setHaith_refrence("al-Sahifa al-Sajjadiyya, p. ۴۳۹, no. ۱۹۹");
        hadith2.setImam_name("Imam Zayn al-Abidin (AS)");
        hadith2.setLikes("2");
        hadithArrayList.add(hadith2);

        Hadith hadith3 = new Hadith();
        hadith3.setHadith("Allah Almighty loves the highest and the most dignified of things and hates inferior things");
        hadith3.setHaith_refrence("Kanz al-Ummal, no. ۴۳۰۲۱");
        hadith3.setImam_name("The Prophet (SAWA)");
        hadith3.setLikes("2");
        hadithArrayList.add(hadith3);

        Hadith hadith4 = new Hadith();
        hadith4.setHadith("There is no dignity like great ambition");
        hadith4.setHaith_refrence("Bihar al-Anwar, v. ۷۸, p. ۱۶۵, no. ۱");
        hadith4.setImam_name("Imam al-Baqir (AS)");
        hadith4.setLikes("2");
        hadithArrayList.add(hadith4);





        return hadithArrayList;


    }
}
