/*
(Display calendars) Write a program that prompts the user to enter the year and
first day of the year and displays the calendar table for the year on the console. For
example, if the user entered the year 2013, and 2 for Tuesday, January 1, 2013,
your program should display the calendar for each month in the year, as follows
*/
package sec_1;
import java.util.Scanner;
public class p_29 {
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        String[]
                days_names={"saturday \t ","sunday \t ","monday \t","tuesday \t","wednesday \t","thursday \t","friday \t "}
                ,months_names={"january","february","march","april","may","june","july","august","september","october","november","december"};

        int x,y,joo;
        x= read.nextInt();
        joo= read.nextInt();
        for(int i=1;i<=12;i++){
            System.out.println(months_names[i-1]+" "+x);
            System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ ");
            for(int l=0;l<=6;l++){
                System.out.print(" "+days_names[l]);
            }
            if (i==1||i==3||i==5||i==7||i==8||i==10||i==12){y=31;}
            else if (i==4||i==6||i==9||i==11){y=30;}
            else{if(x%4==0)
                    y=29;
                else
                    y=28;}
            int k=1;
            System.out.println();
            int n=1;
            int p=1;
            for(int i1=1;i1<=7;i1++){
                if(joo>i1&&i==1){
                    System.out.print("\t"+" "+"\t \t");
                }
                else {
                    for(int h=1;h<=y;h++){
                        System.out.print("\t "+(h)+"\t \t");
                        if((joo-1+h)%7==0 && i==1){
                            System.out.println();
                        }
                        if(h%7==0&&i>1){
                            System.out.println();
                        }

                        i1=8;
                    }
            }

            }
            System.out.println();}
    }
}
