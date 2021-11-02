package sec_1;/*
(Display pyramid) Write a program that prompts the user to enter an integer from
1 to 15 and displays a pyramid,
 */

import java.util.Scanner;
public class p_17 {
    public static void main(String[] arg){
        Scanner pyramid=new Scanner(System.in);
        int x,y=0,z=0;
        System.out.println("Enter the number that you need");
        x=pyramid.nextInt();
        y=x;
        z=x;
        while(y>0){
            while (x>0){
                System.out.print("\t"+x);
                x-=1;
            }
            x=2;
            while(x>1 && x<=z){
                System.out.print("\t"+x);
                x+=1;
            }
            System.out.println("");
            y-=1;
            z-=1;
            x=y;
        }
    }
}
