package sec_2;
import java.util.Scanner;
public class try_1 {
    public static void main(String[] args) {
        Scanner try_1=new Scanner(System.in);
        /*
        methods.DrawLine();
        String s2= try_1.next();
        methods.DrawLine(s2);
        int n2=try_1.nextInt();
        methods.DrawLine(s2,n2);

        int x1=try_1.nextInt();
        int x2=try_1.nextInt();
        int x3=try_1.nextInt();
        //System.out.println(methods.summation(x1,x2,x3));
        methods.summation(x1,x2,x3);
        methods.summation(x1,x2);


        int x = try_1.nextInt();
        double[] mr=new double[x];
        methods.FullArray(mr);
        methods.PrintArray(mr);
        methods.SearchArray(mr,5);

         */
        methods r1=new methods();
        double x = try_1.nextDouble();
        double y = try_1.nextDouble();
        r1.setLength(x);
        r1.setWidth(y);
        r1.getLength();
        r1.getWidth();



    }
}
