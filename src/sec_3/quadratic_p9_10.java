package sec_3;

public class quadratic_p9_10 {
    static double q,r1,r2;
    private int a,b,c;
    quadratic_p9_10(int k,int l,int m){
        a=k;
        b=l;
        c=m;
    }

    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int getC() {
        return c;
    }
    public double getDiscriminant(){
        q=b*b-4*a*c;
        if(q<0)
            return 0;
        else
        return q;
    }
    public double getRoot1(){
        r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
        if((b*b-4*a*c)<0){
            System.out.println("not correct");
            return 0;
        }
        else
        return r1;
    }
    public double getRoot2(){
        r2=((-b-Math.sqrt(b*b-4*a*c))/(2*a));
        if((b*b-4*a*c)<0){
            System.out.println("not correct");
            return 0;
        }
        else
            return r2;


    }

}
