package weatherprediction;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;

/**
 *
 * @author aboeni
 */
public class WeatherPrediction {
    //NOTES:
    //Precip. T (n/a info) replaced with 0
    //noted previous abnormalities (extreme weather changes)
    
    public static void main(String[] args) {
        double tempH=0, tempL=0;
        float precipchance;
        double ptotal08 = 0, ptotal09 = 0, ptotal10 = 0, ptotal11 = 0, ptotal12 = 0, ptotal13 = 0, ptotal14 = 0, ptotal15 = 0, ptotal16 = 0, ptotal17 = 0, ptotal18 = 0;
        int Ltotal08 = 0, Ltotal09 = 0, Ltotal10 = 0, Ltotal11 = 0, Ltotal12 = 0, Ltotal13 = 0, Ltotal14 = 0, Ltotal15 = 0, Ltotal16 = 0, Ltotal17 = 0, Ltotal18 = 0;
        int Htotal08 = 0, Htotal09 = 0, Htotal10 = 0, Htotal11 = 0, Htotal12 = 0, Htotal13 = 0, Htotal14 = 0, Htotal15 = 0, Htotal16 = 0, Htotal17 = 0, Htotal18 = 0;
        double HDtotal1 = 0, HDtotal2 = 0, HDtotal3 = 0, HDtotal4 = 0,  HDtotal5 = 0, HDtotal6 = 0, HDtotal7 = 0, HDtotal8 = 0, HDtotal9 = 0, HDtotal10 = 0;
        double HDtotal11 = 0, HDtotal12 = 0, HDtotal13 = 0, HDtotal14 = 0,  HDtotal15 = 0, HDtotal16 = 0, HDtotal17 = 0, HDtotal18 = 0, HDtotal19 = 0, HDtotal20 = 0;
        double HDtotal21 = 0, HDtotal22 = 0, HDtotal23 = 0, HDtotal24 = 0,  HDtotal25 = 0, HDtotal26 = 0, HDtotal27 = 0, HDtotal28 = 0, HDtotal29 = 0, HDtotal30 = 0;
        double LDtotal1 = 0, LDtotal2 = 0, LDtotal3 = 0, LDtotal4 = 0,  LDtotal5 = 0, LDtotal6 = 0, LDtotal7 = 0, LDtotal8 = 0, LDtotal9 = 0, LDtotal10 = 0;
        double LDtotal11 = 0, LDtotal12 = 0, LDtotal13 = 0, LDtotal14 = 0,  LDtotal15 = 0, LDtotal16 = 0, LDtotal17 = 0, LDtotal18 = 0, LDtotal19 = 0, LDtotal20 = 0;
        double LDtotal21 = 0, LDtotal22 = 0, LDtotal23 = 0, LDtotal24 = 0,  LDtotal25 = 0, LDtotal26 = 0, LDtotal27 = 0, LDtotal28 = 0, LDtotal29 = 0, LDtotal30 = 0;
        int Ltotal19 = 0;
        int Htotal19 = 0;
        int Latotal = 0;
        int Hatotal = 0;
        DecimalFormat df = new DecimalFormat("0.00");
        boolean WillRain[];
        WillRain = new boolean[12];
        
        /*All Temperature Data
        *2008 - 2019
        *2019 Precip. Data not recorded
        *Highs, Lows, Precip.
        */
        int[] year08H =  {65,60,43,53,65,61,60,65,58,56,52,48,47,45,55,67,50,47,38,32,36,27,35,34,45,46,44,40,49,44};
        int[] year08L =  {26,27,25,32,38,50,56,56,43,40,32,29,30,34,45,43,32,28,22,18,18,15,17,21,24,24,26,25,28,25};
        double[] Precip08 = {0,0,0,0,0,0.21,0.53,0.02,0.36,0,0,0,0.01,0.47,0.19,0.87,0,0,0,0,0,0,0,0,0.52,0.44,0,0,0,0};
        //2009
        int[] year09H =  {68,55,54,59,50,49,46,53,70,64,64,51,49,51,55,66,58,55,49,60,60,54,45,45,50,49,50,45,52,55};
        int[] year09L =  {45,37,33,31,32,33,25,25,33,46,46,42,40,40,45,44,35,27,29,33,35,35,37,42,42,44,44,38,34,37};
        double[] Precip09 = {0.25,0,0,0,0.01,0.01,0,0,0,0,0,0,0,0.41,0.42,0,0,0,0,0.72,0,0,0,0.14,0,0.08,0.06,0.12,0,0};
        //2010
        int[] year10H =  {55,48,50,54,47,52,52,48,44,53,55,56,62,68,60,53,58,61,51,47,55,45,61,58,45,42,50,43,46,48};
        int[] year10L =  {32,31,27,27,35,32,32,34,34,38,38,35,31,32,39,39,41,39,30,27,28,32,36,39,25,25,26,27,24,24};
        double[] Precip10 = {0,0,0,0.06,1.36,0.04,0,0.27,0.2,0,0,0,0,0,0,0.01,1.59,0,0,0,0,0,0,0,0,0.19,0,0,0,0};
        //2011
        int[] year11H =  {50,53,59,59,51,52,58,67,74,69,60,48,54,61,67,65,58,44,45,55,67,55,45,41,50,64,67,57,67,63};
        int[] year11L =  {24,28,29,30,27,25,29,29,40,42,41,34,33,35,46,48,43,27,28,36,47,37,37,31,31,33,32,36,32,45};
        double[] Precip11 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0.68,0,0,0,0,0,1.41,0.04,0,0,0,0,0,1.05};
        //2012
        //abnormality: Sandy Aftermath
        int[] year12H =  {54,53,52,50,51,43,44,35,42,56,58,67,65,48,47,45,47,48,48,49,49,51,57,59,58,39,47,35,40,43};
        int[] year12L =  {40,40,40,37,35,21,21,28,32,42,44,40,45,31,29,29,29,26,27,27,27,29,29,31,28,30,26,30,26,26};
        double[] Precip12 = {0,0,0,0,0,0,0,0.4,0,0,0,0,0.08,0.07,0,0,0,0,0,0,0,0,0,0,0,0,0,0.13,0,0};
        //2013
        int[] year13H =  {65,71,64,46,44,54,63,62,50,51,54,53,35,37,53,61,62,60,65,46,44,48,51,44,26,35,47,47,32,35};
        int[] year13L =  {38,42,40,28,26,27,35,30,28,38,37,33,24,24,29,30,35,42,40,26,18,18,36,17,16,18,30,24,20,13};
        double[] Precip13 = {0.16,0.13,0,0,0,0,0,0.09,0,0,0.02,0,0,0,0,0,0,0.29,0,0,0,0.13,0.05,0,0,0,2.02,0.46,0,0};
        //2014
        int[] year14H =  {52,50,47,58,68,65,46,46,50,57,62,63,65,50,41,48,40,43,34,36,45,35,45,62,64,58,40,35,35,35};
        int[] year14L =  {33,38,34,34,36,42,42,29,29,31,28,42,30,29,21,21,28,32,18,18,22,15,28,45,54,38,30,22,13,17};
        double[] Precip14 = {0.05,0.19,0,0,0,0,0.31,0.02,0,0,0,0,0,0.1,0,0,0.45,0.71,0,0,0,0,0,0.7,0.17,0,0.92,0.02,0,0};
        //2015
        int[] year15H =  {54,62,65,77,73,72,75,60,58,63,54,52,56,58,50,59,60,49,49,60,55,50,49,41,46,48,56,66,55,49};
        int[] year15L =  {42,41,38,39,43,45,50,42,30,30,40,44,45,38,31,42,30,24,26,47,38,34,31,24,23,23,34,50,30,28};
        double[] Precip15 = {0,0,0,0,0,0,0,0,0,0,0.42,0.12,0.25,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0.2,0};
        //2016
        int[] year16H =  {52,58,73,73,58,57,51,53,67,54,55,57,49,61,66,57,59,57,70,64,37,35,38,40,46,47,44,43,49,59};
        int[] year16L =  {27,27,47,47,30,33,31,29,31,34,33,30,35,29,32,42,40,33,33,34,28,27,27,28,32,33,32,27,27,35};
        double[] Precip16 = {0,0,0,0,0,0,0,0,0,0.05,0,0,0,0,0,0.82,0,0,0,0.74,0.04,0.01,0,0,0.07,0,0,0,0,1.39};
        //2017
        int[] year17H =  {58,48,70,75,60,62,68,49,48,52,38,39,49,45,41,48,54,44,59,58,45,58,46,42,52,59,42,49,46,61};
        int[] year17L =  {28,32,47,39,38,48,39,33,27,26,19,19,22,29,26,26,33,20,25,28,25,31,26,24,27,32,26,21,21,23};
        double[] Precip17 = {0,0,0,0,0,0.1,0.05,0.13,0,0.05,0,0,0,0.01,0,0,0.14,0,0.23,0.07,0,0,0.02,0,0,0,0,0,0,0};
        //2018
        int[] year18H =  {62,70,67,57,56,47,56,64,53,45,47,44,49,46,33,35,42,49,40,46,41,42,21,32,42,52,44,45,42,42};
        int[] year18L =  {27,48,50,29,32,36,40,30,26,31,27,20,23,25,16,18,26,28,28,30,29,8,6,2,19,31,31,28,30,14};
        double[] Precip18 = {0,0.17,2.42,0.02,0,0.22,0.5,0,0,0.75,0,0,0.78,0.41,0,1.6,0.07,0,0.02,0.09,0.03,0.01,0,0,0.44,0,1.09,0,0};
        //2019
        int[] year19H = {70,53,56,56,58,56,55,38,41,42,49,59,32,37,54,41,37,45,47,45,54,54,47,43,57,64,51,49,44,41};
        int[] year19L =  {40,33,30,33,40,34,34,25,21,20,24,32,19,15,26,24,20,37,38,40,34,36,32,36,40,33,33,35,30,26};
        //double[] Precip19 = {};
        
