package sec_3;
//this for p9_13
public class location_P9_13 {
    public static int row,col;
    public static double maxValue=0;
    public static void locateLargest(double[][] a) {
        for (int i1 = 0; i1 < a.length; i1++) {
            for (int i2=0;i2<a[0].length;i2++){
                if(a[i1][i2]>maxValue){
                    maxValue=a[i1][i2];
                    row=i1;
                    col=i2;
                }
            }
           }
        System.out.println("max value is "+ maxValue);
        System.out.println("it's location is row num "+row+" columns num "+col);

    }

}
