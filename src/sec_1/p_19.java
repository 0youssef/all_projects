package sec_1;/*
(Display numbers in a pyramid pattern) Write a nested for loop that prints the
        following output
*/

import java.util.Scanner;
public class p_19 {
    public static void main(String[] args){
        Scanner loop=new Scanner(System.in);
        int row=7,num,counter=1;
        System.out.println("enter your number ");
        num=loop.nextInt();
        for(int i=1;i<=row;i++){
            for(int distance=1;distance<=row-i;++distance){
                System.out.print("\t");
            }
            int n=1;
            counter=1;
            for(int k=1;k<=2*i-1;k++){
                    System.out.print("\t"+n);
                    if(counter<i){
                        n=n*num;
                    }
                    else if(counter>=i){
                        n=n/num;
                    }
                    counter++;
            }
            System.out.println();
        }

    }
}
