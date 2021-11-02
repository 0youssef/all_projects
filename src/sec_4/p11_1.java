package sec_4;
import java.util.Scanner;
public class p11_1 {
    public static void main(String[] args){
        Scanner regab=new Scanner(System.in);
        GeometricObject r1=new GeometricObject();
        Triangle r2=new Triangle();
        r2.side3=3;
        r2.side2=2;
        r2.side1=1;
        r2.setColor("blue");
        r2.setFilled(true);
        System.out.println(r1.toString()+"  "+r2.toString());

    }




}
