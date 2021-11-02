package sec_3;
/*
* (The Location class) Design a class named Location for locating a maximal
value and its location in a two-dimensional array. The class contains public data
fields row, column, and maxValue that store the maximal value and its indices in
a two-dimensional array with row and column as int types and maxValue as a
double type.
Write the following method that returns the location of the largest element in a
two-dimensional array:
public static Location locateLargest(double[][] a)
The return value is an instance of Location. Write a test program that prompts
the user to enter a two-dimensional array and displays the location of the largest
element in the array. Here is a sample run:
* */
import java.util.Scanner;
public class p9_13 {
    public static void main(String[] args){
        Scanner p13=new Scanner(System.in);
        System.out.println("Enter thr num of rows and cols in the array");
        int r=p13.nextInt();
        int c=p13.nextInt();
        double[][] p=new double[r][c];
        location_P9_13 l2=new location_P9_13();
        for (int i1=0;i1<p.length;i1++){
            for(int i2=0;i2<p[0].length;i2++){
                p[i1][i2]= p13.nextDouble();
            }
        }
        location_P9_13.locateLargest(p);

    }
}