        //Average Precip over years
        //2008
        for(int i=0; i<Precip08.length; i++){
            ptotal08 = ptotal08 + Precip08[i];
        }
        double ave08 = ptotal08 / Precip08.length;
        //System.out.println("precip. 08 ave " + df.format(ave08));
        
        //2009
        for(int i=0; i<Precip09.length; i++){
            ptotal09 = ptotal09 + Precip09[i];
        }
        double ave09 = ptotal09 / Precip09.length;
        //System.out.println("precip. 09 ave " + df.format(ave09));
        
        //2010
        for(int i=0; i<Precip10.length; i++){
            ptotal10 = ptotal10 + Precip10[i];
        }
        double ave10 = ptotal10 / Precip10.length;
        //System.out.println("precip. 10 ave " + df.format(ave10));
        
        //2011
        for(int i=0; i<Precip11.length; i++){
            ptotal11 = ptotal11 + Precip11[i];
        }
        double ave11 = ptotal11 / Precip11.length;
        //System.out.println("precip. 11 ave " + df.format(ave11));
        
        //2012
        for(int i=0; i<Precip12.length; i++){
            ptotal12 = ptotal12 + Precip12[i];
        }
        double ave12 = ptotal12 / Precip12.length;
        //System.out.println("precip. 12 ave " + df.format(ave12));
        
        //2013
        for(int i=0; i<Precip13.length; i++){
            ptotal13 = ptotal13 + Precip13[i];
        }
        double ave13 = ptotal13 / Precip13.length;
        //System.out.println("precip. 13 ave " + df.format(ave13));
        
        //2014
        for(int i=0; i<Precip14.length; i++){
            ptotal14 = ptotal14 + Precip14[i];
        }
        double ave14 = ptotal14 / Precip14.length;
        //System.out.println("precip. 14 ave " + df.format(ave14));
        
        //2015
        for(int i=0; i<Precip15.length; i++){
            ptotal15 = ptotal15 + Precip15[i];
        }
        double ave15 = ptotal15 / Precip15.length;
        //System.out.println("precip. 15 ave " + df.format(ave15));
        
        //2016
        for(int i=0; i<Precip16.length; i++){
            ptotal16 = ptotal16 + Precip16[i];
        }
        double ave16 = ptotal16 / Precip16.length;
        //System.out.println("precip. 16 ave " + df.format(ave16));
        
        //2017
        for(int i=0; i<Precip17.length; i++){
            ptotal17 = ptotal17 + Precip17[i];
        }
        double ave17 = ptotal17 / Precip17.length;
        //System.out.println("precip. 17 ave " + df.format(ave17));
        
        //2018
        for(int i=0; i<Precip18.length; i++){
            ptotal18 = ptotal18 + Precip18[i];
        }
        double ave18 = ptotal18 / Precip18.length;
        //System.out.println("precip. 18 ave " + df.format(ave18));
        
        //Average Precip. Array
        double[] Preciptot = {ave08, ave09, ave10, ave11, ave12, ave13, ave14, ave15, ave16, ave17, ave18};
        
        for(int i=0; i<Preciptot.length; i++){
            //System.out.println(df.format(Preciptot[i]));
            if (Preciptot[i] > .05){
                WillRain[i] = true;
            }else
                WillRain[i] = false;
            if(WillRain[i] == true){
                System.out.println("It will rain normally this November (1.6 to 3.5 in.)");
            }else if (WillRain[i] == false)
                System.out.println("It will have little rain this November(0.0 - 1.5 in.)");
        }
        System.out.println("");
        //Low temperature averages
        //2008
        for(int i = 0; i<year08L.length; i++){
            Ltotal08 = Ltotal08 + year08L[i];
        }
        int avL08 = Ltotal08 / year08L.length;
        System.out.println("Average low temp 08: " + avL08);
        //2009
        for(int i = 0; i<year09L.length; i++){
            Ltotal09 = Ltotal09 + year09L[i];
        }
        int avL09 = Ltotal09 / year09L.length;
        System.out.println("Average low temp 09: " + avL09);
        //2010
        for(int i = 0; i<year10L.length; i++){
            Ltotal10 = Ltotal10 + year10L[i];
        }
        int avL10 = Ltotal10 / year10L.length;
        System.out.println("Average low temp 10: " + avL10);
        //2011
        for(int i = 0; i<year11L.length; i++){
            Ltotal11 = Ltotal11 + year11L[i];
        }
        int avL11 = Ltotal11 / year11L.length;
        System.out.println("Average low temp 11: " + avL11);
        //2012
        for(int i = 0; i<year12L.length; i++){
            Ltotal12 = Ltotal12 + year12L[i];
        }
        int avL12 = Ltotal12 / year12L.length;
        System.out.println("Average low temp 12: " + avL12);
        //2013
        for(int i = 0; i<year13L.length; i++){
            Ltotal13 = Ltotal13 + year13L[i];
        }
        int avL13 = Ltotal13 / year13L.length;
        System.out.println("Average low temp 13: " + avL13);
        //2014
        for(int i = 0; i<year14L.length; i++){
            Ltotal14 = Ltotal14 + year14L[i];
        }
        int avL14 = Ltotal14 / year14L.length;
        System.out.println("Average low temp 14: " + avL14);
        //2015
        for(int i = 0; i<year15L.length; i++){
            Ltotal15 = Ltotal15 + year15L[i];
        }
        int avL15 = Ltotal15 / year15L.length;
        System.out.println("Average low temp 15: " + avL15);
        //2016
        for(int i = 0; i<year16L.length; i++){
            Ltotal16 = Ltotal16 + year16L[i];
        }
        int avL16 = Ltotal16 / year16L.length;
        System.out.println("Average low temp 16: " + avL16);
        //2017
        for(int i = 0; i<year17L.length; i++){
            Ltotal17 = Ltotal17 + year17L[i];
        }
        int avL17 = Ltotal17 / year17L.length;
        System.out.println("Average low temp 17: " + avL17);
        //2018
        for(int i = 0; i<year18L.length; i++){
            Ltotal18 = Ltotal18 + year18L[i];
        }
        int avL18 = Ltotal18 / year18L.length;
        System.out.println("Average low temp 18: " + avL18);
        
