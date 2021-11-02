package sec_2;
import java.util.Scanner;
public class methods {
    static Scanner ar=new Scanner(System.in);
    public static void main(String[] args) {

    }
    public static void DrawLine(){
        for(int i1=0;i1<10;i1++)
            System.out.print("ـ");
        System.out.println();
    }
    public static void DrawLine(String s1){
        for(int i1=0;i1<10;i1++)
            System.out.print(s1);
        System.out.println();
    }
    public static void DrawLine(String s1,int n1){
        for(int i1=0;i1<=n1;i1++)
            System.out.print(s1);
        System.out.println();
    }
    public static int summation(int n1, int n2, int n3){
        System.out.println(n1+n2+n3);
        return n1+n2+n3;
    }
    public static double summation(int n1,double n2){
        System.out.println(n1+n2);
        return n1+n2;
    }
    public static void FullArray(double[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the elements num "+(i+1));
            arr[i]=ar.nextDouble();
        }
    }
    public static void PrintArray(double[] pr){
        for(int i=0;i<pr.length;i++){
            System.out.print(pr[i] +" ");
        }
        System.out.println();
    }
    public static int SearchArray(double[] dr,int find){
        for(int index=0;index<dr.length;index++){
            if(dr[index]==find){
                System.out.println("the items num"+(index+1));
                return index;
            }

        }
        return -1;
    }

     private double length,width;
    public void setWidth(double w){
        width=w;
    }
    public void setLength(double l){
        length=l;
    }
    public void getLength(){
        System.out.println(length);
    }

    public void getWidth(){
        System.out.println(width);
    }

public static class p7{
    static int num=0;
    public static int FullArray(int[] list){
        for(int i1=0;i1<10;i1++){
            num=ar.nextInt();
            list[i1]=num;
        }
        int count =0;
        for(int k=0;k<list.length;k++){
            for(int h=0;h<list.length;h++){
                if(list[k]==list[h]){
                    count++;
                }
            }
        }
        return count;
         }

}
}
