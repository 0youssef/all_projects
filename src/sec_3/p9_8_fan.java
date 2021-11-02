package sec_3;

public class p9_8_fan {
    public static final int fast=3;
    public static final int medium=2;
    public static final int slow=1;
    private int speed=0;
    private boolean on =false;
    private double radius=5;
    private String color="blue";

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public boolean isOn() {
        return on;
    }
    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public p9_8_fan(){
        speed=slow;
        on=false;
        color="blue";
        radius=5;
    }

}