        //average array low temp
        int[] TempLA = {avL08, avL09, avL10, avL11, avL12, avL13, avL14, avL15, avL16, avL17, avL18};
        for(int i = 0; i<TempLA.length; i++){
            Latotal = Latotal + TempLA[i];
        }
        int Ltotal = Latotal / TempLA.length;
        System.out.println(Ltotal);
        //Lowest Temp average of all years 08-18 did equal the November 2019 Low Temp average (It wasn't supposed to)
        
        //High temperature averages
        //2008
        for(int i = 0; i<year08H.length; i++){
            Htotal08 = Htotal08 + year08H[i];
        }
        int avH08 = Htotal08 / year08H.length;
        System.out.println("Average high temp 08: " + avH08);
        //2009
        for(int i = 0; i<year09H.length; i++){
            Htotal09 = Htotal09 + year09H[i];
        }
        int avH09 = Htotal09 / year09H.length;
        System.out.println("Average high temp 09: " + avH09);
        //2010
        for(int i = 0; i<year10H.length; i++){
            Htotal10 = Htotal10 + year10H[i];
        }
        int avH10 = Htotal10 / year10H.length;
        System.out.println("Average high temp 10: " + avH10);
        //2011
        for(int i = 0; i<year11H.length; i++){
            Htotal11 = Htotal11 + year11H[i];
        }
        int avH11 = Htotal11 / year11H.length;
        System.out.println("Average high temp 11: " + avH11);
        //2012
        for(int i = 0; i<year12H.length; i++){
            Htotal12 = Htotal12 + year12H[i];
        }
        int avH12 = Htotal12 / year12H.length;
        System.out.println("Average high temp 12: " + avH12);
        //2013
        for(int i = 0; i<year13H.length; i++){
            Htotal13 = Htotal13 + year13H[i];
        }
        int avH13 = Htotal13 / year13H.length;
        System.out.println("Average high temp 13: " + avH13);
        //2014
        for(int i = 0; i<year14H.length; i++){
            Htotal14 = Htotal14 + year14H[i];
        }
        int avH14 = Htotal14 / year14H.length;
        System.out.println("Average high temp 14: " + avH14);
        //2015
        for(int i = 0; i<year15H.length; i++){
            Htotal15 = Htotal15 + year15H[i];
        }
        int avH15 = Htotal15 / year15H.length;
        System.out.println("Average high temp 15: " + avH15);
        //2016
        for(int i = 0; i<year16H.length; i++){
            Htotal16 = Htotal16 + year16H[i];
        }
        int avH16 = Htotal16 / year16H.length;
        System.out.println("Average high temp 16: " + avH16);
        //2017
        for(int i = 0; i<year17H.length; i++){
            Htotal17 = Htotal17 + year17H[i];
        }
        int avH17 = Htotal17 / year17H.length;
        System.out.println("Average high temp 17: " + avH17);
        //2018
        for(int i = 0; i<year18H.length; i++){
            Htotal18 = Htotal18 + year18H[i];
        }
        int avH18 = Htotal18 / year18H.length;
        System.out.println("Average high temp 18: " + avH18);
        
        //average array high temp
        int[] TempHA = {avH08, avH09, avH10, avH11, avH12, avH13, avH14, avH15, avH16, avH17, avH18};
        for(int i = 0; i<TempHA.length; i++){
            Hatotal = Hatotal + TempHA[i];
        }
        int Htotal = Hatotal / TempHA.length;
        System.out.println(Htotal);
        //average high yearly temp 08-18 is 2 off of the average temp for 2019. Code got 51, real average is 49.
        
        System.out.println("");
        //Daily November average low temps
        //2008 - 2018
        int[] LDay1 = {year08L[0], year09L[0], year10L[0], year11L[0], year12L[0], year13L[0], year14L[0], year15L[0], year16L[0], year17L[0], year18L[0]};
        int[] LDay2 = {year08L[1], year09L[1], year10L[1], year11L[1], year12L[1], year13L[1], year14L[1], year15L[1], year16L[1], year17L[1], year18L[1]};
        int[] LDay3 = {year08L[2], year09L[2], year10L[2], year11L[2], year12L[2], year13L[2], year14L[2], year15L[2], year16L[2], year17L[2], year18L[2]};
        int[] LDay4 = {year08L[3], year09L[3], year10L[3], year11L[3], year12L[3], year13L[3], year14L[3], year15L[3], year16L[3], year17L[3], year18L[3]};
        int[] LDay5 = {year08L[4], year09L[4], year10L[4], year11L[4], year12L[4], year13L[4], year14L[4], year15L[4], year16L[4], year17L[4], year18L[4]};
        int[] LDay6 = {year08L[5], year09L[5], year10L[5], year11L[5], year12L[5], year13L[5], year14L[5], year15L[5], year16L[5], year17L[5], year18L[5]};
        int[] LDay7 = {year08L[6], year09L[6], year10L[6], year11L[6], year12L[6], year13L[6], year14L[6], year15L[6], year16L[6], year17L[6], year18L[6]};
        int[] LDay8 = {year08L[7], year09L[7], year10L[7], year11L[7], year12L[7], year13L[7], year14L[7], year15L[7], year16L[7], year17L[7], year18L[7]};
        int[] LDay9 = {year08L[8], year09L[8], year10L[8], year11L[8], year12L[8], year13L[8], year14L[8], year15L[8], year16L[8], year17L[8], year18L[8]};
        int[] LDay10 = {year08L[9], year09L[9], year10L[9], year11L[9], year12L[9], year13L[9], year14L[9], year15L[9], year16L[9], year17L[9], year18L[9]};
        int[] LDay11 = {year08L[10], year09L[10], year10L[10], year11L[10], year12L[10], year13L[10], year14L[10], year15L[10], year16L[10], year17L[10], year18L[10]};
        int[] LDay12 = {year08L[11], year09L[11], year10L[11], year11L[11], year12L[11], year13L[11], year14L[11], year15L[11], year16L[11], year17L[11], year18L[11]};
        int[] LDay13 = {year08L[12], year09L[12], year10L[12], year11L[12], year12L[12], year13L[12], year14L[12], year15L[12], year16L[12], year17L[12], year18L[12]};
        int[] LDay14 = {year08L[13], year09L[13], year10L[13], year11L[13], year12L[13], year13L[13], year14L[13], year15L[13], year16L[13], year17L[13], year18L[13]};
        int[] LDay15 = {year08L[14], year09L[14], year10L[14], year11L[14], year12L[14], year13L[14], year14L[14], year15L[14], year16L[14], year17L[14], year18L[14]};
        int[] LDay16 = {year08L[15], year09L[15], year10L[15], year11L[15], year12L[15], year13L[15], year14L[15], year15L[15], year16L[15], year17L[15], year18L[15]};
        int[] LDay17 = {year08L[16], year09L[16], year10L[16], year11L[16], year12L[16], year13L[16], year14L[16], year15L[16], year16L[16], year17L[16], year18L[16]};
        int[] LDay18 = {year08L[17], year09L[17], year10L[17], year11L[17], year12L[17], year13L[17], year14L[17], year15L[17], year16L[17], year17L[17], year18L[17]};
        int[] LDay19 = {year08L[18], year09L[18], year10L[18], year11L[18], year12L[18], year13L[18], year14L[18], year15L[18], year16L[18], year17L[18], year18L[18]};
        int[] LDay20 = {year08L[19], year09L[19], year10L[19], year11L[19], year12L[19], year13L[19], year14L[19], year15L[19], year16L[19], year17L[19], year18L[19]};
        int[] LDay21 = {year08L[20], year09L[20], year10L[20], year11L[20], year12L[20], year13L[20], year14L[20], year15L[20], year16L[20], year17L[20], year18L[20]};
        int[] LDay22 = {year08L[21], year09L[21], year10L[21], year11L[21], year12L[21], year13L[21], year14L[21], year15L[21], year16L[21], year17L[21], year18L[21]};
        int[] LDay23 = {year08L[22], year09L[22], year10L[22], year11L[22], year12L[22], year13L[22], year14L[22], year15L[22], year16L[22], year17L[22], year18L[22]};
        int[] LDay24 = {year08L[23], year09L[23], year10L[23], year11L[23], year12L[23], year13L[23], year14L[23], year15L[23], year16L[23], year17L[23], year18L[23]};
        int[] LDay25 = {year08L[24], year09L[24], year10L[24], year11L[24], year12L[24], year13L[24], year14L[24], year15L[24], year16L[24], year17L[24], year18L[24]};
        int[] LDay26 = {year08L[25], year09L[25], year10L[25], year11L[25], year12L[25], year13L[25], year14L[25], year15L[25], year16L[25], year17L[25], year18L[25]};
        int[] LDay27 = {year08L[26], year09L[26], year10L[26], year11L[26], year12L[26], year13L[26], year14L[26], year15L[26], year16L[26], year17L[26], year18L[26]};
        int[] LDay28 = {year08L[27], year09L[27], year10L[27], year11L[27], year12L[27], year13L[27], year14L[27], year15L[27], year16L[27], year17L[27], year18L[27]};
        int[] LDay29 = {year08L[28], year09L[28], year10L[28], year11L[28], year12L[28], year13L[28], year14L[28], year15L[28], year16L[28], year17L[28], year18L[28]};
        int[] LDay30 = {year08L[29], year09L[29], year10L[29], year11L[29], year12L[29], year13L[29], year14L[29], year15L[29], year16L[29], year17L[29], year18L[29]};

