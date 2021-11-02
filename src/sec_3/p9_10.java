package sec_3;
import java.util.Scanner;
public class p9_10 {
    public static void main(String[] args){
        Scanner p9_10 =new Scanner(System.in);
        int r;
        int a,b,c;
        a= p9_10.nextInt();
        b= p9_10.nextInt();
        c= p9_10.nextInt();

        /*
        do{

             a= p9_10.nextInt();
             b= p9_10.nextInt();
             c= p9_10.nextInt();
             r=b*b-4*a*c;
        }while(r<0); */
        quadratic_p9_10 q=new quadratic_p9_10(a,b,c);
        System.out.println("root num 1   "+q.getRoot1());
        System.out.println("root num 2   "+q.getRoot2());
        System.out.println("Discriminant   "+q.getDiscriminant());

    }
}
