package sec_1;
import java.util.Scanner;
public class p_29_part_2 {
public static void main(String[] args){
    Scanner date =new Scanner(System.in);
    String[]
            days_names={"saturday \t ","sunday \t ","monday \t","tuesday \t","wednesday \t","thursday \t","friday \t "}
            ,months_names={"january","february","march","april","may","june","july","august","september","october","november","december"};
    int year=0,month=0,day=1;
    System.out.println("Enter the year");
    year=date.nextInt();
    System.out.println("Enter the month");
    month=date.nextInt();
    System.out.println(year+"  ,  "+months_names[month+1]);
    System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");
    // loop for display the days
    for(int i1=0;i1<7;i1++){
        System.out.print(" "+days_names[i1]);
    }
    System.out.println();
    if (month==1||month==3||month==5||month==7||month==8||month==10||month==12){day=31;}
    else if (month==4||month==6||month==9||month==11){day=30;}
    else{if(year%4==0)
        day=29;
    else
        day=28;}
    for(int i2=1;i2<=day;i2++){
        System.out.print("\t"+(i2)+"\t \t");
        if(i2%7==0)
            System.out.println();
        }
    }
}