        //Daily November average high temps
        //2008 - 2018
        int[] HDay1 = {year08H[0], year09H[0], year10H[0], year11H[0], year12H[0], year13H[0], year14H[0], year15H[0], year16H[0], year17H[0], year18H[0]};
        int[] HDay2 = {year08H[1], year09H[1], year10H[1], year11H[1], year12H[1], year13H[1], year14H[1], year15H[1], year16H[1], year17H[1], year18H[1]};
        int[] HDay3 = {year08H[2], year09H[2], year10H[2], year11H[2], year12H[2], year13H[2], year14H[2], year15H[2], year16H[2], year17H[2], year18H[2]};
        int[] HDay4 = {year08H[3], year09H[3], year10H[3], year11H[3], year12H[3], year13H[3], year14H[3], year15H[3], year16H[3], year17H[3], year18H[3]};
        int[] HDay5 = {year08H[4], year09H[4], year10H[4], year11H[4], year12H[4], year13H[4], year14H[4], year15H[4], year16H[4], year17H[4], year18H[4]};
        int[] HDay6 = {year08H[5], year09H[5], year10H[5], year11H[5], year12H[5], year13H[5], year14H[5], year15H[5], year16H[5], year17H[5], year18H[5]};
        int[] HDay7 = {year08H[6], year09H[6], year10H[6], year11H[6], year12H[6], year13H[6], year14H[6], year15H[6], year16H[6], year17H[6], year18H[6]};
        int[] HDay8 = {year08H[7], year09H[7], year10H[7], year11H[7], year12H[7], year13H[7], year14H[7], year15H[7], year16H[7], year17H[7], year18H[7]};
        int[] HDay9 = {year08H[8], year09H[8], year10H[8], year11H[8], year12H[8], year13H[8], year14H[8], year15H[8], year16H[8], year17H[8], year18H[8]};
        int[] HDay10 = {year08H[9], year09H[9], year10H[9], year11H[9], year12H[9], year13H[9], year14H[9], year15H[9], year16H[9], year17H[9], year18H[9]};
        int[] HDay11 = {year08H[10], year09H[10], year10H[10], year11H[10], year12H[10], year13H[10], year14H[10], year15H[10], year16H[10], year17H[10], year18H[10]};
        int[] HDay12 = {year08H[11], year09H[11], year10H[11], year11H[11], year12H[11], year13H[11], year14H[11], year15H[11], year16H[11], year17H[11], year18H[11]};
        int[] HDay13 = {year08H[12], year09H[12], year10H[12], year11H[12], year12H[12], year13H[12], year14H[12], year15H[12], year16H[12], year17H[12], year18H[12]};
        int[] HDay14 = {year08H[13], year09H[13], year10H[13], year11H[13], year12H[13], year13H[13], year14H[13], year15H[13], year16H[13], year17H[13], year18H[13]};
        int[] HDay15 = {year08H[14], year09H[14], year10H[14], year11H[14], year12H[14], year13H[14], year14H[14], year15H[14], year16H[14], year17H[14], year18H[14]};
        int[] HDay16 = {year08H[15], year09H[15], year10H[15], year11H[15], year12H[15], year13H[15], year14H[15], year15H[15], year16H[15], year17H[15], year18H[15]};
        int[] HDay17 = {year08H[16], year09H[16], year10H[16], year11H[16], year12H[16], year13H[16], year14H[16], year15H[16], year16H[16], year17H[16], year18H[16]};
        int[] HDay18 = {year08H[17], year09H[17], year10H[17], year11H[17], year12H[17], year13H[17], year14H[17], year15H[17], year16H[17], year17H[17], year18H[17]};
        int[] HDay19 = {year08H[18], year09H[18], year10H[18], year11H[18], year12H[18], year13H[18], year14H[18], year15H[18], year16H[18], year17H[18], year18H[18]};
        int[] HDay20 = {year08H[19], year09H[19], year10H[19], year11H[19], year12H[19], year13H[19], year14H[19], year15H[19], year16H[19], year17H[19], year18H[19]};
        int[] HDay21 = {year08H[20], year09H[20], year10H[20], year11H[20], year12H[20], year13H[20], year14H[20], year15H[20], year16H[20], year17H[20], year18H[20]};
        int[] HDay22 = {year08H[21], year09H[21], year10H[21], year11H[21], year12H[21], year13H[21], year14H[21], year15H[21], year16H[21], year17H[21], year18H[21]};
        int[] HDay23 = {year08H[22], year09H[22], year10H[22], year11H[22], year12H[22], year13H[22], year14H[22], year15H[22], year16H[22], year17H[22], year18H[22]};
        int[] HDay24 = {year08H[23], year09H[23], year10H[23], year11H[23], year12H[23], year13H[23], year14H[23], year15H[23], year16H[23], year17H[23], year18H[23]};
        int[] HDay25 = {year08H[24], year09H[24], year10H[24], year11H[24], year12H[24], year13H[24], year14H[24], year15H[24], year16H[24], year17H[24], year18H[24]};
        int[] HDay26 = {year08H[25], year09H[25], year10H[25], year11H[25], year12H[25], year13H[25], year14H[25], year15H[25], year16H[25], year17H[25], year18H[25]};
        int[] HDay27 = {year08H[26], year09H[26], year10H[26], year11H[26], year12H[26], year13H[26], year14H[26], year15H[26], year16H[26], year17H[26], year18H[26]};
        int[] HDay28 = {year08H[27], year09H[27], year10H[27], year11H[27], year12H[27], year13H[27], year14H[27], year15H[27], year16H[27], year17H[27], year18H[27]};
        int[] HDay29 = {year08H[28], year09H[28], year10H[28], year11H[28], year12H[28], year13H[28], year14H[28], year15H[28], year16H[28], year17H[28], year18H[28]};
        int[] HDay30 = {year08H[29], year09H[29], year10H[29], year11H[29], year12H[29], year13H[29], year14H[29], year15H[29], year16H[29], year17H[29], year18H[29]};

