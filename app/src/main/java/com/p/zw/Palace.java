package com.p.zw;

/**
 * Created by Administrator on 8/13/15.
 * Palace - Gong Wei
 * Position 0 = Zi
 * Position 1 = Chou
 * Position 2 = Yin, etc...
 * mainStar1 refer to Zi Wei series main star, move in counter clockwise direction
 * mainStar2 refer to Tian Fu series main star, move in clockwise direction
 */
public class Palace {

    public static final int ROOMSIZE = 12;

    private int[] mainStar1 = new int[ROOMSIZE];
    private int[] mainStar2 = new int[ROOMSIZE];

    private int[] star = new int[Star.STARCOUNT];

    private int[] tianGan = new int[ROOMSIZE];



    public Palace () {
        // constructor

    }

    protected void resetStar () {
        mainStar1 = new int[ROOMSIZE];
        mainStar2 = new int[ROOMSIZE];

        for (int i=0; i<ROOMSIZE; i++) {
            mainStar1 [i] = 0;
            mainStar2 [i] = 0;
            tianGan   [i] = 0;
        }

        for (int i=0; i<Star.STARCOUNT; i++) {
            star [i] = 0;
        }
    }

    public void setMainStar1 (int position, int value) {

        if ( position >= 0 && position < ROOMSIZE ) {
            mainStar1 [position] = value ;
        }

    }

    public void setMainStar2 (int position, int value) {

        if ( position >= 0 && position < ROOMSIZE ) {
            mainStar2 [position] = value ;
        }

    }

    public void setStar (int starName, int starPosition) {

        if (starPosition >= 0 && starPosition < ROOMSIZE) {

            if (starName >= 0 && starName < Star.STARCOUNT) {
                star[starName] = starPosition;
            }

        }

    }

    public void setTianGan (int position, int value) {

        if ( position >= 0 && position < ROOMSIZE ) {
            tianGan [position] = value ;
        }

    }



    public boolean isTwinMainStar (int position) {

        boolean mainStar1Flag = false, mainStar2Flag = false ;

        if ( position >= 0 && position < ROOMSIZE ) {
            if ( mainStar1[position] != 0 )
                mainStar1Flag = true ;


            if ( mainStar2[position] != 0 )
                mainStar2Flag = true ;
        }

        return mainStar1Flag && mainStar2Flag ;
    }

    public int getMainStar1 (int position) {
        int value = 0 ;

        if ( position >= 0 && position < ROOMSIZE ) {
            value =  mainStar1[position] ;
        }
        return value ;
    }

    public int getMainStar2 (int position) {
        int value = 0 ;

        if ( position >= 0 && position < ROOMSIZE ) {
            value =  mainStar2[position] ;
        }
        return value ;
    }

    public int getTianGan (int position) {
        int value = 0 ;

        if ( position >= 0 && position < ROOMSIZE ) {
            value =  tianGan [position] ;
        }
        return value ;
    }

    public int getStarPosition (int starName) {
        int value=0;

        if ( starName >= 0 && starName < Star.STARCOUNT ) {
            value = star [starName] ;
        }

        return value;
    }





    public void testStub () {
        // Testing purpose

        for (int i=0; i<ROOMSIZE; i++) {
            setMainStar1 (i, 10+i);
            setMainStar2 (i, 100+i);
        }

        for (int j=0; j<Star.STARCOUNT; j++) {
            setStar (j, j);
        }

        testPrintStub ();

    }

    public void testPrintStub () {
        // Testing purpose - print all instance variable

        LogDisplay logdisplay = new LogDisplay ();

        logdisplay.setTag("ziweiCode - Palace.java");


        logdisplay.displayLog("mainStar1");

        for (int i=0; i<ROOMSIZE; i++) {
            logdisplay.displayLog("mainStar1 [" + i + "] = " + getMainStar1 (i));
        }

        logdisplay.displayLog("mainStar2");
        for (int i=0; i<ROOMSIZE; i++) {
            logdisplay.displayLog ("mainStar2 [" + i + "] = " + getMainStar2 (i));
        }

        logdisplay.displayLog("star");
        Integer n ;
        n = Star.STARCOUNT;
        logdisplay.displayLog("Star Count = " + n.toString());
        for (int i=0; i<Star.STARCOUNT; i++) {
            logdisplay.displayLog ("Star [" + i + "] = " + getStarPosition (i));
        }

        logdisplay.displayLog("Tian Gan");
        for (int i=0; i<ROOMSIZE; i++) {
            logdisplay.displayLog ("TianGan [" + i + "] = " + getTianGan (i));
        }
    }

}
