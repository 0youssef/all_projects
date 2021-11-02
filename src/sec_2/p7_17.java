/*
* Write a program that prompts the user to enter the number of students, the students’ names, and their scores and prints student names in decreasing
order of their scores. Assume the name is a string without spaces, use the Scanner’s next() method to read a name.*/

package sec_2;
import java.util.Scanner;
public class p7_17 {
    public static void main(String[] args){
        Scanner student =new Scanner(System.in);
        String name="";int grades =0,y=0;
        System.out.println("pls enter the num of students");
        int num_of_stu=student.nextInt();
        String[] Stu_names=new String[num_of_stu];
        int [] Stu_scores=new int[num_of_stu];
        System.out.println(Stu_names.length);
        for (int i1=0;i1<Stu_names.length;i1++){
            System.out.println("Enter the name of the stu num "+(i1+1));
            name=student.next();
            Stu_names[i1]=name;
            System.out.println("Enter the score of the stu num "+(i1+1));
            grades=student.nextInt();
            Stu_scores[i1]=grades;
        }
        int[] new_scores=new int[num_of_stu];
       // new_scores[0]=0;
        for(int i2=0;i2<Stu_scores.length;i2++){
            for(int i3=0;i3<Stu_scores.length;i3++){
                if(new_scores[i2]<=Stu_scores[i3]){
                    new_scores[i2]=Stu_scores[i3];
                     y=i3;
                }
            }
            System.out.println("num "+(i2+1)+" is "+Stu_names[y]+"  "+new_scores[i2]);
            Stu_scores[y]=-1;
        }
    }
}