        //getting the high daily averages over the years
        //High Day 1
        for(int i = 0; i<HDay1.length; i++){
            HDtotal1 = HDtotal1 + HDay1[i];
        }
        double avHD1 = HDtotal1 / HDay1.length;
        System.out.println("Average high temp November 1: " + df.format(avHD1));

        //High Day 2
        for(int i = 0; i<HDay2.length; i++){
            HDtotal2 = HDtotal2 + HDay2[i];
        }
        double avHD2 = HDtotal2 / HDay2.length;
        System.out.println("Average high temp November 2: " + df.format(avHD2));

        //High Day 3
        for(int i = 0; i<HDay3.length; i++){
            HDtotal3 = HDtotal3 + HDay3[i];
        }
        double avHD3 = HDtotal3 / HDay3.length;
        System.out.println("Average high temp November 3: " + df.format(avHD3));

        //High Day 4
        for(int i = 0; i<HDay4.length; i++){
            HDtotal4 = HDtotal4 + HDay4[i];
        }
        double avHD4 = HDtotal4 / HDay4.length;
        System.out.println("Average high temp November 4: " + df.format(avHD4));

        //High Day 5
        for(int i = 0; i<HDay5.length; i++){
            HDtotal5 = HDtotal5 + HDay5[i];
        }
        double avHD5 = HDtotal5 / HDay5.length;
        System.out.println("Average high temp November 5: " + df.format(avHD5));

        //High Day 6
        for(int i = 0; i<HDay6.length; i++){
            HDtotal6 = HDtotal6 + HDay6[i];
        }
        double avHD6 = HDtotal6 / HDay6.length;
        System.out.println("Average high temp November 6: " + df.format(avHD6));

        //High Day 7
        for(int i = 0; i<HDay7.length; i++){
            HDtotal7 = HDtotal7 + HDay7[i];
        }
        double avHD7 = HDtotal7 / HDay7.length;
        System.out.println("Average high temp November 7: " + df.format(avHD7));

        //High Day 8
        for(int i = 0; i<HDay8.length; i++){
            HDtotal8 = HDtotal8 + HDay8[i];
        }
        double avHD8 = HDtotal8 / HDay8.length;
        System.out.println("Average high temp November 8: " + df.format(avHD8));

        //High Day 9
        for(int i = 0; i<HDay9.length; i++){
            HDtotal9 = HDtotal9 + HDay9[i];
        }
        double avHD9 = HDtotal9 / HDay9.length;
        System.out.println("Average high temp November 9: " + df.format(avHD9));

        //High Day 10
        for(int i = 0; i<HDay10.length; i++){
            HDtotal10 = HDtotal10 + HDay10[i];
        }
        double avHD10 = HDtotal10 / HDay10.length;
        System.out.println("Average high temp November 10: " + df.format(avHD10));

        //High Day 11
        for(int i = 0; i<HDay11.length; i++){
            HDtotal11 = HDtotal11 + HDay11[i];
        }
        double avHD11 = HDtotal11 / HDay11.length;
        System.out.println("Average high temp November 11: " + df.format(avHD11));

        //High Day 12
        for(int i = 0; i<HDay12.length; i++){
            HDtotal12 = HDtotal12 + HDay12[i];
        }
        double avHD12 = HDtotal12 / HDay12.length;
        System.out.println("Average high temp November 12: " + df.format(avHD12));

        //High Day 13
        for(int i = 0; i<HDay13.length; i++){
            HDtotal13 = HDtotal13 + HDay13[i];
        }
        double avHD13 = HDtotal13 / HDay13.length;
        System.out.println("Average high temp November 13: " + df.format(avHD13));

        //High Day 14
        for(int i = 0; i<HDay14.length; i++){
            HDtotal14 = HDtotal14 + HDay14[i];
        }
        double avHD14 = HDtotal14 / HDay14.length;
        System.out.println("Average high temp November 14: " + df.format(avHD14));

        //High Day 15
        for(int i = 0; i<HDay15.length; i++){
            HDtotal15 = HDtotal15 + HDay15[i];
        }
        double avHD15 = HDtotal15 / HDay15.length;
        System.out.println("Average high temp November 15: " + df.format(avHD15));

        //High Day 16
        for(int i = 0; i<HDay16.length; i++){
            HDtotal16 = HDtotal16 + HDay16[i];
        }
        double avHD16 = HDtotal16 / HDay16.length;
        System.out.println("Average high temp November 16: " + df.format(avHD16));

        //High Day 17
        for(int i = 0; i<HDay17.length; i++){
            HDtotal17 = HDtotal17 + HDay17[i];
        }
        double avHD17 = HDtotal17 / HDay17.length;
        System.out.println("Average high temp November 17: " + df.format(avHD17));

        //High Day 18
        for(int i = 0; i<HDay18.length; i++){
            HDtotal18 = HDtotal18 + HDay18[i];
        }
        double avHD18 = HDtotal18 / HDay18.length;
        System.out.println("Average high temp November 18: " + df.format(avHD18));

        //High Day 19
        for(int i = 0; i<HDay19.length; i++){
            HDtotal19 = HDtotal19 + HDay19[i];
        }
        double avHD19 = HDtotal19 / HDay19.length;
        System.out.println("Average high temp November 19: " + df.format(avHD19));

        //High Day 20
        for(int i = 0; i<HDay20.length; i++){
            HDtotal20 = HDtotal20 + HDay20[i];
        }
        double avHD20 = HDtotal20 / HDay20.length;
        System.out.println("Average high temp November 20: " + df.format(avHD20));

        //High Day 21
        for(int i = 0; i<HDay21.length; i++){
            HDtotal21 = HDtotal21 + HDay21[i];
        }
        double avHD21 = HDtotal21 / HDay21.length;
        System.out.println("Average high temp November 21: " + df.format(avHD21));

        //High Day 22
        for(int i = 0; i<HDay22.length; i++){
            HDtotal22 = HDtotal22 + HDay22[i];
        }
        double avHD22 = HDtotal22 / HDay22.length;
        System.out.println("Average high temp November 22: " + df.format(avHD22));

        //High Day 23
        for(int i = 0; i<HDay23.length; i++){
            HDtotal23 = HDtotal23 + HDay23[i];
        }
        double avHD23 = HDtotal23 / HDay23.length;
        System.out.println("Average high temp November 23: " + df.format(avHD23));

        //High Day 24
        for(int i = 0; i<HDay24.length; i++){
            HDtotal24 = HDtotal24 + HDay24[i];
        }
        double avHD24 = HDtotal24 / HDay24.length;
        System.out.println("Average high temp November 24: " + df.format(avHD24));

        //High Day 25
        for(int i = 0; i<HDay25.length; i++){
            HDtotal25 = HDtotal25 + HDay25[i];
        }
        double avHD25 = HDtotal25 / HDay25.length;
        System.out.println("Average high temp November 25: " + df.format(avHD25));

        //High Day 26
        for(int i = 0; i<HDay26.length; i++){
            HDtotal26 = HDtotal26 + HDay26[i];
        }
        double avHD26 = HDtotal26 / HDay26.length;
        System.out.println("Average high temp November 26: " + df.format(avHD26));

        //High Day 27
        for(int i = 0; i<HDay27.length; i++){
            HDtotal27 = HDtotal27 + HDay27[i];
        }
        double avHD27 = HDtotal27 / HDay27.length;
        System.out.println("Average high temp November 7: " + df.format(avHD27));

