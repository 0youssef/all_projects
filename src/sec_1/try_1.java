package sec_1;//نستدعي مكتبة عشان نقدر ندخل متغيرات
import java.util.Arrays;
import java.util.Scanner;

public class try_1 {
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
         /*
        char grade;
         String message = "";
         grade=read.next().charAt(0);
         switch (grade){
             case 'a':message="excellent";
             break;
             case 'b':message="v good";
             break;
             case 'c':message="good";
             break;
         }
         System.out.print(message);

          boolean you=true;
          double sum=0.0,num=0.0;
          while(you==true){
              num=read.nextDouble();
              if(num<0)
                  you=false;
              else
                  sum+=num;
          }
          System.out.println(sum);


        int guess=0,rand;
        rand=(int)(Math.random()*100);
        System.out.println(rand);
        boolean play=true;
        while(play==true){
            System.out.println("guess the num");
            guess= read.nextInt();
            if(guess>rand)
                System.out.println("your num is big");
            else if (guess<rand)
                System.out.println("your num is small");
            else
            { System.out.println("you win");
                play=false;
            }
        }
        System.out.println(guess);

          */

        String[]
                days_names={"saturday \t ","sunday \t ","monday \t","tuesday \t","wednesday \t","thursday \t","friday \t "}
                ,months_names={"january","february","march","april","may","june","july","august","september","october","november","december"};
        /*
        for(int i=0;i<80;i++){
            System.out.print("_");
        }
        System.out.println();
        for(int x=0;x<7;x++){
            System.out.print(days_names[x]);
        }
        int days;
        int y = read.nextInt();

        if(y%4==0)
            days=366;
        else
            days=365;
       int[] num_of_days=new int[days];
       for(int i=0;i<=12;i++){
           if(i==0||i==2||i==4||i==6||i==7||i==9||i==11){
               int[] month_1=new int[30];
              // months_names[i]= new String.valueOf(new int[30]);
           }
           else if(i==1){
               if(y%4==0){
               int[] month_2=new int[28];}
               else{
               int[] month_2=new int[27];
               }
           }
           else {
               int[] month_3=new int[29];
           }

       }



        int x,y;
        x= read.nextInt();
        for(int i=1;i<=12;i++){
            System.out.println(months_names[i-1]+" "+x);
            System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ ");
            for(int l=0;l<=6;l++){
                System.out.print(" "+days_names[l]);
            }
            if (i==1||i==3||i==5||i==7||i==8||i==10||i==12){
                y=31;
            }
            else if (i==4||i==6||i==9||i==11){
                y=30;
            }
            else{
                if(x%4==0)
                y=29;
                else
                    y=28;
            }

            int k=0;
            for(int h=0;h<y;h++){
                k=h;
                if(k%7==0)
                System.out.println();
                System.out.print("\t "+(k+1)+"\t \t");
            }
            System.out.println();        }


    }/*

    public static void num_days_month(){
        for(int k=0;k<30;k++){
            if(k%7==0)
                System.out.println();
            System.out.print("\t "+(k+1)+"\t \t");

         */
        }

}

