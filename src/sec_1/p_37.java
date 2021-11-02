package sec_1;/*
 (Decimal to binary) Write a program that prompts the user to enter a decimal
integer then displays its corresponding binary value. Don’t use Java’s Integer
.toBinaryString(int) in this program.
 **5.38 (Decimal to octal) Write a program that prompt
 */

import java.util.Scanner;
import java.util.SplittableRandom;

public class p_37 {
    public static void main(String[] args){
        Scanner bin_To_dec=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=bin_To_dec.nextInt();
        int k=num,p=0;
        for(p=0;k>0;p++){k=k/2;}
        int[] arr=new int[p];
        System.out.println(p);
        for( int i=p;num>=1;i--){
            if(num % 2 ==1)
                arr[i-1]=1;
            else
                arr[i-1]=0;
            num=num/2;
        }
        for(int u=0;u<p;u++) System.out.print(arr[u]);
    }
}