        //High Day 28
        for(int i = 0; i<HDay28.length; i++){
            HDtotal28 = HDtotal28 + HDay28[i];
        }
        double avHD28 = HDtotal28 / HDay28.length;
        System.out.println("Average high temp November 8: " + df.format(avHD28));

        //High Day 29
        for(int i = 0; i<HDay29.length; i++){
            HDtotal29 = HDtotal29 + HDay29[i];
        }
        double avHD29 = HDtotal29 / HDay29.length;
        System.out.println("Average high temp November 9: " + df.format(avHD29));

        //High Day 30
        for(int i = 0; i<HDay30.length; i++){
            HDtotal30 = HDtotal30 + HDay30[i];
        }
        double avHD30 = HDtotal30 / HDay30.length;
        System.out.println("Average high temp November 30: " + df.format(avHD30));
        
        System.out.println("");
        //getting the low daily averages over the years
        //low Day 1
        for(int i = 0; i<LDay1.length; i++){
            LDtotal1 = LDtotal1 + LDay1[i];
        }
        double avLD1 = LDtotal1 / LDay1.length;
        System.out.println("Average low temp November 1: " + df.format(avLD1));

        //low Day 2
        for(int i = 0; i<LDay2.length; i++){
            LDtotal2 = LDtotal2 + LDay2[i];
        }
        double avLD2 = LDtotal2 / LDay2.length;
        System.out.println("Average low temp November 2: " + df.format(avLD2));

        //low Day 3
        for(int i = 0; i<LDay3.length; i++){
            LDtotal3 = LDtotal3 + LDay3[i];
        }
        double avLD3 = LDtotal3 / LDay3.length;
        System.out.println("Average low temp November 3: " + df.format(avLD3));

        //low Day 4
        for(int i = 0; i<LDay4.length; i++){
            LDtotal4 = LDtotal4 + LDay4[i];
        }
        double avLD4 = LDtotal4 / LDay4.length;
        System.out.println("Average low temp November 4: " + df.format(avLD4));

        //low Day 5
        for(int i = 0; i<LDay5.length; i++){
            LDtotal5 = LDtotal5 + LDay5[i];
        }
        double avLD5 = LDtotal5 / LDay5.length;
        System.out.println("Average low temp November 5: " + df.format(avLD5));

        //low Day 6
        for(int i = 0; i<LDay6.length; i++){
            LDtotal6 = LDtotal6 + LDay6[i];
        }
        double avLD6 = LDtotal6 / LDay6.length;
        System.out.println("Average low temp November 6: " + df.format(avLD6));

        //low Day 7
        for(int i = 0; i<LDay7.length; i++){
            LDtotal7 = LDtotal7 + LDay7[i];
        }
        double avLD7 = LDtotal7 / LDay7.length;
        System.out.println("Average low temp November 7: " + df.format(avLD7));

        //low Day 8
        for(int i = 0; i<LDay8.length; i++){
            LDtotal8 = LDtotal8 + LDay8[i];
        }
        double avLD8 = LDtotal8 / LDay8.length;
        System.out.println("Average low temp November 8: " + df.format(avLD8));

        //low Day 9
        for(int i = 0; i<LDay9.length; i++){
            LDtotal9 = LDtotal9 + LDay9[i];
        }
        double avLD9 = LDtotal9 / LDay9.length;
        System.out.println("Average low temp November 9: " + df.format(avLD9));

        //low Day 10
        for(int i = 0; i<LDay10.length; i++){
            LDtotal10 = LDtotal10 + LDay10[i];
        }
        double avLD10 = LDtotal10 / LDay10.length;
        System.out.println("Average low temp November 10: " + df.format(avLD10));

        //low Day 11
        for(int i = 0; i<LDay11.length; i++){
            LDtotal11 = LDtotal11 + LDay11[i];
        }
        double avLD11 = LDtotal11 / LDay11.length;
        System.out.println("Average low temp November 11: " + df.format(avLD11));

        //low Day 12
        for(int i = 0; i<LDay12.length; i++){
            LDtotal12 = LDtotal12 + LDay12[i];
        }
        double avLD12 = LDtotal12 / LDay12.length;
        System.out.println("Average low temp November 12: " + df.format(avLD12));

        //low Day 13
        for(int i = 0; i<LDay13.length; i++){
            LDtotal13 = LDtotal13 + LDay13[i];
        }
        double avLD13 = LDtotal13 / LDay13.length;
        System.out.println("Average low temp November 13: " + df.format(avLD13));

        //low Day 14
        for(int i = 0; i<LDay14.length; i++){
            LDtotal14 = LDtotal14 + LDay14[i];
        }
        double avLD14 = LDtotal14 / LDay14.length;
        System.out.println("Average low temp November 14: " + df.format(avLD14));

        //low Day 15
        for(int i = 0; i<LDay15.length; i++){
            LDtotal15 = LDtotal15 + LDay15[i];
        }
        double avLD15 = LDtotal15 / LDay15.length;
        System.out.println("Average low temp November 15: " + df.format(avLD15));

        //low Day 16
        for(int i = 0; i<LDay16.length; i++){
            LDtotal16 = LDtotal16 + LDay16[i];
        }
        double avLD16 = LDtotal16 / LDay16.length;
        System.out.println("Average low temp November 16: " + df.format(avLD16));

        //low Day 17
        for(int i = 0; i<LDay17.length; i++){
            LDtotal17 = LDtotal17 + LDay17[i];
        }
        double avLD17 = LDtotal17 / LDay17.length;
        System.out.println("Average low temp November 17: " + df.format(avLD17));

        //low Day 18
        for(int i = 0; i<LDay18.length; i++){
            LDtotal18 = LDtotal18 + LDay18[i];
        }
        double avLD18 = LDtotal18 / LDay18.length;
        System.out.println("Average low temp November 18: " + df.format(avLD18));

        //low Day 19
        for(int i = 0; i<LDay19.length; i++){
            LDtotal19 = LDtotal19 + LDay19[i];
        }
        double avLD19 = LDtotal19 / LDay19.length;
        System.out.println("Average low temp November 19: " + df.format(avLD19));

        //low Day 20
        for(int i = 0; i<LDay20.length; i++){
            LDtotal20 = LDtotal20 + LDay20[i];
        }
        double avLD20 = LDtotal20 / LDay20.length;
        System.out.println("Average low temp November 20: " + df.format(avLD20));

        //low Day 21
        for(int i = 0; i<LDay21.length; i++){
            LDtotal21 = LDtotal21 + LDay21[i];
        }
        double avLD21 = LDtotal21 / LDay21.length;
        System.out.println("Average low temp November 21: " + df.format(avLD21));

        //low Day 22
        for(int i = 0; i<LDay22.length; i++){
            LDtotal22 = LDtotal22 + LDay22[i];
        }
        double avLD22 = LDtotal22 / LDay22.length;
        System.out.println("Average low temp November 22: " + df.format(avLD22));

        //low Day 23
        for(int i = 0; i<LDay23.length; i++){
            LDtotal23 = LDtotal23 + LDay23[i];
        }
        double avLD23 = LDtotal23 / LDay23.length;
        System.out.println("Average low temp November 23: " + df.format(avLD23));

        //low Day 24
        for(int i = 0; i<LDay24.length; i++){
            LDtotal24 = LDtotal24 + LDay24[i];
        }
        double avLD24 = LDtotal24 / LDay24.length;
        System.out.println("Average low temp November 24: " + df.format(avLD24));

        //low Day 25
        for(int i = 0; i<LDay25.length; i++){
            LDtotal25 = LDtotal25 + LDay25[i];
        }
        double avLD25 = LDtotal25 / LDay25.length;
        System.out.println("Average low temp November 25: " + df.format(avLD25));

