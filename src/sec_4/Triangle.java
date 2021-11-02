package sec_4;

public class Triangle extends  GeometricObject{

    double side1,side2,side3;
public void Triangle(){
    side1=1.0;
    side2=1.0;
    side3=1.0;
}

    public void Triangle(double h,double k,double p){
        side1=h;
        side2=k;
        side3=p;
    }
public double getArea(){
double s=(side1+side2+side3)/2;
double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
return area;
}
public double getPerimeter(){
    return side1+side2+side3;
}
public String toString(){
    return "Triangle: side1 = " + side1 + " side2 = " + side2 +
            " side3 = " + side3;
}

}



