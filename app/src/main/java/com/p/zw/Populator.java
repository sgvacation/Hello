package com.p.zw;



/**
 * Created by shengyew on 8/14/2015.
 */
public class Populator {

    private Palace palace ;

    public Populator () {
        // Constractor

    }

    public Populator (Palace obj) {
        setPalace (obj) ;
    }


    public void populateZiWei (int startPos) {
        int [] ziwei = {MainStar.ZI_WEI, MainStar.TIAN_JI, 0, MainStar.TAI_YAN, MainStar.WU_QI, MainStar.TIAN_TONG, 0, 0, MainStar.LIAN_ZHEN} ;
        int pos;

        pos = startPos;

        for (int i=0; i<9; i++) {

            if (pos < 0)
                pos = 11;

            palace.setMainStar1 (pos, ziwei [i]);

            pos --;
        }

    }

    public void populateTianFu (int startPos) {

        int [] tianFu = {MainStar.TIAN_FU, MainStar.TAI_YIN, MainStar.TANG_LANG, MainStar.JU_MEN, MainStar.TIAN_XIANG, MainStar.TIAN_LIANG, MainStar.QI_SHA, 0, 0, 0, MainStar.PO_JUN} ;
        int pos;

        pos = startPos;

        for (int i=0; i<11; i++) {

            if (pos > 11)
                pos = 0;

            palace.setMainStar2 (pos, tianFu [i]);

            pos ++;
        }

    }

    public void populateTianGan (int startGan) {
        // populate TianGan always start from array position 2

        int [] tianGan = {TianGan.JIA, TianGan.YI, TianGan.BING, TianGan.DING, TianGan.WU, TianGan.JI, TianGan.GEN, TianGan.XIN, TianGan.REN, TianGan.FA} ;
        int pos;
        int room;

        pos = startGan;

        for (int i=0; i<12; i++) {

            room = i + 2;
            if (room > 11)
                room = room - 12;

            if (pos > 10)
                pos = 1;

            palace.setTianGan (room, tianGan [pos-1]);

            pos ++;
        }


    }

    public void setPalace (Palace obj) {
        palace = obj ;
    }

    public Palace getPalace () {
        return palace ;
    }


    public void testStub () {

        populateZiWei (2);
        populateTianFu (2);
        for (int i=0; i<Star.STARCOUNT; i++) {
            palace.setStar (i, i);
        }
        populateTianGan(9);

        testPrintStub ();
    }

    public void testPrintStub () {
        palace.testPrintStub();
    }

}