        //low Day 26
        for(int i = 0; i<LDay26.length; i++){
            LDtotal26 = LDtotal26 + LDay26[i];
        }
        double avLD26 = LDtotal26 / LDay26.length;
        System.out.println("Average low temp November 26: " + df.format(avLD26));

        //low Day 27
        for(int i = 0; i<LDay27.length; i++){
            LDtotal27 = LDtotal27 + LDay27[i];
        }
        double avLD27 = LDtotal27 / LDay27.length;
        System.out.println("Average low temp November 27: " + df.format(avLD27));

        //low Day 28
        for(int i = 0; i<LDay28.length; i++){
            LDtotal28 = LDtotal28 + LDay28[i];
        }
        double avLD28 = LDtotal28 / LDay28.length;
        System.out.println("Average low temp November 28: " + df.format(avLD28));

        //low Day 29
        for(int i = 0; i<LDay29.length; i++){
            LDtotal29 = LDtotal29 + LDay29[i];
        }
        double avLD29 = LDtotal29 / LDay29.length;
        System.out.println("Average low temp November 29: " + df.format(avLD29));

        //low Day 30
        for(int i = 0; i<LDay30.length; i++){
            LDtotal30 = LDtotal30 + LDay30[i];
        }
        double avLD30 = LDtotal30 / LDay30.length;
        System.out.println("Average low temp November 30: " + df.format(avLD30));
        
        System.out.println("");
        //Now, with the found outliers, re-calculate the averages
        int[] newyearH18 = {62,67,57,56,47,56,64,53,45,47,44,49,46,33,35,42,49,40,46,41,42,32,42,52,44,45,42,42};
        int[] newyearL18 = {27,29,32,36,40,30,26,31,27,20,23,25,16,18,26,28,28,30,29,8,6,19,31,31,28,30,14};
        int[] newyearL17 = {28,32,39,38,39,33,27,26,19,19,22,29,26,26,33,20,25,28,25,31,26,24,27,32,26,21,21,23};
        int[] newyearL16 = {27,27,30,33,31,29,31,34,33,30,35,29,32,42,40,33,33,34,28,27,27,28,32,33,32,27,27,35};
        int[] newyearL14 = {33,38,34,34,36,42,42,29,29,31,28,42,30,29,21,21,28,32,18,18,22,15,28,45,38,30,22,13,17};
        
        //New year averages
        int OuttotalH18 = 0, OuttotalL18 = 0,  OuttotalL17 = 0,  OuttotalL16 = 0,  OuttotalL14 = 0;
        //H2018
        for(int i = 0; i<newyearH18.length; i++){
            OuttotalH18 = OuttotalH18 + newyearH18[i];
        }
        int avOH18 = OuttotalH18 / newyearH18.length;
        System.out.println("Outlier HIGH average in 2018: " + avOH18);
        //L2018
        for(int i = 0; i<newyearL18.length; i++){
            OuttotalL18 = OuttotalL18 + newyearL18[i];
        }
        int avOL18 = OuttotalL18 / newyearL18.length;
        System.out.println("Outlier LOW average in 2018: " + avOL18);
        //L2017
        for(int i = 0; i<newyearL17.length; i++){
            OuttotalL17 = OuttotalL17 + newyearL17[i];
        }
        int avOL17 = OuttotalL17 / newyearL17.length;
        System.out.println("Outlier average in 2017: " + avOL17);
        //L2016
        for(int i = 0; i<newyearL16.length; i++){
            OuttotalL16 = OuttotalL16 + newyearL16[i];
        }
        int avOL16 = OuttotalL16 / newyearL16.length;
        System.out.println("Outlier average in 2016: " + avOL16);
        //L2014
        for(int i = 0; i<newyearL14.length; i++){
            OuttotalL14 = OuttotalL14 + newyearL14[i];
        }
        int avOL14 = OuttotalL14 / newyearL14.length;
        System.out.println("Outlier average in 2014: " + avOL14);
        
        //differences from the original and with the outliers out
        int OTH18 = Math.abs(avH18 - avOH18);
        int OTL18 = Math.abs(avL18 - avOL18);
        int OTL17 = Math.abs(avL17 - avOL17);
        int OTL16 = Math.abs(avL16 - avOL16);
        int OTL14 = Math.abs(avL14 - avOL14);
        
        System.out.println("Original: " + avH18 + " Outliers Out: " + avOH18 + " Difference: " + OTH18);
        System.out.println("Original: " + avL18 + " Outliers Out: " + avOL18 + " Difference: " + OTL18);
        System.out.println("Original: " + avL17 + " Outliers Out: " + avOL17 + " Difference: " + OTL17);
        System.out.println("Original: " + avL16 + " Outliers Out: " + avOL16 + " Difference: " + OTL16);
        System.out.println("Original: " + avL14 + " Outliers Out: " + avOL14 + " Difference: " + OTL14 + "\n");
        
        //After testing 2019 and its results, time to predict 2020
        //2019 low
        for(int i = 0; i<year19L.length; i++){
            Ltotal19 = Ltotal19 + year19L[i];
        }
        int avL19 = Ltotal19 / year19L.length;
        System.out.println("Average low temp 19: " + avL19);
        
        for(int i = 0; i<year19H.length; i++){
            Htotal19 = Htotal19 + year19H[i];
        }
        int avH19 = Htotal19 / year19H.length;
        System.out.println("Average high temp 19: " + avH19);
        
        //making a new array low to include 2019
        int[] Lw19 = new int[TempLA.length+1];
        System.arraycopy(TempLA, 0, Lw19, 0, TempLA.length);
        insertIntoArray(Lw19,11,avL19);
        
        //making a new array high to include 2019
        int[] Hw19 = new int[TempHA.length+1];
        System.arraycopy(TempHA, 0, Hw19, 0, TempHA.length);
        insertIntoArray(Hw19,11,avH19);
        
        /**DAILY LOWS**/
        double LD1total19 = LDtotal1 + year19L[0];
        double LD2total19 = LDtotal2 + year19L[1];
        double LD3total19 = LDtotal3 + year19L[2];
        double LD4total19 = LDtotal4 + year19L[3];
        double LD5total19 = LDtotal5 + year19L[4];
        double LD6total19 = LDtotal6 + year19L[5];
        double LD7total19 = LDtotal7 + year19L[6];
        double LD8total19 = LDtotal8 + year19L[7];
        double LD9total19 = LDtotal9 + year19L[8];
        double LD10total19 = LDtotal10 + year19L[9];
        double LD11total19 = LDtotal11 + year19L[10];
        double LD12total19 = LDtotal12 + year19L[11];
        double LD13total19 = LDtotal13 + year19L[12];
        double LD14total19 = LDtotal14 + year19L[13];
        double LD15total19 = LDtotal15 + year19L[14];
        double LD16total19 = LDtotal16 + year19L[15];
        double LD17total19 = LDtotal17 + year19L[16];
        double LD18total19 = LDtotal18 + year19L[17];
        double LD19total19 = LDtotal19 + year19L[18];
        double LD20total19 = LDtotal20 + year19L[19];
        double LD21total19 = LDtotal21 + year19L[20];
        double LD22total19 = LDtotal22 + year19L[21];
        double LD23total19 = LDtotal23 + year19L[22];
        double LD24total19 = LDtotal24 + year19L[23];
        double LD25total19 = LDtotal25 + year19L[24];
        double LD26total19 = LDtotal26 + year19L[25];
        double LD27total19 = LDtotal27 + year19L[26];
        double LD28total19 = LDtotal28 + year19L[27];
        double LD29total19 = LDtotal29 + year19L[28];
        double LD30total19 = LDtotal30 + year19L[29];
        
