/*
* Write a program that reads the integers between
1 and 50 and counts the occurrences of each. Assume the input ends with 0. Here
is a sample run of the program:*/


package sec_2;
import java.util.Scanner;

public class p7_3 {
public static void main(String[] args){
    Scanner occur =new Scanner(System.in);
    int control_num=1,i1=0,occurs_times=1,i4=0;
    int[] arr1=new int[51];
    System.out.println("Enter your numbers");
    for(i1=0;control_num!=0;i1++){
        control_num=occur.nextInt();
        if(control_num!=0)
        arr1[i1]=control_num;
    }
    System.out.println(i1-1);
    int[] arr2=new int[i1];
    for(int i2=0;i2<i1;i2++)
        arr2[i2] = arr1[i2];
    for(int i3=0;i3<arr2.length-1;i3++){
        occurs_times=0;
        for (i4=0;i4<arr2.length-1;i4++){
            if(arr2[i3]==arr2[i4])
                occurs_times++;
        }
        System.out.println(arr2[i3]+" ocuurs "+occurs_times+" times");
    }
}

}