        double avD1L19 = LD1total19 / LDay1.length+1;
        double avD2L19 = LD2total19 / LDay2.length+1;
        double avD3L19 = LD3total19 / LDay3.length+1;
        double avD4L19 = LD4total19 / LDay4.length+1;
        double avD5L19 = LD5total19 / LDay5.length+1;
        double avD6L19 = LD6total19 / LDay6.length+1;
        double avD7L19 = LD7total19 / LDay7.length+1;
        double avD8L19 = LD8total19 / LDay8.length+1;
        double avD9L19 = LD9total19 / LDay9.length+1;
        double avD10L19 = LD10total19 / LDay10.length+1;
        double avD11L19 = LD11total19 / LDay11.length+1;
        double avD12L19 = LD12total19 / LDay12.length+1;
        double avD13L19 = LD13total19 / LDay13.length+1;
        double avD14L19 = LD14total19 / LDay14.length+1;
        double avD15L19 = LD15total19 / LDay15.length+1;
        double avD16L19 = LD16total19 / LDay16.length+1;
        double avD17L19 = LD17total19 / LDay17.length+1;
        double avD18L19 = LD18total19 / LDay18.length+1;
        double avD19L19 = LD19total19 / LDay19.length+1;
        double avD20L19 = LD20total19 / LDay20.length+1;
        double avD21L19 = LD21total19 / LDay21.length+1;
        double avD22L19 = LD22total19 / LDay22.length+1;
        double avD23L19 = LD23total19 / LDay23.length+1;
        double avD24L19 = LD24total19 / LDay24.length+1;
        double avD25L19 = LD25total19 / LDay25.length+1;
        double avD26L19 = LD26total19 / LDay26.length+1;
        double avD27L19 = LD27total19 / LDay27.length+1;
        double avD28L19 = LD28total19 / LDay28.length+1;
        double avD29L19 = LD29total19 / LDay29.length+1;
        double avD30L19 = LD30total19 / LDay30.length+1;
        
        /**DAILY HIGHS**/
        double HD1total19 = HDtotal1 + year19H[0];
        double HD2total19 = HDtotal2 + year19H[1];
        double HD3total19 = HDtotal3 + year19H[2];
        double HD4total19 = HDtotal4 + year19H[3];
        double HD5total19 = HDtotal5 + year19H[4];
        double HD6total19 = HDtotal6 + year19H[5];
        double HD7total19 = HDtotal7 + year19H[6];
        double HD8total19 = HDtotal8 + year19H[7];
        double HD9total19 = HDtotal9 + year19H[8];
        double HD10total19 = HDtotal10 + year19H[9];
        double HD11total19 = HDtotal11 + year19H[10];
        double HD12total19 = HDtotal12 + year19H[11];
        double HD13total19 = HDtotal13 + year19H[12];
        double HD14total19 = HDtotal14 + year19H[13];
        double HD15total19 = HDtotal15 + year19H[14];
        double HD16total19 = HDtotal16 + year19H[15];
        double HD17total19 = HDtotal17 + year19H[16];
        double HD18total19 = HDtotal18 + year19H[17];
        double HD19total19 = HDtotal19 + year19H[18];
        double HD20total19 = HDtotal20 + year19H[19];
        double HD21total19 = HDtotal21 + year19H[20];
        double HD22total19 = HDtotal22 + year19H[21];
        double HD23total19 = HDtotal23 + year19H[22];
        double HD24total19 = HDtotal24 + year19H[23];
        double HD25total19 = HDtotal25 + year19H[24];
        double HD26total19 = HDtotal26 + year19H[25];
        double HD27total19 = HDtotal27 + year19H[26];
        double HD28total19 = HDtotal28 + year19H[27];
        double HD29total19 = HDtotal29 + year19H[28];
        double HD30total19 = HDtotal30 + year19H[29];
        
        double avD1H19 = HD1total19 / HDay1.length+1;
        double avD2H19 = HD2total19 / HDay2.length+1;
        double avD3H19 = HD3total19 / HDay3.length+1;
        double avD4H19 = HD4total19 / HDay4.length+1;
        double avD5H19 = HD5total19 / HDay5.length+1;
        double avD6H19 = HD6total19 / HDay6.length+1;
        double avD7H19 = HD7total19 / HDay7.length+1;
        double avD8H19 = HD8total19 / HDay8.length+1;
        double avD9H19 = HD9total19 / HDay9.length+1;
        double avD10H19 = HD10total19 / HDay10.length+1;
        double avD11H19 = HD11total19 / HDay11.length+1;
        double avD12H19 = HD12total19 / HDay12.length+1;
        double avD13H19 = HD13total19 / HDay13.length+1;
        double avD14H19 = HD14total19 / HDay14.length+1;
        double avD15H19 = HD15total19 / HDay15.length+1;
        double avD16H19 = HD16total19 / HDay16.length+1;
        double avD17H19 = HD17total19 / HDay17.length+1;
        double avD18H19 = HD18total19 / HDay18.length+1;
        double avD19H19 = HD19total19 / HDay19.length+1;
        double avD20H19 = HD20total19 / HDay20.length+1;
        double avD21H19 = HD21total19 / HDay21.length+1;
        double avD22H19 = HD22total19 / HDay22.length+1;
        double avD23H19 = HD23total19 / HDay23.length+1;
        double avD24H19 = HD24total19 / HDay24.length+1;
        double avD25H19 = HD25total19 / HDay25.length+1;
        double avD26H19 = HD26total19 / HDay26.length+1;
        double avD27H19 = HD27total19 / HDay27.length+1;
        double avD28H19 = HD28total19 / HDay28.length+1;
        double avD29H19 = HD29total19 / HDay29.length+1;
        double avD30H19 = HD30total19 / HDay30.length+1;
        
        double[] DailyHigh2020 = {avD1H19,avD2H19,avD3H19,avD4H19,avD5H19,avD6H19,avD7H19,avD8H19,avD9H19,avD10H19,avD11H19,avD12H19,avD13H19,avD14H19,avD15H19,avD16H19,avD17H19,avD18H19,avD19H19,avD20H19,avD21H19,avD22H19,avD23H19,avD24H19,avD25H19,avD26H19,avD27H19,avD28H19,avD29H19,avD30H19};
        double[] DailyLow2020 = {avD1L19,avD2L19,avD3L19,avD4L19,avD5L19,avD6L19,avD7L19,avD8L19,avD9L19,avD10L19,avD11L19,avD12L19,avD13L19,avD14L19,avD15L19,avD16L19,avD17L19,avD18L19,avD19L19,avD20L19,avD21L19,avD22L19,avD23L19,avD24L19,avD25L19,avD26L19,avD27L19,avD28L19,avD29L19,avD30L19};
        
        //2020 Low
        for(int i = 0; i<Lw19.length; i++){
            tempL = tempL + Lw19[i];
        }
        double totL19 = tempL / Lw19.length;
        
        //2020 High
        for(int i = 0; i<Hw19.length; i++){
            tempH = tempH + Hw19[i];
        }
        double totH19 = tempH / Hw19.length;
        
        
        System.out.println("\n2020 estimation:");
        System.out.println("Month overall high: " + totH19);
        System.out.println("Month overall low: " + df.format(totL19));
        System.out.println("Daily highs: ");
        for(int i = 0; i<DailyHigh2020.length; i++){
            System.out.println("Day " + (i+1) + ": " + df.format(DailyHigh2020[i]));
        }
        System.out.println("");
       // Arrays.stream(DailyHigh2020).forEach(e -> System.out.println(df.format(e) + " "));
        System.out.println("Daily lows: ");
        for(int i = 0; i<DailyLow2020.length; i++){
            System.out.println("Day " + (i+1) + ": " + df.format(DailyLow2020[i]));
        }
    }
    public static void insertIntoArray(int[] array, int insertIndex, int newValue){
        //move elements below insertion point.
        for(int i=array.length-1; i > insertIndex; i--){
            array[i] = array[i-1];
        }

        //insert new value
        array[insertIndex] = newValue;
    }
}